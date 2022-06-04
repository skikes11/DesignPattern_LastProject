import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Brige_Pattern.*;
import Controller.*;
import Factory_Pattern.*;
import Model.*;
import Proxy_Pattern.*;
public class Client {
	static ThemSinhVien themSinhVien = new ThemSinhVien();
	static DanhSachSinhVien dssv = new DanhSachSinhVien();
	static DanhSachMonHoc dsmh = new DanhSachMonHoc();
	static InDanhSachSinhVien dssvPrinter = new InDanhSachSinhVien();
	static XoaSinhVien xoaSinhVien = new XoaSinhVien();
	static SoLuongSinhVien soLuongSinhVien = new SoLuongSinhVien();
	static TimSinhVien timSinhVien = new TimSinhVien();
	static SapXepSinhVienTheoGPA sapXepSinhVienTheoGPA = new SapXepSinhVienTheoGPA();
	static SinhVienFactory sinhVienFactory = new SinhVienFactory();
	static InDanhSachMonHoc dsmhPrinter = new InDanhSachMonHoc();
	static DangKiMonHocChoSinhVien dangKiMonHocChoSinhVien = new DangKiMonHocChoSinhVien();
	static DanhSachMonHocSVDangKi danhSachMonHocSVDangKi = new DanhSachMonHocSVDangKi();
	static XoaMonHocDaDangKiChoSinhVien xoaMonHocDaDangKiChoSinhVien = new XoaMonHocDaDangKiChoSinhVien();
	static MonHocFactory monHocFactory = new MonHocFactory();
	static DanhSachGiaoVien dsgv = new DanhSachGiaoVien();
	static InDanhSachGiaoVien inDanhSachGiaoVien = new InDanhSachGiaoVien();
	public static void main(String[] args) {
		
		//Sinh Vien Database
		
		dssv.danhsach.add(new SinhVien(new SinhVienCLC(),"19110232", "Dinh Bao Long", 8.6, "Khoa CNTT", "K19", null));
		dssv.danhsach.add(new SinhVien(new SinhVienDaiTra(),"20110312", "Dinh Bao Hoang", 6.6, "Khoa CNTT", "K20", null));
		dssv.danhsach.add(new SinhVien(new SinhVienCLC(),"17110232", "Nguyen Nhat Le", 7.4, "Khoa CNTT", "K17", null));
		dssv.danhsach.add(new SinhVien(new SinhVienCLC(),"17110242", "Nguyen Hai Dang", 5.6, "Khoa NNA", "K17", null));
		dssv.danhsach.add(new SinhVien(new SinhVienCLC(),"19113333", "Le Thanh Trung", 6.6, "Khoa CNTT", "K19", null));
		dssv.danhsach.add(new SinhVien(new SinhVienDaiTra(),"19110303", "Dinh Thanh Hai", 8.9, "Khoa CNTT", "K19", null));
		dssv.danhsach.add(new SinhVien(new SinhVienDaiTra(),"18110232", "Nguyen Thanh Dat", 7.3, "Khoa CNTT", "K18", null));
		dssv.danhsach.add(new SinhVien(new SinhVienDaiTra(),"18115532", "Nguyen Hai Le", 5.9, "Khoa NNA", "K18", null));
		dssv.danhsach.add(new SinhVien(new SinhVienDaiTra(),"21023221", "Nguyen Thanh Cao", 8.6, "Khoa CNTT", "K21", null));
		dssv.danhsach.add(new SinhVien(new SinhVienDaiTra(),"17132321", "Dinh Bao Quang", 8.0, "Khoa CNTT", "K17", null));
		dssv.danhsach.add(new SinhVien(new SinhVienCLC(),"16110232", "Nhat Thang Quang", 9.6, "Khoa CNTT", "K16", null));
		dssv.danhsach.add(new SinhVien(new SinhVienCLC(),"16110232", "Dinh Bao Quynh", 8.6, "Khoa CNTT", "K16", null));
		dssv.danhsach.add(new SinhVien(new SinhVienCLC(),"19115232", "Nguyen Thanh Truong", 8.6, "Khoa CNTT", "K19", null));
		//MonHoc Database
		
		dsmh.danhsach.add(new MonHoc("Toán 1", 3));
		dsmh.danhsach.add(new MonHoc("Toán 2", 3));
		dsmh.danhsach.add(new MonHoc("Toán 3", 3));
		dsmh.danhsach.add(new MonHoc("Anh Văn 1", 3));
		dsmh.danhsach.add(new MonHoc("Anh Văn 2", 3));
		dsmh.danhsach.add(new MonHoc("Kỹ Thuật Lập Trình", 3));
		dsmh.danhsach.add(new MonHoc("Lập Trình Window", 3));
		dsmh.danhsach.add(new MonHoc("Lập Trình Web", 3));
		dsmh.danhsach.add(new MonHoc("Thực tập điện tử cơ bản", 1));
		dsmh.danhsach.add(new MonHoc("Lịch Sử Đảng", 3));
		dsmh.danhsach.add(new MonHoc("Thể Chất 1", 2));
		dsmh.danhsach.add(new MonHoc("Thể Chất 2", 2));
		dsmh.danhsach.add(new MonHoc("Thể Chất 3", 3));
		dsmh.danhsach.add(new MonHoc("Xác Xuất Thống Kê", 3));
		dsmh.danhsach.add(new MonHoc("Đại Số Tuyến Tính", 4));
		
		//Database GiaoVien (Proxy)
		
		dsgv.danhsach.add(new ProxyGiaoVien("GV151", "Trần Đức Cường", 35));
		dsgv.danhsach.add(new ProxyGiaoVien("GV125", "Nguyễn Đăng Khoa", 33));
		dsgv.danhsach.add(new ProxyGiaoVien("GV162", "Nguyễn Việt Hùng", 43));
		dsgv.danhsach.add(new ProxyGiaoVien("GV622", "Nguyễn Thanh Lợi", 49));
		
	
		
		
		// Test Null Object Pattern with Factory
		
		dsmh.danhsach.add(monHocFactory.getMonHoc("Lịch sử đảng", 3));
		dsmh.danhsach.add(monHocFactory.getMonHoc(null, 0));
		
		
		
		
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
			+"6. SẮP XẾP VÀ IN RA DANH SÁCH SINH VIÊN ĐƯỢC SẮP XẾP THEO ĐIỂM GPA TỪ CAO XUỐNG THẤP\n"
			+"7. IN DANH SÁCH MÔN HỌC\n"
			+"8. ĐĂNG KÍ MÔN HỌC CHO SINH VIÊN\n"
			+"9. XÓA MÔN HỌC ĐÃ ĐĂNG KÍ CHO SINH VIÊN\n"
			+"10. DANH SÁCH MÔN HỌC MÀ SINH VIÊN ĐÃ ĐĂNG KÍ VÀ TỔNG HỌC PHÍ PHẢI ĐÓNG\n"
			+"11. IN DANH SÁCH GIÁO VIÊN\n"
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
				sapXepSinhVienTheoGPA.SapXepSinhVienTheoGPA_HightoLow(dssv);
				break;
			}
			case 7:{
				dsmhPrinter.InDanhSach(dsmh.getDanhsach());
				break;
			}
			case 8:{
				dangKiMonHocChoSinhVien.DangKiMonHocChoSV(dssv, dsmh);
				break;
			}	
			
			case 9:{
				xoaMonHocDaDangKiChoSinhVien.XoaMonHocDaDangKiChoSV(dssv);
				break;
			}
			
			case 10:{
				danhSachMonHocSVDangKi.InDanhSachMonHocSinhVienDangKi_VaHocPhiPhaiDong(dssv);
				break;
			}
			case 11:{
				inDanhSachGiaoVien.InDanhSach(dsgv.getDanhsach());
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
	
	

	
