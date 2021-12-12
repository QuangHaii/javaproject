package App;

import java.util.Scanner;

import Order.OrderDetails;
import Order.Tax;
import Product.Product;
import App.QuanLySanPham;

public class DonMuaHang implements Tax{
	private OrderDetails orderlist[] = new OrderDetails[99];
	private QuanLySanPham productlist = new QuanLySanPham();
	private Product products[] = new Product[99];
	private static int n = 0;

	public void order() {
		int choice;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("----------Đặt hàng-----------");
			System.out.println("1.Thêm món ăn");
			System.out.println("2.Xóa món ăn");
			System.out.println("3.Thanh toán");
			System.out.println("4.Thoát");
			choice = Integer.parseInt(scanner.nextLine());

			switch (choice) {
			case 1: {
				orderlist = addItem();
				break;
			}
			case 2: {
				orderlist = deleteItem();
				break;
			}
			case 3:{
				System.out.println("Tổng số tiền phải thanh toán: "+calcTotal());
			}
			case 4:
				break;
			default:
				throw new IllegalArgumentException("Nhập sai! Nhập lại");
			}
		} while (choice != 4);

	}

	private OrderDetails[] addItem() {
		products = productlist.getProduct();
		if(products==null) return null;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập mã đơn hàng: ");
		int id = Integer.parseInt(scanner.nextLine());
		System.out.println("Nhập mã sản phẩm muốn thêm: ");
		int productID = Integer.parseInt(scanner.nextLine());
		Product p =null;
		for(int i = 0;i<products.length;i++)
			if(products[i].getProductID()==productID)
				p=products[i];
		if(p==null) {
			System.out.println("Nhập sai mã sản phẩm");
			return null;
		}
		System.out.println("Nhập số lượng: ");
		int quantity = Integer.parseInt(scanner.nextLine());
		OrderDetails newArr[] = new OrderDetails[n + 1];
		for (int i = 0; i < n; i++)
			newArr[i] = orderlist[i];
		newArr[n] = new OrderDetails();
		newArr[n].setOrderID(id);
		newArr[n].setProductID(productID);
		newArr[n].setQuantity(quantity);
		newArr[n].setPrice(p.getPrice());
		n++;
		return newArr;
	}

	private OrderDetails[] deleteItem() {
		System.out.println("Nhập mã đơn hàng cần xóa");
		int temp = Integer.parseInt(new Scanner(System.in).nextLine());
		int j = -1;
		for (int i = 0; i < n; i++)
			if (orderlist[i].getOrderID() == temp)
				j = i;
		if (orderlist == null || j == -1) {
			System.out.println("Không tìm thấy đơn hàng cần xóa");
			return null;
		}
		OrderDetails[] newArr = new OrderDetails[n - 1];
		for (int i = 0, k = 0; i < n; i++) {
			if (i == j)
				continue;
			newArr[k++] = orderlist[i];
		}
		n--;
		return newArr;
	}

	@Override
	public float calcTax(float x) {
		return x*tax;
	}
	
	private float calcTotal() {
		float sum=0;
		for(int i=0;i<n;i++)
			sum+=orderlist[i].getPrice()*orderlist[i].getQuantity();
		return sum+calcTax(sum);
	}

	
}
