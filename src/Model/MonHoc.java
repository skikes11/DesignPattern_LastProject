package Model;

public class MonHoc {
	private int id;
	private String tenMonHoc;
	private int SoTinChi;
	


	public MonHoc(int id, String tenMonHoc, int soTinChi) {
		super();
		this.id = id;
		this.tenMonHoc = tenMonHoc;
		SoTinChi = soTinChi;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
		return ""+id+". MonHoc [ tenMonHoc=" + tenMonHoc + ", SoTinChi=" + SoTinChi + "]\n";
	}
	
	
	
}
