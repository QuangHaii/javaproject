package Product;

import java.util.Scanner;

public class Drink extends Product {
	private String drinkName;
	private String drinkDescription;
	
	public Drink() {
		
	}

	public Drink(String drinkName, String drinkDescription) {
		super();
		this.drinkName = drinkName;
		this.drinkDescription = drinkDescription;
	}

	public String getdrinkName() {
		return drinkName;
	}

	public void setdrinkName(String drinkName) {
		this.drinkName = drinkName;
	}

	public String getdrinkDescription() {
		return drinkDescription;
	}

	public void setdrinkDescription(String drinkDescription) {
		this.drinkDescription = drinkDescription;
	}
	
	@Override
	public void input() {
		super.input();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập tên đồ uống: ");
		drinkName=scanner.nextLine();
		System.out.println("Nhập miêu tả đồ uống: ");
		drinkDescription=scanner.nextLine();
	}
	
	@Override
	public String toString() {
		return super.toString()+"Tên đồ uống: "+drinkName+"|Miêu tả: "+drinkDescription;
	}
	
	public void output() {
		System.out.println(toString());
	}
}
