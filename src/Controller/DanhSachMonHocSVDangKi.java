package Controller;

import java.util.Scanner;

import Model.*;
public class DanhSachMonHocSVDangKi {
	InDanhSachMonHoc inDanhSachMonHoc = new InDanhSachMonHoc();
	public void InDanhSachMonHocSinhVienDangKi_VaHocPhiPhaiDong(DanhSachSinhVien dssv) {
		int SoTinChi =0;
		int flag = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("VUI LÒNG NHẬP MSSV CỦA SINH VIÊN ");
		String mssv = sc.nextLine();
		for(SinhVien SV : dssv.danhsach) {
			if(SV.getMssv().equals(mssv)) {
				
				
				if(SV.getListMonHoc()!=null) {
				System.out.println("DANH SÁCH MÔN HỌC ĐÃ ĐĂNG KÝ HIỆN TẠI CỦA SINH VIÊN "+SV.getName() +" LÀ");
				inDanhSachMonHoc.InDanhSach(SV.getListMonHoc());			
				flag =1;
				
				for(MonHoc MH: SV.getListMonHoc() ) {
					SoTinChi += MH.getSoTinChi();
				}
			
				System.out.println("SỐ HỌC PHÍ PHẢI ĐÓNG CỦA SINH VIÊN: "+SV.DongHocPhi(SoTinChi)+" VND");
				}else {
					System.out.println("HIỆN TẠI SINH VIÊN CHƯA ĐĂNG KÍ MÔN HỌC NÀO");
				}
			}
		}
		
		if(flag==0) {
			System.out.println("SINH VIEN KHONG TON TAI");
		}
	}
	
}
