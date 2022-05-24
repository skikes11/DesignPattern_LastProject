import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Brige_Pattern.*;
import Controller.*;
import Factory_Pattern.*;
import Model.*;
public class Client {
	static ThemSinhVien themSinhVien = new ThemSinhVien();
	static DanhSachSinhVien dssv = new DanhSachSinhVien();
	static InDanhSachSinhVien dssvPrinter = new InDanhSachSinhVien();
	static XoaSinhVien xoaSinhVien = new XoaSinhVien();
	static SoLuongSinhVien soLuongSinhVien = new SoLuongSinhVien();
	static TimSinhVien timSinhVien = new TimSinhVien();
	static XoaDuLieuDSSV xoaDuLieuDSSV = new XoaDuLieuDSSV();
	static SapXepSinhVienTheoGPA sapXepSinhVienTheoGPA = new SapXepSinhVienTheoGPA();
	static SinhVienFactory sinhVienFactory = new SinhVienFactory();
	
	
	public static void main(String[] args) {
		
		//Factory
		dssv.danhsach.add(SinhVienFactory.getSinhVien("19110232", "Dinh Bao Long", 8.6, "Khoa CNTT", "K19", 0));
		dssv.danhsach.add(SinhVienFactory.getSinhVien("20110312", "Dinh Bao Hoang", 6.6, "Khoa CNTT", "K20", 0));
		dssv.danhsach.add(SinhVienFactory.getSinhVien("17110232", "Nguyen Nhat Le", 7.4, "Khoa CNTT", "K17", 0));
		dssv.danhsach.add(SinhVienFactory.getSinhVien("17110232", "Nguyen Hai Dang", 5.6, "Khoa NNA", "K17", 0));
		
		// test Brige Pattern
		SinhVien sVienCLC = new SinhVien(new SinhVienCLC(),"19110232", "Dinh Bao Long", 8.6, "Khoa CNTT", "K19", null);
		System.out.print( sVienCLC.DongHocPhi(20)+" VND "+  "---");
		SinhVien sVienDaiTra = new SinhVien(new SinhVienDaiTra(),"19110232", "Dinh Bao Hoang", 8.6, "Khoa CNTT", "K19", null);
		System.out.println( sVienDaiTra.DongHocPhi(20)+" VND");
		
		Scanner sc = new Scanner(System.in);
		int option;
		do {
			
		 
		System.out.println("--------------------MENU------------------");
		System.out.println("VUI LÒNG CHỌN CHỨC NĂNG");
		System.out.println("0. THOÁT KHỎI CHƯƠNG TRÌNH\n"
			+"1. IN DANH SÁCH SINH VIÊN\n"
			+"2. THÊM SINH VIÊN\n"
			+"3. XÓA SINH VIÊN\n"
			+"4. KIỂM TRA SỐ LƯỢNG SINH VIÊN TRONG DANH SÁCH\n"
			+"5. TÌM KIẾM SINH VIÊN DỰA TRÊN MÃ SINH VIÊN\n"
			+"6. XÓA TẤT CẢ DỮ LIỆU TRONG DANH SÁCH SINH VIÊN\n"
			+"7. SẮP XẾP VÀ IN RA DANH SÁCH SINH VIÊN ĐƯỢC SẮP XẾP THEO ĐIỂM GPA TỪ CAO XUỐNG THẤP\n"
				);
		
		option = sc.nextInt();
			
			switch (option) {
			case 0: {				
				break;
			}
			case 1:{
				dssvPrinter.InDanhSach(dssv);
			
				break;
			}
			case 2:{
				themSinhVien.themSinhVien(dssv);
			
				break;
			}
			case 3:{
				xoaSinhVien.XoaSVThongQuaMSSV(dssv);
			
				break;
			}
			case 4:{
				soLuongSinhVien.LaySoLuongSV(dssv);
			
				break;
			}
			case 5:{
				timSinhVien.TimSVThongQuaMSSV(dssv);
				
				break;
			}
			case 6:{
				xoaDuLieuDSSV.XoaDuLieuDanhSach(dssv);
				
				break;
			}
			case 7:{
				sapXepSinhVienTheoGPA.SapXepSinhVienTheoGPA_HightoLow(dssv);
				
				break;
			}
						
			default:
				System.out.println("LỰA CHỌN KHÔNG PHÙ HỢP VUI LÒNG CHỌN LẠI");
				break;
			}
		
		} while(option!=0);
		
		sc.close();
		
	}
       
    }
	
	

	
