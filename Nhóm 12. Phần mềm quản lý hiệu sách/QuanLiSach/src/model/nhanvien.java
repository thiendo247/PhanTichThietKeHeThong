/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author thien
 */
public class nhanvien {
    String ma_nv;
    String ten_nv;
    String ngaysinh;
    String gioitinh;
    String sodienthoai;
    String diachi;

    public nhanvien() {
    }

    public nhanvien(String ma_nv, String ten_nv, String ngaysinh, String gioitinh, String sodienthoai, String diachi) {
        this.ma_nv = ma_nv;
        this.ten_nv = ten_nv;
        this.ngaysinh = ngaysinh;
        this.gioitinh = gioitinh;
        this.sodienthoai = sodienthoai;
        this.diachi = diachi;
    }

    public nhanvien(String ma_nv, String ten_nv, String sodienthoai) {
        this.ma_nv = ma_nv;
        this.ten_nv = ten_nv;
        this.sodienthoai = sodienthoai;
    }
    
    public String getMa_nv() {
        return ma_nv;
    }

    public void setMa_nv(String ma_nv) {
        this.ma_nv = ma_nv;
    }

    public String getTen_nv() {
        return ten_nv;
    }

    public void setTen_nv(String ten_nv) {
        this.ten_nv = ten_nv;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getSodienthoai() {
        return sodienthoai;
    }

    public void setSodienthoai(String sodienthoai) {
        this.sodienthoai = sodienthoai;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }
    
   
    
}
