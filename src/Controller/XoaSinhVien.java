package Controller;
import java.util.Scanner;

import Model.*;
public class XoaSinhVien {
	
	public void XoaSVThongQuaMSSV(DanhSachSinhVien dssv) {
		Scanner sc = new Scanner(System.in);
		System.out.println("VUI LÒNG NHẬP MSSV CỦA SINH VIÊN CẦN XÓA");
		String mssv = sc.nextLine();
		for(SinhVien SV : dssv.danhsach) {		
			if(SV.getMssv().equals(mssv)) {	
			 dssv.danhsach.remove(dssv.danhsach.indexOf(SV)); 				
			}
		}
	}
}
