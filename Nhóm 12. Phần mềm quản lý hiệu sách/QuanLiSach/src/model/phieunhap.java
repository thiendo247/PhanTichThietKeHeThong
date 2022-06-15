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
public class phieunhap {
    String maphieunhap ;
    String manv ;
    String masach;
    String soluong ;
    String gianhap ;
    String ngaynhap ;
    String nxb ;
    String tensach ;

    public phieunhap() {
    }

    public phieunhap(String nxb ,String tensach,String masach,String maphieunhap, String manv, String soluong, String gianhap, String ngaynhap) {
        this.maphieunhap = maphieunhap;
        this.manv = manv;
        this.soluong = soluong;
        this.gianhap = gianhap;
        this.ngaynhap = ngaynhap;
        this.masach=masach;
        this.nxb=nxb ;
        this.tensach=tensach;
    }

    public String getNxb() {
        return nxb;
    }

    public void setNxb(String nxb) {
        this.nxb = nxb;
    }

    public String getTensach() {
        return tensach;
    }

    public void setTensach(String tensach) {
        this.tensach = tensach;
    }
    

    public String getMasach() {
        return masach;
    }

    public void setMasach(String masach) {
        this.masach = masach;
    }

    public String getMaphieunhap() {
        return maphieunhap;
    }

    public void setMaphieunhap(String maphieunhap) {
        this.maphieunhap = maphieunhap;
    }

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

   
    public String getSoluong() {
        return soluong;
    }

    public void setSoluong(String soluong) {
        this.soluong = soluong;
    }

    public String getGianhap() {
        return gianhap;
    }

    public void setGianhap(String gianhap) {
        this.gianhap = gianhap;
    }

    public String getNgaynhap() {
        return ngaynhap;
    }

    public void setNgaynhap(String ngaynhap) {
        this.ngaynhap = ngaynhap;
    }
    
}
