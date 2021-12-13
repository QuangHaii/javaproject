package Payment;

import java.util.Scanner;

public class CreditCard extends Payment {
	private String cardOwner;
	private int cardID;
	private float cardMoney;

	public CreditCard() {
		super();
		paymentType = "Credit Card";
	}

	public CreditCard(String cardOwner, int cardID, float cardMoney) {
		super();
		this.cardOwner = cardOwner;
		this.cardID = cardID;
		this.cardMoney = cardMoney;
	}

	public String getcardOwner() {
		return cardOwner;
	}

	public void setcardOwner(String cardOwner) {
		this.cardOwner = cardOwner;
	}

	public int getCardID() {
		return cardID;
	}

	public void setCardID(int cardID) {
		this.cardID = cardID;
	}

	public float getCardMoney() {
		return cardMoney;
	}

	public void setCardMoney(float cardMoney) {
		this.cardMoney = cardMoney;
	}

	@SuppressWarnings("resource")
	public void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập tên chủ thẻ: ");
		cardOwner = scanner.nextLine();
		System.out.println("Nhập số tài khoản: ");
		cardID = Integer.parseInt(scanner.nextLine());
		System.out.println("Nhập số dư: ");
		cardMoney = Float.parseFloat(scanner.nextLine());
	}

	@Override
	public double authorized() {
		return cardMoney - getMoneyammount();
	}

	@Override
	public String toString() {
		return "Chủ thẻ: " + cardOwner + "|Số tài khoản: " + cardID + "|Số dư cũ: " + cardMoney + "|Số dư mới: "
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
