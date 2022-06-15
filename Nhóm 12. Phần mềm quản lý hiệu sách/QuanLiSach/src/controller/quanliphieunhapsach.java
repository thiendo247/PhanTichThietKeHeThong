/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.nhapmasach;
import model.phieunhap;

/**
 *
 * @author huy24
 */
public class quanliphieunhapsach {

    public quanliphieunhapsach() {
    }
     public static Connection connect_db(){
    Connection conn = null;
try {
   
    // db parameters
    String url       = "jdbc:mysql://localhost:3306/quanlisach";
    String user      = "root";
    String password  = "";
    
     
    // create a connection to the database
    conn = DriverManager.getConnection(url, user, password);
    // more processing here
    // ...  
   
} catch(SQLException e) {
   System.out.println(e.getMessage());
} 
    
        return conn;
    }
    public boolean check_phieunhap(String maphieunhap) throws SQLException
    {
        Connection conn =connect_db();
            Statement st =conn.createStatement();
           
            String sql ="select Maphieunhap from phieunhap where Maphieunhap='"+maphieunhap+"'";
            ResultSet rs =st.executeQuery(sql);
            int i=0;
            while (rs.next()) {
                i++;
                
        }
            if(i==0)
            {
            return true;
            }
            else
                return false;
            
    
    }
    public ArrayList tim_sach(String masach) throws SQLException
    {
     Connection conn =connect_db();
            Statement st =conn.createStatement();
            ArrayList<nhapmasach> nms =new ArrayList<nhapmasach>();
            String sql ="select * from sachnhap where Masach='"+masach+"'";
            ResultSet rs =st.executeQuery(sql);
            while (rs.next()) {
                
                nhapmasach m =new nhapmasach(rs.getString("Masach"),rs.getString("Tensachnhap"),rs.getString("NXB"));
                nms.add(m);
            }
            return  nms;
    }
    public ArrayList get_maphieunhap() throws SQLException
    {
            Connection conn =connect_db();
            Statement st =conn.createStatement();
            ArrayList<phieunhap> nms =new ArrayList<phieunhap>();
            String sql ="select * from phieunhap,sachnhap where phieunhap.Masach=sachnhap.Masach ";
            ResultSet rs =st.executeQuery(sql);
            while (rs.next()) {
                phieunhap NMS =new phieunhap(rs.getString("NXB"),rs.getString("Tensachnhap"),rs.getString("Masach"),rs.getString("Maphieunhap"),rs.getString("ma_nv"),rs.getInt("Soluong")+"",rs.getString("Gianhap"),rs.getString("Ngaynhap"));
                nms.add(NMS);
        }
    return  nms ;
    }
    public ArrayList timkiem_phieunhap(String maphieunhap) throws SQLException
    {
            Connection conn =connect_db();
            Statement st =conn.createStatement();
            ArrayList<phieunhap> nms =new ArrayList<phieunhap>();
            String sql ="select * from phieunhap where Maphieunhap='"+maphieunhap+"'";
            ResultSet rs =st.executeQuery(sql);
            while (rs.next()) {
                phieunhap NMS =new phieunhap(rs.getString("NXB"),rs.getString("Tensachnhap"),rs.getString("Masach"),rs.getString("Maphieunhap"),rs.getString("ma_nv"),rs.getInt("Soluong")+"",rs.getString("Gianhap"),rs.getString("Ngaynhap"));
                nms.add(NMS);
        }
    return  nms ;
    }
    public void them_phieunhap(String maphieunhap,String masachnhap ,String manv ,String soluong ,String gianhap,String ngaynhap) throws SQLException
    {
            Connection conn =connect_db();
           
            String sql ="insert into phieunhap(Maphieunhap,ma_nv,Masach,Soluong,Gianhap,Ngaynhap) values(?,?,?,?,?,?)";
            PreparedStatement pst = (PreparedStatement) conn.prepareStatement(sql);
            pst.setString(1, maphieunhap);
            pst.setString(2, manv);
            pst.setString(3, masachnhap);
            pst.setString(4, soluong);
             pst.setString(5, gianhap);
              pst.setString(6, ngaynhap);
            pst.executeUpdate();
           
            
    }
     public void sua_phieunhap(String maphieunhap ,String soluong ,String gianhap,String ngaynhap) throws SQLException
    {
            Connection conn =connect_db();
            Statement st =conn.createStatement();
            String sql ="update phieunhap set Maphieunhap='"+maphieunhap+"',"+"Soluong="+soluong+", Gianhap='"+gianhap+"',"+" Ngaynhap='"+ngaynhap+"'"+" where Maphieunhap='"+maphieunhap+"'";
            st.executeUpdate(sql);
    }
      public void xoa_phieunhap(String maphieunhap) throws SQLException
    {
            Connection conn =connect_db();
            Statement st =conn.createStatement();
            String sql ="delete  from phieunhap where Maphieunhap='"+maphieunhap+"'";
            st.executeUpdate(sql);
    }
    
}
