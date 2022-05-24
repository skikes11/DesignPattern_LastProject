package Controller;

import Model.*;
public class InDanhSachSinhVien   {
		
	public void InDanhSach(DanhSachSinhVien dssv) {
		for(SinhVien SV : dssv.getDanhsach()) {
			System.out.print(SV);
		}
	}
}
