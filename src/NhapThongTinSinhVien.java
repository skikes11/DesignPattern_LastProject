import java.util.Scanner;

public class NhapThongTinSinhVien {

	
	public SinhVien NhapThongTinSV() {
		
		SinhVien sinhVien = new SinhVien(new SinhVienCLC());	
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("NHAP THONG TIN SINH VIEN");
		
		System.out.println("NHAP MSSV SINH VIEN");
		sinhVien.setMssv(sc.nextLine());
		
		System.out.println("NHAP TEN SINH VIEN");
		sinhVien.setName(sc.nextLine());
		
		System.out.println("NHAP DIEM TRUNG BINH SINH VIEN");
		sinhVien.setGpa(sc.nextDouble());
		sc.nextLine();
		
		System.out.println("NHAP KHOA CUA SINH VIEN");
		sinhVien.setFaculty(sc.nextLine());
		
		System.out.println("NHAP NIEN KHOA CUA SINH VIEN");
		sinhVien.setCourse(sc.nextLine());
		return sinhVien;
	}

	
}
