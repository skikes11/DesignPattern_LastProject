package Controller;

import Model.*;
import java.util.Scanner;

public class TimSinhVien {
	
	public void TimSVThongQuaMSSV(DanhSachSinhVien dssv) {
		int flag = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("VUI LÒNG NHẬP MSSV CỦA SINH VIÊN CẦN TÌM");
		String mssv = sc.nextLine();
		for(SinhVien SV : dssv.danhsach) {
			if(SV.getMssv().equals(mssv)) {
				System.out.println(SV);
				flag =1;
			}
		}
		
		if(flag==0) {
			System.out.println("SINH VIEN KHONG TON TAI");
		}
	}
}
