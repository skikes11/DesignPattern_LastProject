package Controller;

import java.util.List;
import Model.*;
public class InDanhSachMonHoc {
	public void InDanhSach(List<MonHoc> ListMonHoc) {
		int id = 1;
		for(MonHoc MH : ListMonHoc) {
			System.out.print(id + ". ");
			System.out.print(MH);
			id++;
		}
	}
}
