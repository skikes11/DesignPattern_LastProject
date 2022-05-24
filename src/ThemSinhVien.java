
public class ThemSinhVien {	
	NhapThongTinSinhVien NhapSV = new NhapThongTinSinhVien();
	public void themSinhVien(DanhSachSinhVien dssv) {
	  dssv.danhsach.add(NhapSV.NhapThongTinSV());
	}
}
