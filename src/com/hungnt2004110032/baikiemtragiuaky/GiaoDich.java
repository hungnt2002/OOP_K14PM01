package com.hungnt2004110032.baikiemtragiuaky;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public abstract class GiaoDich {
    
    private String maGiaoDich;
    private Date ngayGiaoDich;
    private double donGia;
    private float dienTich;
    private String loai;


    Scanner sc = new Scanner(System.in);
    SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");

    public void setMaGiaoDich(String maGiaoDich) {
        this.maGiaoDich = maGiaoDich;
    }

    public String getMaGiaoDich() {
        return maGiaoDich;
    }

    public void setNgayGiaoDich(Date ngayGiaoDich) {
        this.ngayGiaoDich = ngayGiaoDich;
    }

    public Date getNgayGiaoDich() {
        return ngayGiaoDich;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDienTich(float dienTich) {
        this.dienTich = dienTich;
    }

    public float getDienTich() {
        return dienTich;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public String getLoai() {
        return loai;
    }

    protected double tinhThanhTien() {
        return this.donGia * this.dienTich;
    }

    protected abstract void tinhTongSoLuong();


    protected void nhapDanhSach() throws ParseException {

        System.out.print("Nhap ma giao dich: ");
        setMaGiaoDich(sc.nextLine());
        System.out.print("Nhap ngay giao dich: ");
        setNgayGiaoDich(date.parse(sc.nextLine()));
        System.out.print("Nhap don gia: ");
        setDonGia(sc.nextDouble());
        System.out.print("Nhap dien tich: ");
        setDienTich(sc.nextFloat());
    }

    
    protected void inThongTin() {

        System.out.println("Ma giao dich: " + getMaGiaoDich());
        System.out.println("Ngay giao dich: " + getNgayGiaoDich());
        System.out.println("Don gia: " + getDonGia());
        System.out.println("Dien tich: " + getDienTich() + " m2");

    }

}
