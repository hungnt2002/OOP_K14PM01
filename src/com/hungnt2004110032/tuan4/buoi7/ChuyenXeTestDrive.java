package com.hungnt2004110032.tuan4.buoi7;

public class ChuyenXeTestDrive {
    public static void main(String[] args) {
        
        System.out.println("So chuyen xe can nhap: ");
        xeNgoaiThanh();   
    }
    public static void xeNgoaiThanh(){

        ChuyenXeNgoaiThanh chuyenXeNgoaiThanh = new ChuyenXeNgoaiThanh();
        chuyenXeNgoaiThanh.nhap();
        chuyenXeNgoaiThanh.inThongTin();

    }
}
