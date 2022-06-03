package Controller;
import java.util.Scanner;


import Model.*;
public class NhapThongTinSinhVien {

	Factory_Pattern.SinhVienFactory factory;
	 KiemTraXemSinhVienCoTonTai kiemTraXemSinhVienCoTonTai = new KiemTraXemSinhVienCoTonTai();
	@SuppressWarnings("static-access")
	public SinhVien NhapThongTinSV(DanhSachSinhVien dssv) {
		Scanner sc = new Scanner(System.in);
		int checkMssv = 0;
		int HeSV;
		do {
		System.out.println("CHỌN HỆ CHO SINH VIÊN");
		System.out.println("1. Sinh viên hệ đại trà");
		System.out.println("2. Sinh viên hệ CLC");
		HeSV = sc.nextInt();
		}while(HeSV!=1 && HeSV !=2);
		
		String mssvCheck,mssv, name, fal, course;
		double gpa;
		
		mssv = "1911";
	
		System.out.println("NHAP THONG TIN SINH VIEN");
		
		sc.nextLine();
		while(checkMssv == 0) {
		System.out.println("NHAP MSSV SINH VIEN");
		
		mssv= sc.nextLine();
		if(kiemTraXemSinhVienCoTonTai.KiemTraSV_Co_Ton_Tai(dssv, mssv)==0) {
			
			checkMssv = 1;
		
		}else {
			System.out.println("MSSV SINH VIEN DA TON TAI, VUI LONG NHAP LAI");
		}
		
		}
		
		System.out.println("NHAP TEN SINH VIEN");
		name=sc.nextLine();
		
		System.out.println("NHAP DIEM TRUNG BINH SINH VIEN");
		gpa=sc.nextDouble();
		sc.nextLine();
		
		System.out.println("NHAP KHOA CUA SINH VIEN");
		fal=sc.nextLine();
		
		
		System.out.println("NHAP NIEN KHOA CUA SINH VIEN");
		
		course=sc.nextLine();
		
		return factory.getSinhVien(mssv, name, gpa, fal, course, HeSV) ;
	}

	

	
}
	