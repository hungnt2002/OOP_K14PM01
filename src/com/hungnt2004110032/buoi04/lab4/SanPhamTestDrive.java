package com.hungnt2004110032.buoi04.lab4;

public class SanPhamTestDrive {
    
    public static void main(String[] args) {

        System.out.println("- San pham doi tuong 1");
        SanPham sanPham1 = new SanPham();
        sanPham1.nhap();
        sanPham1.xuat();

        System.out.println("- San pham doi tuong 2");
        SanPham sanPham2 = new SanPham();
        sanPham2.nhap();
        sanPham2.xuat();
        
    }
}
