package Customer;

import java.util.Scanner;

public class Customer {
	private String name;
	private int customerID;
	private int age;
	private String phonenumber;
	
	public Customer() {
		
	}

	public Customer(String name, int customerID, int age, String phonenumber) {
		super();
		this.name = name;
		this.customerID = customerID;
		this.age = age;
		this.phonenumber = phonenumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	
	public void input() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Nhập tên khách hàng: ");
		name=scanner.nextLine();
		System.out.println("Nhập mã khách hàng: ");
		customerID=Integer.parseInt(scanner.nextLine());
		System.out.println("Nhập tuổi khách hàng: ");
		age=Integer.parseInt(scanner.nextLine());
		System.out.println("Nhập số điện thoại: ");
		phonenumber=scanner.nextLine();
	}
	
	@Override
	public String toString() {
		return "Tên khách hàng: "+name+"|Mã khách hàng: "+customerID+"|Tuổi: "+age+"|SĐT: "+phonenumber;
	}
	
	public void output() {
		System.out.println(toString());
	}
}
