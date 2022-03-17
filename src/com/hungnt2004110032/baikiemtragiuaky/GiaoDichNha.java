package com.hungnt2004110032.baikiemtragiuaky;

import java.text.ParseException;
import java.util.Scanner;

public class GiaoDichNha extends GiaoDich {

    private String diaChi;
    Scanner sc = new Scanner(System.in);
   
    

    @Override
    protected void nhapDanhSach() throws ParseException {
      
        super.nhapDanhSach();
        System.out.print("Nhap loai nha: ");
        setLoai(sc.nextLine());
        System.out.print("Nhap dia chi: ");
        this.diaChi = sc.nextLine();
    }
    
    
    @Override
    protected void inThongTin() {
        super.inThongTin();
        System.out.println("Loai nha: " + getLoai());
        System.out.println("Dia chi: " + diaChi);
        System.out.println("Thanh tien cua nha: " + tinhThanhTien());
        
    }

    @Override
    protected double tinhThanhTien() {
        // Tính thành tiền của nhà

        if(getLoai().equalsIgnoreCase("cao cap")){
            return super.tinhThanhTien();
        }else if(getLoai().equalsIgnoreCase("thuong")){
            return super.tinhThanhTien() * 0.9;
        }else{
            System.out.println("Ban nhap sai loai Nha");
        }

        return 0;
    }

    @Override
    protected void tinhTongSoLuong() {
        System.out.println("Chua lam kip");
    }
}
