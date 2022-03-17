package com.hungnt2004110032.baikiemtragiuaky;

import java.text.ParseException;
import java.util.Scanner;

public class GiaoDichDat extends GiaoDich {

    Scanner sc = new Scanner(System.in);

    @Override
    protected void nhapDanhSach() throws ParseException {
        super.nhapDanhSach();
        System.out.print("Nhap loai dat: " );
        setLoai(sc.nextLine());
    }
    
    public double tinhThanhTien() {

        if(getLoai().equalsIgnoreCase("B") && getLoai().equalsIgnoreCase("C")){
            return super.tinhThanhTien();
        }else if(getLoai().equalsIgnoreCase("A")){
            return super.tinhThanhTien() * 1.5;
        }
        
        return 0;
    
    }

    @Override
    protected void inThongTin() {
        super.inThongTin();
        System.out.println("Loai dat: " + getLoai());
        System.out.println("Tinh thanh tien cua dat: " + tinhThanhTien());
    }


    @Override
    protected void tinhTongSoLuong() {
        System.out.println("Tong so luong: ");
        // Chua lam kip
        
    }

    

    
}