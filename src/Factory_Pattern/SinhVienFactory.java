package Factory_Pattern;
import Brige_Pattern.*;

import Model.*;
public class SinhVienFactory {

	public SinhVienFactory() {
	}
	
	public static final SinhVien getSinhVien(String mssv, String name, double gpa, String faculty, String course, int HeSV ) {
		
		
		
		SinhVien sv2 = new SinhVien(new SinhVienDaiTra());	
		
		if(HeSV==2) {
			sv2 = new SinhVien(new SinhVienCLC()); 
		}
			
		sv2.setMssv(mssv);
		sv2.setName(name);
		sv2.setGpa(gpa);
		sv2.setFaculty(faculty);
		sv2.setCourse(course);
		
		if(gpa >= 8 && gpa <= 10) {
			sv2.setHocluc("HOC LUC GIOI");
		}else if(gpa < 8 && gpa >= 6.5) {
			sv2.setHocluc("HOC LUC KHA");
		}else if(gpa < 6.5 && gpa >= 5) {
			sv2.setHocluc("HOC LUC TRUNG BINH");
		}else if(gpa < 5 && gpa >=0) {
			sv2.setHocluc("HOC LUC KEM");
		}else {
			sv2.setHocluc("NULL");
		}		
		return sv2;
	}
	
}
