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
import javax.swing.table.DefaultTableModel;
import model.ChiTietHoaDon;
import model.HDNV;
import model.login_model;
import model.nhanvien;
import model.HoaDon;
import model.KhachHang;
import model.Laymasach;
import view.QLS.Sach;
import view.QLS.Thongtinsach;

/**
 *
 * @author huy24
 */
public class db {
   

    public db() {
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
    public boolean check_ql_nv(String username) throws SQLException
    {
        Connection conn=connect_db();
          String sql = "SELECT chucvu " +
             "FROM User where username='"+username+"'";
          Statement stmt= conn.createStatement();
          ResultSet rs    = stmt.executeQuery(sql);
    String chucvu ="";   
while (rs.next()) {
    chucvu=rs.getString("chucvu");
    
    
}
        if(chucvu.equalsIgnoreCase("quanli"))
        {
        return false;
        }
        else
            return true;
        
        
    
    }
    public boolean checkAccount(String user,String password) throws SQLException{
      Connection conn=connect_db();
      boolean check=true;
      ArrayList<login_model> login_Model=new ArrayList<login_model>();
        
       
      
       Statement stmt= conn.createStatement();
        String sql = "SELECT * " +
             "FROM User";
 
ResultSet rs    = stmt.executeQuery(sql);
       
while (rs.next()) {
    login_model login=new login_model();
    login.setUsername(rs.getString("username"));
    login.setPassword(rs.getString("password"));
    login_Model.add(login);
//   System.out.println(
//           
//           rs.getString("id") + "\t" + 
//                      rs.getString("username")  + "\t" +rs.getString("password"));
//                   
//                     
}
        for(login_model a : login_Model){
            if(a.getUsername().equalsIgnoreCase(user)==true&&a.getPassword().equalsIgnoreCase(password)==true){
                    check=true;
                    break;
            }
            else
            {
                check=false;
            }
        }
    return  check;
    }
   
    
    public ArrayList getDataTable(String table_name) throws SQLException{
                Connection conn =connect_db();
                ArrayList<nhanvien> Nhan_Vien=new ArrayList<nhanvien>();
         Statement stmt= conn.createStatement();
          String sql = "SELECT * " +
             "FROM "+table_name;
 
           ResultSet rs    = stmt.executeQuery(sql);
          while (rs.next()) {
    nhanvien nhan_vien=new nhanvien();
    nhan_vien.setMa_nv(rs.getString("ma_nv"));
    nhan_vien.setTen_nv(rs.getString("ten_nv"));
    nhan_vien.setNgaysinh(rs.getString("Ngaysinh_nv"));
    nhan_vien.setGioitinh(rs.getString("Gioitinh_nv"));
    nhan_vien.setSodienthoai(rs.getString("Sdt_nv"));
    nhan_vien.setDiachi(rs.getString("Diachi_nv"));
    Nhan_Vien.add(nhan_vien);}
          return Nhan_Vien;
          
          
    
    
    }
    public boolean  check_masach(String masach) throws SQLException
    {
        Connection conn =connect_db();
        Statement st =conn.createStatement();
        String sql ="select Masach from sachnhap";
        ResultSet rs =st.executeQuery(sql);
        boolean check =false;
        while (rs.next()) {            
            if(masach.equalsIgnoreCase(rs.getString("Masach"))==true)
            {
            check =true;
            break;
            }
            else
                check=false;
        }
        
        return  check;
            
    
    }
    public ArrayList Laysach(String masach) throws SQLException
    {
        Connection conn =connect_db();
        Statement st =conn.createStatement();
        ArrayList<Laymasach> lms =new ArrayList<Laymasach>();
        String sql ="select * from sachnhap where Masach='"+masach+"'";
        ResultSet rs =st.executeQuery(sql);
        while (rs.next()) {
            Laymasach LMS =new Laymasach();
            LMS.setTacgia(rs.getString("tacgia"));
            LMS.setNxb(rs.getString("NXB"));
            LMS.setTensachnhap(rs.getString("Tensachnhap"));
            lms.add(LMS);
        }
        return  lms;
    
    }
    public ArrayList getDataTable_sach(String table_name) throws SQLException{
                Connection conn =connect_db();
                ArrayList<Thongtinsach> Nhan_Vien=new ArrayList<Thongtinsach>();
         Statement stmt= conn.createStatement();
          String sql = "SELECT * " +
             "FROM "+table_name;
 
           ResultSet rs    = stmt.executeQuery(sql);
          while (rs.next()) {
              Thongtinsach nhan_vien=new Thongtinsach();
    nhan_vien.setMasach(rs.getString("Masach"));
    nhan_vien.setTensach(rs.getString("Tensach"));
    nhan_vien.setTheloai(rs.getString("Theloai"));
    nhan_vien.setSoluong(rs.getInt("Soluong"));
    nhan_vien.setGiaban(rs.getString("Giaban"));
    nhan_vien.setNXB(rs.getString("NXB"));
    nhan_vien.setTacgia(rs.getString("Tacgia"));
    Nhan_Vien.add(nhan_vien);}
          return Nhan_Vien;
          
          
    
    
    }
    public ArrayList getDataTable_chitiethoadon(String table_name) throws SQLException{
                Connection conn =connect_db();
                ArrayList<ChiTietHoaDon> chitiethoadon=new ArrayList<ChiTietHoaDon>();
         Statement stmt= conn.createStatement();
          String sql = "SELECT * " +
             "FROM "+table_name;
 
           ResultSet rs    = stmt.executeQuery(sql);
          while (rs.next()) {
              ChiTietHoaDon cthd=new ChiTietHoaDon();
    cthd.setMasach(rs.getString("Masach"));
    cthd.setTensach(rs.getString("Tensach"));
    cthd.setDongia(rs.getString("Giaban"));
   
   
    chitiethoadon.add(cthd);}
          return chitiethoadon;
          
          
    
    
    }
    public void addNV(String ma_nv,String ten_nv,String gioitinh,String ngaysinh,String sodienthoai,String diachi) throws SQLException{
        Connection conn =connect_db();
                ArrayList<nhanvien> Nhan_Vien=new ArrayList<nhanvien>();
//         Statement stmt= conn.createStatement();
          String sql = "INSERT INTO nhanvien(ma_nv,ten_nv,Ngaysinh_nv,Gioitinh_nv,Sdt_nv,Diachi_nv) values(?,?,?,?,?,?) " ;
            
          PreparedStatement pst =conn.prepareStatement(sql);
          pst.setString(1, ma_nv);
          
          pst.setString(2, ten_nv);
          pst.setString(3, gioitinh);
          pst.setString(4, ngaysinh);
          pst.setString(5, sodienthoai);
          pst.setString(6, diachi);
         System.out.println(pst.executeUpdate());
         
//         String sql_nv="select * from nhanvien";
//          ArrayList<nhanvien> NhanVien=new ArrayList<nhanvien>();
//         Statement stmt_nv= conn.createStatement();
//         PreparedStatement pst_nv =conn.prepareStatement(sql_nv);
//         
         
        
    
    }
    public void delete_nv(String a) throws SQLException
    {
      Connection conn =connect_db();
                ArrayList<nhanvien> Nhan_Vien=new ArrayList<nhanvien>();
         
          String sql = "delete from nhanvien where  ma_nv='"+a+"'" ;
          Statement stmt= conn.createStatement();
          stmt.executeUpdate(sql);
          
    }
         
    public ArrayList Search_nv(String a) throws SQLException{
        Connection conn =connect_db();
        ArrayList<nhanvien> Nhan_Vien=new ArrayList<nhanvien>();
        
        String sql="select * from nhanvien where ma_nv='"+a+"'";
        Statement stmt= conn.createStatement();
        ResultSet rs    = stmt.executeQuery(sql);
        
        while (rs.next()) {
        nhanvien nhan_vien=new nhanvien();
        nhan_vien.setMa_nv(rs.getString("ma_nv"));
        nhan_vien.setTen_nv(rs.getString("ten_nv"));
        nhan_vien.setNgaysinh(rs.getString("Ngaysinh_nv"));
        nhan_vien.setGioitinh(rs.getString("Gioitinh_nv"));
        nhan_vien.setSodienthoai(rs.getString("Sdt_nv"));
        nhan_vien.setDiachi(rs.getString("Diachi_nv"));
        Nhan_Vien.add(nhan_vien);}
              return Nhan_Vien;
          
    
    }
    public boolean check_nv(String a) throws SQLException{
        Connection conn =connect_db();
        
        String sql="select * from nhanvien where ma_nv='"+a+"'";
//        PreparedStatement pst =conn.prepareStatement(sql);
//       pst.setString(1, a);
//      pst.execute();
        Statement st=conn.createStatement();
       ResultSet rs=  st.executeQuery(sql);
       int i=0;
        while (rs.next()) {            
            i++;
           
        }
        if(i==0){
        return true;
        }
        else
            return false;
        
        

    }
    public void editt_nv(String a,String tennv,String ngaysinh,String sdt,String gioitinh,String diachi) throws SQLException{
                 Connection conn =connect_db();
                ArrayList<nhanvien> Nhan_Vien=new ArrayList<nhanvien>();
         Statement stmt= conn.createStatement();
          String sql = "update nhanvien set ten_nv=?,Ngaysinh_nv=?,Gioitinh_nv=?,Sdt_nv=?,Diachi_nv=?"
            + " where ma_nv=?";
          PreparedStatement m =conn.prepareStatement(sql);
          
           m.setString(1, tennv);
            m.setString(2, ngaysinh);
             m.setString(3, gioitinh);
              m.setString(4, sdt);
               m.setString(5, diachi);
               m.setString(6, a);
          m.execute();
          
           
           
          
    
    
    }
    //phần hóa đơn
    public void chitiet_hd(String ma_hd,String ma_sach ,String ten_sach ,int so_luong ,String don_gia ,String thanh_tien ) throws SQLException{
            Connection conn =connect_db();
          
            ArrayList<ChiTietHoaDon> cthd =new ArrayList<ChiTietHoaDon>();
            String sql_cthd ="insert into chi_tiet_hd(ma_sach,ten_sach,so_luong,don_gia,thanh_tien,ma_hd) values(?,?,?,?,?,?)";
            PreparedStatement pst_cthd =conn.prepareStatement(sql_cthd);
            
            pst_cthd.setString(1, ma_sach);
             pst_cthd.setString(2, ten_sach);
              pst_cthd.setInt(3, so_luong);
               pst_cthd.setString(4, don_gia);
                pst_cthd.setString(5, thanh_tien);
                 pst_cthd.setString(6, ma_hd);
                 pst_cthd.executeUpdate();
                  ArrayList<HDNV> hdnv =new ArrayList<HDNV>();
//            String sql_hdnv ="insert into hoadon_nhanvien(ma_hd,ma_nv) values(?,?)";
//            
//            PreparedStatement pst_hdnv =conn.prepareStatement(sql);
//            pst_hdnv.setString(1, ma_hd);
//            pst_hdnv.setString(2, ma_nv);
//            pst_hdnv.executeUpdate();
    
    }
    public void hoadon(String ma_hd ,String ngaytao,String tongtien,String ten ,String diachi ,String sodienthoai ,String ma_nv) throws SQLException{
             Connection conn =connect_db();
            ArrayList<HoaDon> hoadons =new ArrayList<>();
            String sql ="insert into hoadon(ma_hd,ngaytao,tongtien,ten_kh,diachi_kh,sdt_kh,ma_nv) values(?,?,?,?,?,?,?)";
            
            PreparedStatement pst =conn.prepareStatement(sql);
            pst.setString(1, ma_hd);
            pst.setString(2, ngaytao);
            pst.setString(3, tongtien);
            pst.setString(4, ten);
            pst.setString(5, diachi);
            pst.setString(6, sodienthoai);
            pst.setString(7, ma_nv);
           
            pst.executeUpdate();
    }
    public ArrayList get_hd() throws SQLException
    {
         Connection conn =connect_db();
         ArrayList<HoaDon> hoadons =new ArrayList<HoaDon>();
         String sql ="select * from hoadon";
         Statement st =conn.createStatement();
         ResultSet rs =st.executeQuery(sql);
         while (rs.next()) {            
            HoaDon hd =new HoaDon();
            hd.setTongtien(rs.getString("tongtien"));
            hd.setMaHD(rs.getString("ma_hd"));
            hd.setNgaytao(rs.getString("ngaytao"));
            
            hoadons.add(hd);
        }
         return hoadons;
         
        
    
    }
    public ArrayList timkiemhoadon(String ngaytao) throws SQLException
    {
         Connection conn =connect_db();
         ArrayList<HoaDon> hoadons =new ArrayList<HoaDon>();
         String sql ="select * from hoadon where ngaytao='"+ngaytao+"'";
             Statement st =conn.createStatement();
         ResultSet rs =st.executeQuery(sql);
         while (rs.next()) {            
            HoaDon hd =new HoaDon();
            hd.setTongtien(rs.getString("tongtien"));
            hd.setMaHD(rs.getString("ma_hd"));
            hd.setNgaytao(rs.getString("ngaytao"));
            hoadons.add(hd);
        }
         return  hoadons;
    
    }
    public ArrayList Thongke_chitiehoadon(String macthd) throws SQLException
    {
        Connection conn =connect_db();
        ArrayList<ChiTietHoaDon> cthd =new ArrayList<>();
        String sql ="select * from chi_tiet_hd where ma_hd='"+macthd+"'";
        Statement st =conn.createStatement();
        ResultSet rs =st.executeQuery(sql);
        while (rs.next()) {
            ChiTietHoaDon Cthd=new ChiTietHoaDon();
            Cthd.setMasach(rs.getString("ma_sach"));
            Cthd.setTensach(rs.getString("ten_sach"));
            Cthd.setSoluong(rs.getString("so_luong"));
            Cthd.setDongia(rs.getString("don_gia"));
            Cthd.setThanhtien(rs.getString("thanh_tien"));
            cthd.add(Cthd);
            
        }
        return  cthd;
        
    
    }
    public ArrayList Thongke_nhanvien(String macthd) throws SQLException
    {
        Connection conn =connect_db();
        ArrayList<nhanvien> NV =new ArrayList<nhanvien>();
        String sql ="select * from nhanvien,hoadon where nhanvien.ma_nv=hoadon.ma_nv and hoadon.ma_hd='"+macthd+"'";
        Statement st =conn.createStatement();
        ResultSet rs =st.executeQuery(sql);
        while (rs.next()) {
            nhanvien nv=new nhanvien();
            nv.setMa_nv(rs.getString("ma_nv"));
            nv.setTen_nv(rs.getString("ten_nv"));
            nv.setSodienthoai(rs.getString("Sdt_nv"));
           NV.add(nv);
            
        }
        return  NV;
        
    
    }
    public ArrayList Thongke_khachhang(String macthd) throws SQLException
    {
        Connection conn =connect_db();
        ArrayList<KhachHang> KH =new ArrayList<KhachHang>();
        String sql ="select * from hoadon where ma_hd='"+macthd+"'";
        Statement st =conn.createStatement();
        ResultSet rs =st.executeQuery(sql);
        while (rs.next()) {
            KhachHang kh=new KhachHang();
            kh.setTenkh(rs.getString("ten_kh"));
            kh.setDiachi(rs.getString("diachi_kh"));
            kh.setSodienthoai(rs.getString("sdt_kh"));
           KH.add(kh);
            
        }
        return  KH;
        
    
    }
    
public static void main(String[] args) throws SQLException {
        db a=new db();
        System.out.println(a.checkAccount("huynguyen","12345")); 
        System.out.println( a.check_nv("a"));
    }
   
}
