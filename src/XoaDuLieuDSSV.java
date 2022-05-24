import java.util.Collection;

public class XoaDuLieuDSSV {
	
	public void XoaDuLieuDanhSach(DanhSachSinhVien dssv) {
		dssv.danhsach.removeAll((Collection<?>) dssv);
	}
}
