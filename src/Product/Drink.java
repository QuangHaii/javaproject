package Product;

import java.util.Scanner;

public class Drink extends Product {
	private String drinkType;
	private int inStock;
	
	public Drink() {
		super();
		productType="Drink";
	}
	
	public Drink(String drinkType, int inStock) {
		super();
		this.drinkType = drinkType;
		this.inStock = inStock;
	}

	public String getdrinkType() {
		return drinkType;
	}

	public void setdrinkType(String drinkType) {
		this.drinkType = drinkType;
	}

	public int getInStock() {
		return inStock;
	}

	public void setInStock(int inStock) {
		this.inStock = inStock;
	}

	@SuppressWarnings("resource")
	@Override
	public void input() {
		super.input();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập loại đồ uống: ");
		drinkType=scanner.nextLine();
		System.out.println("Nhập số lượng tồn kho: ");
		inStock=Integer.parseInt(scanner.nextLine());
	}
	
	@Override
	public String toString() {
		return super.toString()+"|Loại đồ uống: "+drinkType+"|Tồn kho: "+inStock;
	}
	
	public void output() {
		System.out.println(toString());
	}
}
