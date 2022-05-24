package Model;

import java.util.ArrayList;

public class DanhSachMonHoc {
	public ArrayList<MonHoc>	danhsach;
	
	
	public ArrayList<MonHoc> getDanhsach() {
		return danhsach;
	}

	public void setDanhsach(ArrayList<MonHoc> danhsach) {
		this.danhsach = danhsach;
	}

	public DanhSachMonHoc() {
		this.danhsach = new ArrayList<MonHoc>();
	}
	
	public DanhSachMonHoc(ArrayList<MonHoc> danhsach) {
		this.danhsach=danhsach;
	}	
}
