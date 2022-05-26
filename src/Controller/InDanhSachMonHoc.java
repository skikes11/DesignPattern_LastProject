package Controller;

import java.util.List;
import Model.*;
public class InDanhSachMonHoc {
	public void InDanhSach(List<MonHoc> ListMonHoc) {
		for(MonHoc MH : ListMonHoc) {
			System.out.print(MH);
		}
	}
}
