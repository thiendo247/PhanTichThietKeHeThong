/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author huy24
 */
public class ChiTietHoaDon {
    String masach ;
    String tensach ;
    String soluong;
    String dongia ;
    String thanhtien ;

    public ChiTietHoaDon() {
    }

    public ChiTietHoaDon(String masach, String tensach, String soluong, String dongia) {
        this.masach = masach;
        this.tensach = tensach;
        this.soluong = soluong;
        this.dongia = dongia;
    }

    public String getMasach() {
        return masach;
    }

    public void setMasach(String masach) {
        this.masach = masach;
    }

    public String getTensach() {
        return tensach;
    }

    public void setTensach(String tensach) {
        this.tensach = tensach;
    }

    public String getSoluong() {
        return soluong;
    }

    public void setSoluong(String soluong) {
        this.soluong = soluong;
    }

    public String getDongia() {
        return dongia;
    }

    public void setDongia(String dongia) {
        this.dongia = dongia;
    }

    public String getThanhtien() {
        return thanhtien;
    }

    public void setThanhtien(String thanhtien) {
        this.thanhtien = thanhtien;
    }

    public ChiTietHoaDon(String masach, String tensach, String soluong, String dongia, String thanhtien) {
        this.masach = masach;
        this.tensach = tensach;
        this.soluong = soluong;
        this.dongia = dongia;
        this.thanhtien = thanhtien;
    }
    
    public String thanhtien()
    {
        
        return ""+Double.parseDouble(dongia)*Double.parseDouble(soluong)+"";
    
    }
  
    
}
