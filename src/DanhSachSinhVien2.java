import java.util.ArrayList;

public class DanhSachSinhVien2 {
	protected ArrayList<SinhVien2>	danhsach;
	
	
	public ArrayList<SinhVien2> getDanhsach() {
		return danhsach;
	}

	public void setDanhsach(ArrayList<SinhVien2> danhsach) {
		this.danhsach = danhsach;
	}

	public DanhSachSinhVien2() {
		this.danhsach = new ArrayList<SinhVien2>();
	}
	
	public DanhSachSinhVien2(ArrayList<SinhVien2> danhsach) {
		this.danhsach=danhsach;
	}	
}
