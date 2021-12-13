package App;

import java.util.Scanner;
import Payment.*;

public class App {

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
		QuanLyNhanVien dsNhanVien = new QuanLyNhanVien();
		QuanLyKhachHang dsKhachHang = new QuanLyKhachHang();
		QuanLySanPham dsSanPham = new QuanLySanPham();
		DonMuaHang dsMuaHang = new DonMuaHang();
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
				int func, flag=0;
				do {
					System.out.println("Chọn phương thức thanh toán");
					System.out.println("1.Thẻ ngân hàng");
					System.out.println("2.Điện thoại");
					System.out.println("3.Tiền mặt");
					System.out.println("Mời bạn chọn:");
					func = Integer.parseInt(scanner.nextLine());
					if (func == 1 || func == 2 || func == 3)
						flag = 1;
					else
						System.out.println("Nhập sai! Nhập lại");
				} while (flag == 0);
				Payment payment = null;
				switch (func) {
				case 1: {
					payment = new CreditCard();
					break;
				}
				case 2: {
					payment = new MobileBanking();
					break;
				}
				case 3: {
					payment = new Cash();
					break;
				}
				}
				payment.setMoneyammount(dsMuaHang.calcTotal());
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
