package App;

import java.util.Scanner;

import Customer.Customer;
import Payment.*;

public class App {
	private static QuanLyNhanVien dsNhanVien = new QuanLyNhanVien();
	private static QuanLyKhachHang dsKhachHang = new QuanLyKhachHang();
	private static QuanLySanPham dsSanPham = new QuanLySanPham();
	private static DonMuaHang dsMuaHang = new DonMuaHang();

	public static void menu() {
		System.out.println("------------------Danh sách mục------------------------");
		System.out.println("1.Khách hàng");
		System.out.println("2.Nhân viên");
		System.out.println("3.Sản phẩm");
		System.out.println("4.Đặt hàng");
		System.out.println("5.Thanh toán");
		System.out.println("6.Thoát");
		System.out.println("Mời bạn chọn mục:");
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int key;
		do {
			menu();
			key = Integer.parseInt(scanner.nextLine());
			switch (key) {
			case 1: {
				dsKhachHang.edit();
				break;
			}
			case 2: {
				dsNhanVien.edit();
				break;
			}
			case 3: {
				dsSanPham.edit();
				break;
			}
			case 4: {
				dsMuaHang.order();
				break;
			}
			case 5: {
				Customer temp = null;
				do {
					temp = dsKhachHang.searchCustomer();
					if(temp==null)
						System.out.println("Không tìm thấy khách hàng! Mời nhập lại");
				} while (temp==null);
				Payment payment = new Cash();
				payment.setMoneyammount(dsMuaHang.calcTotal()-temp.getDiscount()*dsMuaHang.calcTotal());
				payment.input();
				payment.output();
			}
			case 6:
				break;
			default:
				System.out.println("Nhập sai! Nhập lại");
			}
		} while (key != 6);
		System.out.println("Cảm ơn bạn đã sử dụng!");
	}
}
