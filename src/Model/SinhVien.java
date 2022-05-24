package Model;
import java.util.List;
import Brige_Pattern.*;

public class SinhVien extends WrapSinhVien {
	private String mssv;
	private String name;
	private double gpa;
	private String faculty;
	private String course;
	private String hocluc;
	private List<MonHoc> listMonHoc;
	
	


	public SinhVien(ChucNangSV chucNangSV) {
		super(chucNangSV);
	}





	public SinhVien(ChucNangSV chucNangSV, String mssv, String name, double gpa, String faculty, String course,
			String hocluc, List<MonHoc> listMonHoc) {
		super(chucNangSV);
		this.mssv = mssv;
		this.name = name;
		this.gpa = gpa;
		this.faculty = faculty;
		this.course = course;
		this.hocluc = hocluc;
		this.listMonHoc = listMonHoc;
	}


	
	
	


	public SinhVien(ChucNangSV chucNangSV, String mssv, String name, double gpa, String faculty, String course,
			String hocluc) {
		super(chucNangSV);
		this.mssv = mssv;
		this.name = name;
		this.gpa = gpa;
		this.faculty = faculty;
		this.course = course;
		this.hocluc = hocluc;
	}





	public String getMssv() {
		return mssv;
	}





	public void setMssv(String mssv) {
		this.mssv = mssv;
	}





	public String getName() {
		return name;
	}





	public void setName(String name) {
		this.name = name;
	}





	public double getGpa() {
		return gpa;
	}





	public void setGpa(double gpa) {
		this.gpa = gpa;
	}





	public String getFaculty() {
		return faculty;
	}





	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}





	public String getCourse() {
		return course;
	}





	public void setCourse(String course) {
		this.course = course;
	}





	public String getHocluc() {
		return hocluc;
	}





	public void setHocluc(String hocluc) {
		this.hocluc = hocluc;
	}





	public List<MonHoc> getListMonHoc() {
		return listMonHoc;
	}





	public void setListMonHoc(List<MonHoc> listMonHoc) {
		this.listMonHoc = listMonHoc;
	}



	
	
	


	@Override
	public String toString() {
		return "SinhVien [mssv=" + mssv + ", name=" + name + ", gpa=" + gpa + ", faculty=" + faculty + ", course="
				+ course + ", hocluc=" + hocluc + "]\n";
	}





	@Override
	public long DongHocPhi(int SoTinChi) {		
		return chucNangSV.DongHocPhi(SoTinChi);
	}
	
	
	
	
	
}
