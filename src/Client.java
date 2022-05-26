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
	static DanhSachMonHoc dsmh = new DanhSachMonHoc();
	static InDanhSachSinhVien dssvPrinter = new InDanhSachSinhVien();
	static XoaSinhVien xoaSinhVien = new XoaSinhVien();
	static SoLuongSinhVien soLuongSinhVien = new SoLuongSinhVien();
	static TimSinhVien timSinhVien = new TimSinhVien();
	static XoaDuLieuDSSV xoaDuLieuDSSV = new XoaDuLieuDSSV();
	static SapXepSinhVienTheoGPA sapXepSinhVienTheoGPA = new SapXepSinhVienTheoGPA();
	static SinhVienFactory sinhVienFactory = new SinhVienFactory();
	static InDanhSachMonHoc dsmhPrinter = new InDanhSachMonHoc();
	static DangKiMonHocChoSinhVien dangKiMonHocChoSinhVien = new DangKiMonHocChoSinhVien();
	static DanhSachMonHocSVDangKi danhSachMonHocSVDangKi = new DanhSachMonHocSVDangKi();
	public static void main(String[] args) {
		
		//Sinh Vien Database
		dssv.danhsach.add(SinhVienFactory.getSinhVien("19110232", "Dinh Bao Long", 8.6, "Khoa CNTT", "K19", 2));
		dssv.danhsach.add(SinhVienFactory.getSinhVien("20110312", "Dinh Bao Hoang", 6.6, "Khoa CNTT", "K20", 0));
		dssv.danhsach.add(SinhVienFactory.getSinhVien("17110232", "Nguyen Nhat Le", 7.4, "Khoa CNTT", "K17", 2));
		dssv.danhsach.add(SinhVienFactory.getSinhVien("17110232", "Nguyen Hai Dang", 5.6, "Khoa NNA", "K17", 0));
		dssv.danhsach.add(SinhVienFactory.getSinhVien("19113333", "Le Thanh Trung", 6.6, "Khoa CNTT", "K19", 2));
		dssv.danhsach.add(SinhVienFactory.getSinhVien("19110303", "Dinh Thanh Hai", 8.9, "Khoa CNTT", "K19", 0));
		dssv.danhsach.add(SinhVienFactory.getSinhVien("18110232", "Nguyen Thanh Dat", 7.3, "Khoa CNTT", "K18", 2));
		dssv.danhsach.add(SinhVienFactory.getSinhVien("18115532", "Nguyen Hai Le", 5.9, "Khoa NNA", "K18", 0));
		
		
		//MonHoc Database
		
		dsmh.danhsach.add(new MonHoc(1,"Toán 1", 3));
		dsmh.danhsach.add(new MonHoc(2,"Toán 2", 3));
		dsmh.danhsach.add(new MonHoc(3,"Toán 3", 3));
		dsmh.danhsach.add(new MonHoc(4,"Anh Văn 1", 3));
		dsmh.danhsach.add(new MonHoc(5,"Anh Văn 2", 3));
		dsmh.danhsach.add(new MonHoc(6,"Kỹ Thuật Lập Trình", 3));
		dsmh.danhsach.add(new MonHoc(7,"Lập Trình Window", 3));
		dsmh.danhsach.add(new MonHoc(8,"Lập Trình Web", 3));
		dsmh.danhsach.add(new MonHoc(9,"Thực tập điện tử cơ bản", 1));
		dsmh.danhsach.add(new MonHoc(10,"Lịch Sử Đảng", 3));
		dsmh.danhsach.add(new MonHoc(11,"Thể Chất 1", 2));
		dsmh.danhsach.add(new MonHoc(12,"Thể Chất 2", 2));
		dsmh.danhsach.add(new MonHoc(13,"Thể Chất 3", 3));
		dsmh.danhsach.add(new MonHoc(14,"Xác Xuất Thống Kê", 3));
		dsmh.danhsach.add(new MonHoc(15,"Đại Số Tuyến Tính", 4));
		
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
			+"8. IN DANH SÁCH MÔN HỌC\n"
			+"9. ĐĂNG KÍ MÔN HỌC CHO SINH VIÊN\n"
			+"10. DANH SÁCH MÔN HỌC MÀ SINH VIÊN ĐÃ ĐĂNG KÍ VÀ TỔNG HỌC PHÍ PHẢI ĐÓNG\n"
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
			case 8:{
				dsmhPrinter.InDanhSach(dsmh.getDanhsach());
				break;
			}
			case 9:{
				dangKiMonHocChoSinhVien.DangKiMonHocChoSV(dssv, dsmh);
				break;
			}			
			case 10:{
				danhSachMonHocSVDangKi.InDanhSachMonHocSinhVienDangKi_VaHocPhiPhaiDong(dssv);
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
	
	

	
