package Payment;

import java.util.Scanner;

public class MobileBanking extends Payment {
	private String name;
	private int phoneNumber;
	private float phoneMoney;

	public MobileBanking() {
		super();
		paymentType="Điện thoại";
	}

	public MobileBanking(String name, int phoneNumber, float phoneMoney) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.phoneMoney = phoneMoney;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public float getPhoneMoney() {
		return phoneMoney;
	}

	public void setPhoneMoney(float phoneMoney) {
		this.phoneMoney = phoneMoney;
	}

	@SuppressWarnings("resource")
	public void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập tên chủ SĐT: ");
		name = scanner.nextLine();
		System.out.println("Nhập số điện thoại: ");
		phoneNumber = Integer.parseInt(scanner.nextLine());
		System.out.println("Nhập số dư: ");
		phoneMoney = Float.parseFloat(scanner.nextLine());
	}

	@Override
	public double authorized() {
		return phoneMoney - getMoneyammount();
	}

	@Override
	public String toString() {
		return "Chủ SĐT: " + name + "|Số điện thoại: " + phoneNumber + "|Số dư cũ: " + phoneMoney + "|Số dư mới: "
				+ authorized();
	}

	@Override
	public void output() {
		if (authorized() < 0)
			System.out.println("Không đủ tiền");
		else
			System.out.println(toString());
	}
}
