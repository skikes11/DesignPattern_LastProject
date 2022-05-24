import java.util.ArrayList;

public class DanhSachSinhVien {
	protected ArrayList<SinhVien>	danhsach;
	
	
	public ArrayList<SinhVien> getDanhsach() {
		return danhsach;
	}

	public void setDanhsach(ArrayList<SinhVien> danhsach) {
		this.danhsach = danhsach;
	}

	public DanhSachSinhVien() {
		this.danhsach = new ArrayList<SinhVien>();
	}
	
	public DanhSachSinhVien(ArrayList<SinhVien> danhsach) {
		this.danhsach=danhsach;
	}	
}
