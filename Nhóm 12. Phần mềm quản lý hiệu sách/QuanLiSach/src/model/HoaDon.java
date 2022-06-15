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
public class HoaDon {
    String maHD;
    String ngaytao;
    String tongtien;
    String tenkhachhang ;
    String diachi ;
    String sodienthoai ;
    String giotao;

    public HoaDon() {
    }

    public String getGiotao() {
        return giotao;
    }

    public void setGiotao(String giotao) {
        this.giotao = giotao;
    }

    public String getTongtien() {
        return tongtien;
    }

    public String getTenkhachhang() {
        return tenkhachhang;
    }

    public void setTenkhachhang(String tenkhachhang) {
        this.tenkhachhang = tenkhachhang;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getSodienthoai() {
        return sodienthoai;
    }

    public void setSodienthoai(String sodienthoai) {
        this.sodienthoai = sodienthoai;
    }

    public void setTongtien(String tongtien) {
        this.tongtien = tongtien;
    }

   
    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public String getNgaytao() {
        return ngaytao;
    }

    public void setNgaytao(String ngaytao) {
        this.ngaytao = ngaytao;
    }

    public HoaDon(String maHD, String ngaytao, String tongtien, String tenkhachhang, String diachi, String sodienthoai) {
        this.maHD = maHD;
        this.ngaytao = ngaytao;
        this.tongtien = tongtien;
        this.tenkhachhang = tenkhachhang;
        this.diachi = diachi;
        this.sodienthoai = sodienthoai;
    }
    
}
