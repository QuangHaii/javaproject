package Customer;

public class VIPCustomer extends Customer{
	private double discount = 0.2;
	
	public VIPCustomer() {
		super();
		customerType = "VIP";
		discount = 0.3;
	}

	public VIPCustomer(double discount) {
		super();
		this.discount = discount;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}
	
	@Override
	public String toString() {
		return super.toString()+"|Khách hàng VIP";
	}
	
	@Override
	public void output() {
		System.out.println(toString());
	}
}
