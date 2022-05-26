package Controller;
import java.util.Scanner;

import Model.*;
public class XoaSinhVien {
	
	public void XoaSVThongQuaMSSV(DanhSachSinhVien dssv) {
		int flag = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("VUI LÒNG NHẬP MSSV CỦA SINH VIÊN CẦN XÓA");
		String mssv = sc.nextLine();
		
		for (int i = 0; i < dssv.danhsach.size(); i++) {
		    SinhVien sinhVien = dssv.danhsach.get(i);
		    if (sinhVien.getMssv().equals(mssv)) {
		    	System.out.println("XÓA THÀNH CÔNG SINH VIÊN "+sinhVien.getName()+" VỚI MSSV: "+sinhVien.getMssv() +"");
		    	dssv.danhsach.remove(sinhVien);
		    	flag = 1;
		    }
		}
		
		if(flag ==0) {
			System.out.println("SINH VIÊN KHÔNG TỒN TẠI");
		}
		
	}
}
