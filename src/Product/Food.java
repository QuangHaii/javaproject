package Product;

import java.util.Scanner;

public class Food extends Product {
	private String foodName;
	private String foodDescription;
	
	public Food() {
		
	}

	public Food(String foodName, int foodPrice, String foodDescription) {
		super();
		this.foodName = foodName;
		this.foodDescription = foodDescription;
	}

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public String getFoodDescription() {
		return foodDescription;
	}

	public void setFoodDescription(String foodDescription) {
		this.foodDescription = foodDescription;
	}
	
	@Override
	public void input() {
		super.input();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập tên món ăn: ");
		foodName=scanner.nextLine();
		System.out.println("Nhập miêu tả món ăn: ");
		foodDescription=scanner.nextLine();
	}
	
	@Override
	public String toString() {
		return super.toString()+"Tên món ăn: "+foodName+"|Miêu tả: "+foodDescription;
	}
	
	public void output() {
		System.out.println(toString());
	}
}
