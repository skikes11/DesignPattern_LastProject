package Model;

public class MonHoc {
	private String tenMonHoc;
	private int SoTinChi;
	
	





	public MonHoc() {
		super();
	}







	public MonHoc(String tenMonHoc, int soTinChi) {
		super();
		this.tenMonHoc = tenMonHoc;
		SoTinChi = soTinChi;
	}







	public String getTenMonHoc() {
		return tenMonHoc;
	}







	public void setTenMonHoc(String tenMonHoc) {
		this.tenMonHoc = tenMonHoc;
	}







	public int getSoTinChi() {
		return SoTinChi;
	}







	public void setSoTinChi(int soTinChi) {
		SoTinChi = soTinChi;
	}







	@Override
	public String toString() {
		return "MonHoc [ tenMonHoc=" + tenMonHoc + ", SoTinChi=" + SoTinChi + "]\n";
	}
	
	
	
}
