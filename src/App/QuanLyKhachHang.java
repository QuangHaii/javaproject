package App;

import java.util.Scanner;
import Customer.Customer;

public class QuanLyKhachHang {
	private static int n=0;
	private Customer[] customers = new Customer[99];
	
	public void edit() {
		Scanner scanner=new Scanner(System.in);
		int choice;
		do {
			System.out.println("(------------------Danh sách chức năng------------------------)");
			System.out.println("1.Thêm khách hàng");
			System.out.println("2.Xóa khách hàng");
			System.out.println("3.Chỉnh sửa khách hàng");
			System.out.println("4.Tìm kiếm khách hàng");
			System.out.println("5.Thoát");
			System.out.println("Mời bạn chọn chức năng:");
			choice = scanner.nextInt();

			switch (choice) {
			case 1: {
				customers = addCustomer();
				break;
			}
			case 2: {
				customers=deleteCustomer();
				break;
			}
			case 3: {
				editCustomer();
				break;
			}
			case 4: {
				searchCustomer();
				break;
			}
			case 5: {
				break;
			}
			default:
				throw new IllegalArgumentException("Nhập sai! Nhập lại");
			}
		} while (choice!=5);
	}
	
	private Customer[] addCustomer() {
		Customer newArr[] = new Customer[n+1];
		for(int i=0;i<n;i++)
			newArr[i]=customers[i];
		newArr[n].input();
		n++;
		return newArr;
	}
	
	private Customer[] deleteCustomer() {
		System.out.println("Nhập mã khách hàng cần xóa: ");
		int temp = Integer.parseInt(new Scanner(System.in).nextLine());
		int j = -1;
		for (int i = 0; i < n; i++)
			if (customers[i].getCustomerID() == temp)
				j = i;
		if (customers == null || j == -1) {
			System.out.println("Không có phần tử để xóa");
			return null;
		}
		Customer[] newArr = new Customer[n - 1];
		for (int i = 0, k = 0; i < n; i++) {
			if (i == j)
				continue;
			newArr[k++] = customers[i];
		}
		n--;
		return newArr;
	}
	
	private void editCustomer() {
		System.out.println("Nhập mã khách hàng cần sửa: ");
		int temp = Integer.parseInt(new Scanner(System.in).nextLine());
		int j = -1;
		for (int i = 0; i < n; i++)
			if (customers[i].getCustomerID() == temp)
				j = i;
		if (j == -1)
			System.out.println("Không tìm thấy khách hàng");
		else
			customers[j].input();
	}
	
	private void searchCustomer() {
		System.out.println("Nhập mã khách hàng cần tìm: ");
		int temp = Integer.parseInt(new Scanner(System.in).nextLine());
		int j = -1;
		for (int i = 0; i < n; i++)
			if (customers[i].getCustomerID() == temp)
				j = i;
		if (j == -1)
			System.out.println("Không tìm thấy khách hàng");
		else customers[j].output();
	}
}
