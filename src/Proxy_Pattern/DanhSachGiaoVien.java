package Proxy_Pattern;

import java.util.ArrayList;

import Model.MonHoc;
import Model.*;
public class DanhSachGiaoVien {

public ArrayList<ProxyGiaoVien>	danhsach;
	
	
	public ArrayList<ProxyGiaoVien> getDanhsach() {
		return danhsach;
	}

	public void setDanhsach(ArrayList<ProxyGiaoVien> danhsach) {
		this.danhsach = danhsach;
	}

	public DanhSachGiaoVien() {
		this.danhsach = new ArrayList<ProxyGiaoVien>();
	}
	
	public DanhSachGiaoVien(ArrayList<ProxyGiaoVien> danhsach) {
		this.danhsach=danhsach;
	}
}
