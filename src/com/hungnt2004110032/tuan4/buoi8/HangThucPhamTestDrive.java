package com.hungnt2004110032.tuan4.buoi8;




public class HangThucPhamTestDrive {
    
    public static void main(String[] args) {
        
        HangThucPham hangThucPham = new HangThucPham("HTP", "Hang Thuc Pham", 1500000, "20/03/2020", "20/4/2022");
        hangThucPham.setMaHang("HTP");
        hangThucPham.getMaHang();
        hangThucPham.setDonGia(150000);
        hangThucPham.getDonGia();
        hangThucPham.setTenHang("Hang Thuc Pham");
        hangThucPham.getTenHang();
        hangThucPham.setNgaySanXuat("20/03/2020");
        hangThucPham.setNgayHetHan("20/03/2022");
        hangThucPham.getNgaySanXuat();
        hangThucPham.getNgayHetHan();
        hangThucPham.show();
    }
}
