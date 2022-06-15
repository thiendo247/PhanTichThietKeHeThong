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
public class HDNV {
    String ma_hd ;
    String ma_nv;

    public HDNV() {
    }

    public HDNV(String ma_hd, String ma_nv) {
        this.ma_hd = ma_hd;
        this.ma_nv = ma_nv;
    }

    public String getMa_hd() {
        return ma_hd;
    }

    public void setMa_hd(String ma_hd) {
        this.ma_hd = ma_hd;
    }

    public String getMa_nv() {
        return ma_nv;
    }

    public void setMa_nv(String ma_nv) {
        this.ma_nv = ma_nv;
    }
    
    
}
