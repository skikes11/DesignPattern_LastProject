
public class SinhVienFactory {

	SinhVienFactory() {
	}
	
	public static final SinhVien2 getSinhVien(String mssv, String name, double gpa, String faculty, String course ) {
		SinhVien2 sv2 = new SinhVien2(new SinhVienCLC());
		sv2.setMssv(mssv);
		sv2.setName(name);
		sv2.setGpa(gpa);
		sv2.setFaculty(faculty);
		sv2.setCourse(course);
		
		if(gpa >= 8 && gpa <= 10) {
			sv2.setHocLuc("HOC LUC GIOI");
		}else if(gpa < 8 && gpa >= 6.5) {
			sv2.setHocLuc("HOC LUC KHA");
		}else if(gpa < 6.5 && gpa >= 5) {
			sv2.setHocLuc("HOC LUC TRUNG BINH");
		}else if(gpa < 5 && gpa >=0) {
			sv2.setHocLuc("HOC LUC KEM");
		}else {
			sv2.setHocLuc("NULL");
		}		
		return sv2;
	}
	
}
