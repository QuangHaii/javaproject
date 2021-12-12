package Product;

import java.util.Scanner;

public abstract class Product {
	private int productID;
	private int amount;
	private int importDate;
	private int price;
	
	public Product() {
		
	}

	public Product(int amount, int importDate, int productID,int price) {
		this.amount = amount;
		this.importDate = importDate;
		this.productID = productID;
		this.price = price;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getImportDate() {
		return importDate;
	}

	public void setImportDate(int importDate) {
		this.importDate = importDate;
	}
	
	public int getproductID() {
		return productID;
	}

	public void setProductID(int productID) {
		this.productID = productID;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getProductID() {
		return productID;
	}

	public void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập số lượng hàng hóa: ");
		amount=Integer.parseInt(scanner.nextLine());
		System.out.println("Nhập ngày nhập hàng: ");
		importDate=Integer.parseInt(scanner.nextLine());
		System.out.println("Nhập mã hàng hóa: ");
		productID=Integer.parseInt(scanner.nextLine());
		System.out.println("Nhập giá tiền: ");
		price=Integer.parseInt(scanner.nextLine());
	}
	
	@Override
	public String toString() {
		return "Số lượng hàng hóa: "+amount+"|Ngày nhập hàng: "+importDate+"|Mã sản phẩm: "+productID+"|Giá tiền: "+price;
	}
	
	public void output() {
		System.out.println(toString());
	}
}
