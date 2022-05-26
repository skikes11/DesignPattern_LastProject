package Controller;
import java.util.Scanner;

import Model.*;
public class ThemSinhVien {	
	NhapThongTinSinhVien NhapSV = new NhapThongTinSinhVien();
	public void themSinhVien(DanhSachSinhVien dssv) {
		Scanner sc = new Scanner(System.in);
	  dssv.danhsach.add(NhapSV.NhapThongTinSV());
	  
	}
}
