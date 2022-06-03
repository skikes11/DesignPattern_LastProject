package Controller;

import java.util.Scanner;

import Model.DanhSachSinhVien;
import Model.SinhVien;

public class KiemTraXemSinhVienCoTonTai {

	public int KiemTraSV_Co_Ton_Tai(DanhSachSinhVien dssv, String mssv) {
		
		for(SinhVien SV : dssv.danhsach) {
			if(SV.getMssv().equals(mssv)) {
				return 1;
			}
		}
		return 0;
		
	}
}
