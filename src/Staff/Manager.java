package Staff;

public class Manager extends Staff {
	private String passwordString;

	public Manager() {
		super();
		jobType = "Manager";
	}
	
	public Manager(String password) {
		super();
		this.passwordString = password;
	}

	public String getPasswordString() {
		return passwordString;
	}
	@Override
	public void jobDescription() {
		System.out.println("Quản lý nhân viên");
	}
}
