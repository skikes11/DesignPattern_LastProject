package Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Model.*;

public class XoaMonHocDaDangKiChoSinhVien {

	InDanhSachMonHoc inDanhSachMonHoc = new InDanhSachMonHoc();
	public void XoaMonHocDaDangKiChoSV(DanhSachSinhVien dssv) {
		
		int flag = 0;
		int luaChonMonHoc;
		Scanner sc = new Scanner(System.in);
		System.out.println("VUI LÒNG NHẬP MSSV CỦA SINH VIÊN CẦN XÓA MÔN HỌC ĐÃ ĐĂNG KÍ");
		String mssv = sc.nextLine();
		for(SinhVien SV : dssv.danhsach) {
			if(SV.getMssv().equals(mssv)) {			
				if(SV.getListMonHoc()==null) {
					System.out.println("SINH VIÊN "+ SV.getName() +" HIỆN TẠI CHƯA ĐĂNG KÍ MÔN HỌC NÀO");
				}else {
				
					do {
					System.out.println("VUI LÒNG CHỌN MÔN HỌC SINH VIÊN MUỐN XÓA ĐĂNG KÍ");
					System.out.println("0. DỪNG XÓA MÔN HỌC ĐÃ ĐĂNG KÍ CHO SINH VIÊN");
					inDanhSachMonHoc.InDanhSach(SV.getListMonHoc());
					luaChonMonHoc =sc.nextInt();
					
					if(luaChonMonHoc!=0) {	
						if(luaChonMonHoc <= SV.getListMonHoc().size() && luaChonMonHoc > 0 ) {
							System.out.println("XÓA ĐĂNG KÍ THÀNH CÔNG MÔN HỌC "+SV.getListMonHoc().get(luaChonMonHoc-1).getTenMonHoc()+" CHO SINH VIÊN "+ SV.getName() +" VỚI MSSV: "+SV.getMssv()+"");
							SV.getListMonHoc().remove(luaChonMonHoc-1);				
							System.out.println("DANH SÁCH MÔN HỌC ĐÃ ĐĂNG KÝ HIỆN TẠI CỦA SINH VIÊN "+SV.getName() +" LÀ");
							inDanhSachMonHoc.InDanhSach(SV.getListMonHoc());					
						}else {
							System.out.println("LỰA CHỌN KHÔNG PHÙ HỢP VUI LÒNG CHỌN LẠI");
						}
						
					}	
					}while(luaChonMonHoc!=0);
				
				}
				flag =1;
				break;
			}
		}
		
		if(flag==0) {
			System.out.println("SINH VIEN KHONG TON TAI");
		}
		
		
	}
}
