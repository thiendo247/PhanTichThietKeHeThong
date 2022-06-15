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
public class Laymasach {
    String tensachnhap ;
    String nxb;
    String tacgia;
    public Laymasach() {
    }

    public Laymasach(String tensachnhap, String nxb, String tacgia) {
        this.tensachnhap = tensachnhap;
        this.nxb = nxb;
        this.tacgia = tacgia;
    }

   

    public String getTacgia() {
        return tacgia;
    }

    public void setTacgia(String tacgia) {
        this.tacgia = tacgia;
    }

    public String getTensachnhap() {
        return tensachnhap;
    }

    public void setTensachnhap(String tensachnhap) {
        this.tensachnhap = tensachnhap;
    }

    public String getNxb() {
        return nxb;
    }

    public void setNxb(String nxb) {
        this.nxb = nxb;
    }
    
}
