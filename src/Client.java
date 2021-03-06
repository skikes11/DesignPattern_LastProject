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
		
		dsmh.danhsach.add(new MonHoc("To??n 1", 3));
		dsmh.danhsach.add(new MonHoc("To??n 2", 3));
		dsmh.danhsach.add(new MonHoc("To??n 3", 3));
		dsmh.danhsach.add(new MonHoc("Anh V??n 1", 3));
		dsmh.danhsach.add(new MonHoc("Anh V??n 2", 3));
		dsmh.danhsach.add(new MonHoc("K??? Thu???t L???p Tr??nh", 3));
		dsmh.danhsach.add(new MonHoc("L???p Tr??nh Window", 3));
		dsmh.danhsach.add(new MonHoc("L???p Tr??nh Web", 3));
		dsmh.danhsach.add(new MonHoc("Th???c t???p ??i???n t??? c?? b???n", 1));
		dsmh.danhsach.add(new MonHoc("L???ch S??? ?????ng", 3));
		dsmh.danhsach.add(new MonHoc("Th??? Ch???t 1", 2));
		dsmh.danhsach.add(new MonHoc("Th??? Ch???t 2", 2));
		dsmh.danhsach.add(new MonHoc("Th??? Ch???t 3", 3));
		dsmh.danhsach.add(new MonHoc("X??c Xu???t Th???ng K??", 3));
		dsmh.danhsach.add(new MonHoc("?????i S??? Tuy???n T??nh", 4));
		
		//Database GiaoVien (Proxy)
		
		dsgv.danhsach.add(new ProxyGiaoVien("GV151", "Tr???n ?????c C?????ng", 35));
		dsgv.danhsach.add(new ProxyGiaoVien("GV125", "Nguy???n ????ng Khoa", 33));
		dsgv.danhsach.add(new ProxyGiaoVien("GV162", "Nguy???n Vi???t H??ng", 43));
		dsgv.danhsach.add(new ProxyGiaoVien("GV622", "Nguy???n Thanh L???i", 49));
		
	
		
		
		// Test Null Object Pattern with Factory
		
		dsmh.danhsach.add(monHocFactory.getMonHoc("L???ch s??? ?????ng", 3));
		dsmh.danhsach.add(monHocFactory.getMonHoc(null, 0));
		
		
		
		
		Scanner sc = new Scanner(System.in);
		int option;
		do {
			
		 
		System.out.println("--------------------MENU------------------");
		System.out.println("VUI L??NG CH???N CH???C N??NG");
		System.out.println("0. THO??T KH???I CH????NG TR??NH\n"
			+"1. IN DANH S??CH SINH VI??N\n"
			+"2. TH??M SINH VI??N\n"
			+"3. X??A SINH VI??N\n"
			+"4. KI???M TRA S??? L?????NG SINH VI??N TRONG DANH S??CH\n"
			+"5. T??M KI???M SINH VI??N D???A TR??N M?? SINH VI??N\n"
			+"6. S???P X???P V?? IN RA DANH S??CH SINH VI??N ???????C S???P X???P THEO ??I???M GPA T??? CAO XU???NG TH???P\n"
			+"7. IN DANH S??CH M??N H???C\n"
			+"8. ????NG K?? M??N H???C CHO SINH VI??N\n"
			+"9. X??A M??N H???C ???? ????NG K?? CHO SINH VI??N\n"
			+"10. DANH S??CH M??N H???C M?? SINH VI??N ???? ????NG K?? V?? T???NG H???C PH?? PH???I ????NG\n"
			+"11. IN DANH S??CH GI??O VI??N\n"
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
				System.out.println("L???A CH???N KH??NG PH?? H???P VUI L??NG CH???N L???I");
				break;
			}
		
		} while(option!=0);
		
		sc.close();
		
	}
       
    }
	
	

	
