/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.QLS;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class Sachcs {

    public static ArrayList<Sach> DSSach() {
        ArrayList<Sach> listS = new ArrayList<>();
        Connection conn = Kncsdl.getConnection();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from sach");
            while (rs.next()) {
                String msach = rs.getString("Masach");
                String tsach = rs.getString("Tensach");
                String tloai = rs.getString("Theloai");
                int sluong = rs.getInt("Soluong");
                Float gban = rs.getFloat("Giaban");
                String nxb = rs.getString("NXB");
                String tgia = rs.getString("Tacgia");
                Sach s = new Sach(msach, tsach, tloai, sluong, gban, nxb, tgia);
                listS.add(s);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Sachcs.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listS;
    }

    public static ArrayList<Sach> Timkiemtheoten( String Tensach) {
        ArrayList<Sach> listS = new ArrayList<>();
        Connection conn = Kncsdl.getConnection();
        try {
            String sql = "select * from sach where Tensach like ?";
            PreparedStatement ps = conn.prepareCall(sql);
            ps.setString(1, "%" + Tensach + "%");
            ResultSet rs = ps.executeQuery();
             while (rs.next()) {
                String msach = rs.getString("Masach");
                String tsach = rs.getString("Tensach");
                String tloai = rs.getString("Theloai");
                int sluong = rs.getInt("Soluong");
                Float gban = rs.getFloat("Giaban");
                String nxb = rs.getString("NXB");
                String tgia = rs.getString("Tacgia");
                Sach s = new Sach(msach, tsach, tloai, sluong, gban, nxb, tgia);
                listS.add(s);
             }
        } catch (SQLException ex) {
            Logger.getLogger(Sachcs.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listS;
    }
    public static ArrayList<Sach> TimkiemtheoMa( String Masach) {
        ArrayList<Sach> listS = new ArrayList<>();
        Connection conn = Kncsdl.getConnection();
        try {
            String sql = "select * from sach where Masach = ?";
            PreparedStatement ps = conn.prepareCall(sql);
            ps.setString(1, Masach );
            ResultSet rs = ps.executeQuery();
             while (rs.next()) {
                String msach = rs.getString("Masach");
                String tsach = rs.getString("Tensach");
                String tloai = rs.getString("Theloai");
                int sluong = rs.getInt("Soluong");
                Float gban = rs.getFloat("Giaban");
                String nxb = rs.getString("NXB");
                String tgia = rs.getString("Tacgia");
                Sach s = new Sach(msach, tsach, tloai, sluong, gban, nxb, tgia);
                listS.add(s);
             }
        } catch (SQLException ex) {
            Logger.getLogger(Sachcs.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listS;
    }

    public static void insert(Sach sach) throws SQLException {
        Connection conn = Kncsdl.getConnection();
        String sql = "insert into sach(Masach, Tensach, Theloai, Soluong, Giaban, NXB, Tacgia) values (?,?,?,?,?,?,?)";
        PreparedStatement ps = conn.prepareCall(sql);
        ps.setString(1, sach.getMasach());
        ps.setString(2, sach.getTensach());
        ps.setString(3, sach.getTheloai());
        ps.setInt(4, sach.getSoluong());
        ps.setFloat(5, sach.getGiaban());
        ps.setString(6, sach.getNXB());
        ps.setString(7, sach.getTacgia());
        ps.execute();
    }
    public static void update(Sach sach) throws SQLException {
        Connection conn = Kncsdl.getConnection();
        String sql = "update sach set Tensach = ?, Theloai = ?, Soluong = ?, Giaban = ?, NXB = ?, Tacgia = ? where Masach = ?";
        PreparedStatement ps = conn.prepareCall(sql);
        ps.setString(7, sach.getMasach());
        ps.setString(1, sach.getTensach());
        ps.setString(2, sach.getTheloai());
        ps.setInt(3, sach.getSoluong());
        ps.setFloat(4, sach.getGiaban());
        ps.setString(5, sach.getNXB());
        ps.setString(6, sach.getTacgia());
        ps.execute();
    }

    public static void delete(String Masach) throws SQLException {
        Connection conn = Kncsdl.getConnection();
        String sql = "delete from sach where Masach = ?";
        PreparedStatement ps = conn.prepareCall(sql);
        ps.setString(1, Masach);
        ps.execute();
    }
}
