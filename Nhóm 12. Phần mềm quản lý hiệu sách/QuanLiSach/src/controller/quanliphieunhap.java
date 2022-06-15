/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

//import com.mysql.cj.xdevapi.PreparableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.nhapmasach;

/**
 *
 * @author huy24
 */
public class quanliphieunhap {

    public quanliphieunhap() {
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
    public boolean check_masach(String masach) throws SQLException
    {
        Connection conn =connect_db();
            Statement st =conn.createStatement();
           
            String sql ="select Masach from sachnhap where Masach='"+masach+"'";
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
    public ArrayList get_masach() throws SQLException
    {
            Connection conn =connect_db();
            Statement st =conn.createStatement();
            ArrayList<nhapmasach> nms =new ArrayList<nhapmasach>();
            String sql ="select * from sachnhap";
            ResultSet rs =st.executeQuery(sql);
            while (rs.next()) {
                nhapmasach NMS =new nhapmasach(rs.getString("Masach"),rs.getString("Tensachnhap"),rs.getString("NXB"),rs.getString("tacgia"));
                nms.add(NMS);
        }
    return  nms ;
    }
    public ArrayList timkiem_masach(String masach) throws SQLException
    {
            Connection conn =connect_db();
            Statement st =conn.createStatement();
            ArrayList<nhapmasach> nms =new ArrayList<nhapmasach>();
            String sql ="select * from sachnhap where Masach='"+masach+"'";
            ResultSet rs =st.executeQuery(sql);
            while (rs.next()) {
                nhapmasach NMS =new nhapmasach(rs.getString("Masach"),rs.getString("Tensachnhap"),rs.getString("NXB"),rs.getString("tacgia"));
                nms.add(NMS);
        }
    return  nms ;
    }
    public void them_masach(String masach ,String tensach ,String nxb ,String tacgia) throws SQLException
    {
            Connection conn =connect_db();
           
            String sql ="insert into sachnhap(Masach,Tensachnhap,NXB,tacgia) values(?,?,?,?)";
            PreparedStatement pst = (PreparedStatement) conn.prepareStatement(sql);
            pst.setString(1, masach);
            pst.setString(2, tensach);
            pst.setString(3, nxb);
            pst.setString(4, tacgia);
            pst.executeUpdate();
           
            
    }
     public void sua_masach(String masach ,String tensach ,String nxb ,String tacgia) throws SQLException
    {
            Connection conn =connect_db();
            Statement st =conn.createStatement();
            String sql ="update sachnhap set Tensachnhap='"+tensach+"',"+ "NXB='"+nxb+"',"+"tacgia='"+tacgia+"' where Masach='"+masach+"'";
            st.executeUpdate(sql);
    }
      public void xoa_masach(String masach) throws SQLException
    {
            Connection conn =connect_db();
            Statement st =conn.createStatement();
            String sql ="delete  from sachnhap where Masach='"+masach+"'";
            st.executeUpdate(sql);
    }
}
