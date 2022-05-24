package Controller;
import java.util.Scanner;


import Model.*;
public class NhapThongTinSinhVien {

	Factory_Pattern.SinhVienFactory factory;
	
	@SuppressWarnings("static-access")
	public SinhVien NhapThongTinSV() {
		Scanner sc = new Scanner(System.in);
		
		int HeSV;
		do {
		System.out.println("CHỌN HỆ CHO SINH VIÊN");
		System.out.println("1. Sinh viên hệ đại trà");
		System.out.println("2. Sinh viên hệ CLC");
		HeSV = sc.nextInt();
		}while(HeSV!=1 && HeSV !=2);
		
		String mssv, name, fal, course;
		double gpa;
		
		
	
		System.out.println("NHAP THONG TIN SINH VIEN");
		
		System.out.println("NHAP MSSV SINH VIEN");
		sc.nextLine();
		mssv= sc.nextLine();
		
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
