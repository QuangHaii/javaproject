package Payment;

import App.DonMuaHang;

public abstract class Payment {
	protected float moneyammount;
	protected String paymentType;
	private DonMuaHang order = new DonMuaHang();
	
	public Payment() {
		
	}

	public Payment(float moneyammount,String paymentType) {
		this.moneyammount = moneyammount;
		this.paymentType = paymentType;
	}

	public double getMoneyammount() {
		return moneyammount;
	}

	public void setMoneyammount(float moneyammount) {	
		this.moneyammount = moneyammount;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	
	public void payammount() {
		setMoneyammount(order.totalmoney);
	}

	public abstract double authorized();
	
	public abstract void output();

	public abstract void input();
}
