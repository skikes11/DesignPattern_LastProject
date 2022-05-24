package Brige_Pattern;

public abstract class WrapSinhVien {

	protected static ChucNangSV chucNangSV;

	public WrapSinhVien(ChucNangSV chucNangSV) {
		super();
		this.chucNangSV = chucNangSV;
	}
	
	

	public abstract long  DongHocPhi(int SoTinChi);	
}
