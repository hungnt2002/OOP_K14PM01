package com.hungnt2004110032.tuan3.buoi6;

public class HinhChuNhat {
    // attribute
    private double chieuDai;
    private double chieuRong;

    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }
    
    public double getChieuDai() {
        return chieuDai;
    }

    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }



    public double getChieuRong() {
        return chieuRong;
    }

    public double tinhDienTich(){
        return this.chieuDai * this.chieuRong;
    }
    
    public double tinhChuVi(){
        return (this.chieuDai + this.chieuRong)*2;
    }

    public String toString(){
        String string = "Chieu dai: " + this.chieuDai + "Chieu rong: " + this.chieuRong;
        string += "Chu vi" + this.tinhChuVi() + "Dien tich: " + this.tinhDienTich();
        return string;
    }

}
