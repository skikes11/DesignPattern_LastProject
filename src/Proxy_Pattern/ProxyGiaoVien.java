package Proxy_Pattern;
import Model.*;
public class ProxyGiaoVien {

	private GiaoVien giaoVien;
	private String msgv;
	private String name;
	private int age;
	
	public ProxyGiaoVien(String msgv, String name, int age) {
		super();
		this.msgv = msgv;
		this.name = name;
		this.age = age;
	}
	
	public void ShowGiaoVien() {
		 if (giaoVien == null) {
			 giaoVien = new GiaoVien(this.msgv, this.name, this.age);
			 System.out.println(giaoVien);
	        } else {
	         System.out.println("Giáo viên đã tồn tại: "+ giaoVien);
	        }	       
	 }
	
}
