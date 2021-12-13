package Customer;

public class CustomerVIP extends Customer{
	private int point;
	private int tier;
	private double discount;
	
	public CustomerVIP() {
		super();
	}

	public CustomerVIP(int point, int tier, double discount) {
		super();
		this.point = point;
		this.tier = tier;
		this.discount = discount;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public int getTier() {
		return tier;
	}

	public void setTier(int tier) {
		this.tier = tier;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}
	
	
}
