package Proxy_Pattern;

import java.util.List;

import Model.*;

public class InDanhSachGiaoVien {

	public void InDanhSach(List<ProxyGiaoVien> giaoViens) {
		int id = 1;
		for(ProxyGiaoVien gv : giaoViens) {
			gv.ShowGiaoVien();
		}
	}
}
