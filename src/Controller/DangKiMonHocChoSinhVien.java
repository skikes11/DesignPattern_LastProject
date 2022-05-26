package Controller;

import java.util.Scanner;
import java.util.List;
import Model.*;
import java.util.ArrayList;

public class DangKiMonHocChoSinhVien {
	
	InDanhSachMonHoc inDanhSachMonHoc = new InDanhSachMonHoc();
	
	public void DangKiMonHocChoSV(DanhSachSinhVien dssv, DanhSachMonHoc dsmh) {
		List<MonHoc> listMonHoc = new ArrayList<>();
		int flag = 0;
		int luaChonMonHoc;
		Scanner sc = new Scanner(System.in);
		System.out.println("VUI LÒNG NHẬP MSSV CỦA SINH VIÊN CẦN ĐĂNG KÍ MÔN HỌC");
		String mssv = sc.nextLine();
		for(SinhVien SV : dssv.danhsach) {
			if(SV.getMssv().equals(mssv)) {
			
				do {
				System.out.println("VUI LÒNG CHỌN MÔN HỌC SINH VIÊN MUỐN ĐĂNG KÍ");
				System.out.println("0. Dừng đăng kí môn học cho sinh viên");
				inDanhSachMonHoc.InDanhSach(dsmh.getDanhsach());
				luaChonMonHoc =sc.nextInt();
				
				if(luaChonMonHoc!=0) {	
					if(luaChonMonHoc <= dsmh.getDanhsach().size() && luaChonMonHoc > 0 ) {
						
						if(SV.getListMonHoc()==null) {
							listMonHoc.add(dsmh.getDanhsach().get(luaChonMonHoc-1));
							SV.setListMonHoc(listMonHoc);
						}else {
						SV.getListMonHoc().add(dsmh.getDanhsach().get(luaChonMonHoc-1));
						}						
						
						System.out.println("ĐĂNG KÍ THÀNH CÔNG MÔN HỌC "+dsmh.getDanhsach().get(luaChonMonHoc-1).getTenMonHoc()+" CHO SINH VIÊN "+ SV.getName() +" VỚI MSSV: "+SV.getMssv()+"");
						System.out.println("DANH SÁCH MÔN HỌC ĐÃ ĐĂNG KÝ HIỆN TẠI CỦA SINH VIÊN "+SV.getName() +" LÀ");
						inDanhSachMonHoc.InDanhSach(SV.getListMonHoc());					
					}else {
						System.out.println("LỰA CHỌN KHÔNG PHÙ HỢP VUI LÒNG CHỌN LẠI");
					}
					
				}	
				}while(luaChonMonHoc!=0);
				
				flag =1;
				break;
			}
		}
		
		if(flag==0) {
			System.out.println("SINH VIEN KHONG TON TAI");
		}
	}
}
