package Model;

public class GiaoVien {
	
	private String msgv;
	private String name;
	private int age;
	
	public GiaoVien(String msgv, String name, int age) {
		super();
		this.msgv = msgv;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "GiaoVien [msgv=" + msgv + ", name=" + name + ", age=" + age + "]";
	}
	
	
}
