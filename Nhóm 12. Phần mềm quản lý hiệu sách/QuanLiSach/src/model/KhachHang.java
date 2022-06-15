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
public class KhachHang {
   
    String tenkh;
    String diachi ;
    String sodienthoai;

    public KhachHang() {
    }

    public KhachHang( String tenkh, String diachi, String sodienthoai) {
       
        this.tenkh = tenkh;
        this.diachi = diachi;
        this.sodienthoai = sodienthoai;
    }

   

    public String getTenkh() {
        return tenkh;
    }

    public void setTenkh(String tenkh) {
        this.tenkh = tenkh;
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
    
}
