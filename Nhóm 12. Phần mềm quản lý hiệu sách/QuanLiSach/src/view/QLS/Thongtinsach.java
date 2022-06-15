/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.QLS;

/**
 *
 * @author huy24
 */
public class Thongtinsach {
    String Masach;
    String Tensach;
    String Theloai;
    int Soluong;
    String Giaban;
    String NXB;
    String Tacgia;
    public Thongtinsach() {
    }

    public Thongtinsach(String Masach, String Tensach, String Theloai, int Soluong, String Giaban, String NXB, String Tacgia) {
        this.Masach = Masach;
        this.Tensach = Tensach;
        this.Theloai = Theloai;
        this.Soluong = Soluong;
        this.Giaban = Giaban;
        this.NXB = NXB;
        this.Tacgia = Tacgia;
    }

    public String getMasach() {
        return Masach;
    }

    public void setMasach(String Masach) {
        this.Masach = Masach;
    }

    public String getTensach() {
        return Tensach;
    }

    public void setTensach(String Tensach) {
        this.Tensach = Tensach;
    }

    public String getTheloai() {
        return Theloai;
    }

    public void setTheloai(String Theloai) {
        this.Theloai = Theloai;
    }

    public int getSoluong() {
        return Soluong;
    }

    public void setSoluong(int Soluong) {
        this.Soluong = Soluong;
    }

    public String getGiaban() {
        return Giaban;
    }

    public void setGiaban(String Giaban) {
        this.Giaban = Giaban;
    }

    public String getNXB() {
        return NXB;
    }

    public void setNXB(String NXB) {
        this.NXB = NXB;
    }

    public String getTacgia() {
        return Tacgia;
    }

    public void setTacgia(String Tacgia) {
        this.Tacgia = Tacgia;
    }
    
}
