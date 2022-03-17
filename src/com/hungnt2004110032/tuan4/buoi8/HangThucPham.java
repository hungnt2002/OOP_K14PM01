package com.hungnt2004110032.tuan4.buoi8;

import java.text.SimpleDateFormat;

public class HangThucPham {

    private String maHang;
    private String tenHang;
    private double donGia;
    private String ngaySanXuat;
    private String ngayHetHan;


    public HangThucPham(final String maHang, final String tenHang, final double donGia, final String ngaySanXuat, final String ngayHetHan) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.donGia = donGia;
        this.ngaySanXuat = ngaySanXuat;
        this.ngayHetHan = ngayHetHan;
    }
    public HangThucPham(){}

    public void setMaHang(final String maHang) {
        if(maHang != null){
            this.maHang = maHang;
        }else{
            System.out.println("Ma hang khong duoc rong");
            this.maHang = "default";
        }
        
    }

    public String getMaHang() {
        return maHang;
    }

    public void setTenHang(final String tenHang) {
        if(maHang != null){
            this.tenHang = tenHang;
        }else{
            System.out.println("Ten hang khong duoc rong");
            this.tenHang = "default";
        }
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setDonGia(final double donGia) {
        if(donGia > 0){
            this.donGia = donGia;
        }else{
            System.out.println("Don gia khong duoc < 0");
        }
        
    }

    public double getDonGia() {
        return donGia;
    }

    public void setNgaySanXuat(final String ngaySanXuat) {
        if(ngaySanXuat != null){
            this.ngaySanXuat = ngaySanXuat;
        }else{
            System.out.println("Ngay san xuat khong duoc rong");
        }
    }

    public String getNgaySanXuat() {
        return ngaySanXuat;
    }

    public void setNgayHetHan(final String ngayHetHan) {
        this.ngayHetHan = ngayHetHan;
    }

    public String getNgayHetHan() {
        return ngayHetHan;
    }

    public void show(){
        System.out.println("Ma Hang: " + maHang);
        System.out.println("Ten Hang: " + tenHang);
        System.out.println("Don gia: " + donGia);
        System.out.println("Ngay San Xuat: " + ngaySanXuat);
        System.out.println("Ngay het han " + ngayHetHan);KƯ
    }

    SimpleDateFormat ngayVietNam = new SimpleDateFormat("dd/MM/yyyy");
    
}
