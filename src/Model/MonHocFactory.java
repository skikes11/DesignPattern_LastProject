package Model;

public class MonHocFactory {

	public MonHoc getMonHoc(String tenMonHoc, int SoTinChi) {
		MonHoc monHoc = new MonHoc();
		
		if(tenMonHoc==null) {
			monHoc.setTenMonHoc("Chưa xác định");
		}else {
			monHoc.setTenMonHoc(tenMonHoc);
		}
		
		
		monHoc.setSoTinChi(SoTinChi);
		
		return monHoc;
	}
}
