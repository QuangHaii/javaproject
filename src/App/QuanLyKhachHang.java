package App;

import java.util.Scanner;
import Customer.Customer;
import Customer.NormalCustomer;
import Customer.VIPCustomer;

@SuppressWarnings("resource")
public class QuanLyKhachHang {
	private static int n = 0;
	private Customer[] customers = new Customer[99];

	public void edit() {
		Scanner scanner = new Scanner(System.in);
		int choice;
		do {
			System.out.println("(------------------Danh sách chức năng------------------------)");
			System.out.println("1.Thêm khách hàng");
			System.out.println("2.Xóa khách hàng");
			System.out.println("3.Chỉnh sửa khách hàng");
			System.out.println("4.Tìm kiếm khách hàng");
			System.out.println("5.Thoát");
			System.out.println("Mời bạn chọn chức năng:");
			choice = scanner.nextInt();

			switch (choice) {
			case 1: {
				customers = addCustomer();
				break;
			}
			case 2: {
				customers = deleteCustomer();
				break;
			}
			case 3: {
				editCustomer();
				break;
			}
			case 4: {
				if (searchCustomer()==null)
					System.out.println("Không tìm thấy khách hàng");
				else searchCustomer().output();		
				break;
			}
			case 5: {
				break;
			}
			default:
				System.out.println("Nhập sai! Nhập lại");
			}
		} while (choice != 5);
	}

	private Customer[] addCustomer() {
		int key, flag = 0;
		Customer newArr[] = new Customer[n + 1];
		for (int i = 0; i < n; i++)
			newArr[i] = customers[i];
		do {
			System.out.println("Chọn loại khách hàng:");
			System.out.println("1.Khách hàng VIP");
			System.out.println("2.Khách hàng thường");
			System.out.println("3.Khách hàng vãng lai");
			key = Integer.parseInt(new Scanner(System.in).nextLine());
			if (key == 1 || key == 2 || key == 3)
				flag = 1;
			else
				System.out.println("Nhập sai! Nhập lại");
		} while (flag == 0);
		switch (key) {
		case 1: {
			customers[n] = new VIPCustomer();
			break;
		}
		case 2: {
			customers[n] = new NormalCustomer();
			break;
		}
		case 3: {
			customers[n] = new Customer();
			break;
		}
		}
		customers[n].input();
		n++;
		return newArr;
	}

	private Customer[] deleteCustomer() {
		customerList(customers);
		System.out.println("Nhập mã khách hàng cần xóa: ");
		int temp = Integer.parseInt(new Scanner(System.in).nextLine());
		int j = -1;
		for (int i = 0; i < n; i++)
			if (customers[i].getCustomerID() == temp)
				j = i;
		if (customers == null || j == -1) {
			System.out.println("Không tìm thấy khách hàng cần xóa");
			return customers;
		}
		Customer[] newArr = new Customer[n - 1];
		for (int i = 0, k = 0; i < n; i++) {
			if (i == j)
				continue;
			newArr[k++] = customers[i];
		}
		n--;
		return newArr;
	}

	private void editCustomer() {
		customerList(customers);
		System.out.println("Nhập mã khách hàng cần sửa: ");
		int temp = Integer.parseInt(new Scanner(System.in).nextLine());
		int j = -1;
		for (int i = 0; i < n; i++)
			if (customers[i].getCustomerID() == temp)
				j = i;
		if (j == -1)
			System.out.println("Không tìm thấy khách hàng");
		else
			customers[j].input();
	}

	public Customer searchCustomer() {
		System.out.println("Nhập mã khách hàng cần tìm: ");
		int temp = Integer.parseInt(new Scanner(System.in).nextLine());
		int j = -1;
		for (int i = 0; i < n; i++)
			if (customers[i].getCustomerID() == temp)
				j = i;
		if (j == -1)
			return null;
		else
			return customers[j];
	}

	private void customerList(Customer[] c) {
		System.out.println("-------Danh sách khách hàng------");
		for (int i = 0; i < c.length; i++) {
			System.out.printf((i + 1) + ".");
			c[i].output();
		}

	}
}
