package Controller;
import java.util.Collection;

import Model.*;
public class XoaDuLieuDSSV {
	
	public void XoaDuLieuDanhSach(DanhSachSinhVien dssv) {
		dssv.danhsach.removeAll((Collection<?>) dssv);
	}
}
