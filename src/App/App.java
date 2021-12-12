package App;

import java.util.Scanner;

public class App {

	public static void menu() {
		System.out.println("------------------Danh sách mục------------------------");
		System.out.println("1.Khách hàng");
		System.out.println("2.Nhân viên");
		System.out.println("3.Sản phẩm");
		System.out.println("4.Đặt hàng");
		System.out.println("5.Thoát");
		System.out.println("Mời bạn chọn mục:");
	}

	public static void main(String[] args) {
		QuanLyNhanVien dsNhanVien = new QuanLyNhanVien();
		QuanLyKhachHang dsKhachHang = new QuanLyKhachHang();
		QuanLySanPham dsSanPham = new QuanLySanPham();
		DonMuaHang dsMuaHang = new DonMuaHang();
		Scanner scanner = new Scanner(System.in);
		int key, func;
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
			case 5:
				break;
			default:
				throw new IllegalArgumentException("Nhập sai! Nhập lại");
			}
		} while (key != 6);
		System.out.println("Bye bye!");
	}
}
