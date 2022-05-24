import java.util.Collections;
import java.util.Comparator;

public class SapXepSinhVienTheoGPA {
	public void SapXepSinhVienTheoGPA_HightoLow(DanhSachSinhVien dssv) {
		
		InDanhSachSinhVien inDanhSachSinhVien = new InDanhSachSinhVien();
		Collections.sort(dssv.danhsach, new Comparator<SinhVien>() {
			@Override
			public int compare(SinhVien s1, SinhVien s2) {
				if(s1.getGpa()<s2.getGpa()) {
					return -1;
				}else if(s1.getGpa()>s2.getGpa()){
					return 1;
				}else {
				return 0;
				}
			}
		});
		
		inDanhSachSinhVien.InDanhSach(dssv);
	}
}
