/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.QLNV;

import controller.db;
import java.awt.Color;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import model.nhanvien;

/**
 *
 * @author thien
 */
public class FormQLNV extends javax.swing.JFrame {

    /**
     * Creates new form FormQLNV
     */
    public FormQLNV() throws SQLException {
        initComponents();
        setLocationRelativeTo(null);
        showDataTable();
      
        
        
    }
    public void resettable()
    {
         DefaultTableModel dm = (DefaultTableModel)bang_nv.getModel();
while(dm.getRowCount() > 0)
{
    dm.removeRow(0);
}
    
    }
    public void updatetable() throws SQLException {
      DefaultTableModel dm = (DefaultTableModel)bang_nv.getModel();
while(dm.getRowCount() >0)
{
    dm.removeRow(0);
}
     showDataTable();
    }
   
    public void showDataTable() throws SQLException{
                
                db db =new db();
                db.getDataTable("nhanvien");
                ArrayList<nhanvien> list=new ArrayList<nhanvien>();
                list=db.getDataTable("nhanvien");
                DefaultTableModel model =(DefaultTableModel) bang_nv.getModel();
                for(nhanvien a : list){
                    System.out.println(a.getDiachi());
                    Object object[]={a.getMa_nv(),a.getTen_nv(),a.getGioitinh(),a.getNgaysinh(),a.getSodienthoai(),a.getDiachi()};
                    model.addRow(object);
                }
               
    }
    public void check(){
                if(ma_nv.getText().equalsIgnoreCase("")==true||ngaysinh.getText().equals("")==true||ten_nv.getText().equals("")==true||sodienthoai.getText().equals("")==true||diachi.getText().equals("")==true){
                    JOptionPane.showMessageDialog(rootPane, "Bạn phải nhập đầy đủ thông tin");
                
                }
    
    }
    public void clickRowTable(int index) throws SQLException{
                 db db =new db();
                db.getDataTable("nhanvien");
                ArrayList<nhanvien> list=new ArrayList<nhanvien>();
                list=db.getDataTable("nhanvien");
                DefaultTableModel model =(DefaultTableModel) bang_nv.getModel();
                Vector vector_nv=new Vector();
                
                for(nhanvien a : list){
                  
                    Vector vectorRow=new Vector();
                    vectorRow.add(a.getMa_nv());
                    vectorRow.add(a.getTen_nv());
                    vectorRow.add(a.getGioitinh());
                    vectorRow.add(a.getNgaysinh());
                    vectorRow.add(a.getSodienthoai());
                    vectorRow.add(a.getDiachi());
                    vector_nv.add(vectorRow);
                }
               
                Vector vector_selectRow=(Vector) vector_nv.get(index);
                ma_nv.setText((String) vector_selectRow.get(0));
                ten_nv.setText((String) vector_selectRow.get(1));
                String gioitinh=(String) vector_selectRow.get(2);
               
                if(gioitinh.equalsIgnoreCase("nam")){
                    nam_btn.setSelected(true);
                }
                else{
                    nu_btn.setSelected(true);
                }
                
                
                
//                ma_nv.setText((String) vector_selectRow.get(2));
               ngaysinh.setText((String) vector_selectRow.get(3));
                sodienthoai.setText((String) vector_selectRow.get(4));
                diachi.setText((String) vector_selectRow.get(5));
                
               
    
    }
    public void click(int index,String manv) throws SQLException
    {
                 db db =new db();
                db.getDataTable("nhanvien");
                ArrayList<nhanvien> list=new ArrayList<nhanvien>();
                list=db.Search_nv(manv);
                DefaultTableModel model =(DefaultTableModel) bang_nv.getModel();
                Vector vector_nv=new Vector();
                
                for(nhanvien a : list){
                  
                    Vector vectorRow=new Vector();
                    vectorRow.add(a.getMa_nv());
                    vectorRow.add(a.getTen_nv());
                    vectorRow.add(a.getGioitinh());
                    vectorRow.add(a.getNgaysinh());
                    vectorRow.add(a.getSodienthoai());
                    vectorRow.add(a.getDiachi());
                    vector_nv.add(vectorRow);
                }
               
                Vector vector_selectRow=(Vector) vector_nv.get(index);
                ma_nv.setText((String) vector_selectRow.get(0));
                ten_nv.setText((String) vector_selectRow.get(1));
                String gioitinh=(String) vector_selectRow.get(2);
               
                if(gioitinh.equalsIgnoreCase("nam")){
                    nam_btn.setSelected(true);
                }
                else{
                    nu_btn.setSelected(true);
                }
                
                
                
//                ma_nv.setText((String) vector_selectRow.get(2));
               ngaysinh.setText((String) vector_selectRow.get(3));
                sodienthoai.setText((String) vector_selectRow.get(4));
                diachi.setText((String) vector_selectRow.get(5));
                
               
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gioitinh_btn = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        bang_nv = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ma_nv = new javax.swing.JTextField();
        ngaysinh = new javax.swing.JTextField();
        sodienthoai = new javax.swing.JTextField();
        diachi = new javax.swing.JTextField();
        ten_nv = new javax.swing.JTextField();
        nam_btn = new javax.swing.JRadioButton();
        nu_btn = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        Search = new javax.swing.JButton();
        manv_search = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 51));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/nhanvien.png"))); // NOI18N
        jLabel1.setText("QUẢN LÝ NHÂN VIÊN");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Mã nhân viên");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Tên nhân viên");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Giới Tính");

        bang_nv.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã nhân viên", "Tên nhân viên", "Giới tính", "Ngày sinh", "SĐT", "Địa Chỉ"
            }
        ));
        bang_nv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bang_nvMouseClicked(evt);
            }
        });
        bang_nv.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                bang_nvKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(bang_nv);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Điện thoại");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Ngày sinh");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Địa chỉ");

        ma_nv.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        ngaysinh.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        sodienthoai.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        diachi.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        ten_nv.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        gioitinh_btn.add(nam_btn);
        nam_btn.setText("Nam");

        gioitinh_btn.add(nu_btn);
        nu_btn.setText("Nữ");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton1.setText("Thêm ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton4.setText("Xóa");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton5.setText("Đóng");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton6.setText("Sửa");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        Search.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Search.setText("Tìm kiếm");
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });

        manv_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manv_searchActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setText("Tìm kiếm theo mã nhân viên");

        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jButton2.setText("Danh sách");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addComponent(jButton2)
                .addGap(56, 56, 56)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ma_nv, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ten_nv, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(nam_btn)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 159, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sodienthoai, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(diachi, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ngaysinh, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(118, 118, 118))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(248, 248, 248))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(204, 204, 204)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nu_btn)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addComponent(manv_search, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, Short.MAX_VALUE)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ma_nv, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ten_nv, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nam_btn)
                            .addComponent(nu_btn)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ngaysinh, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(sodienthoai, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(diachi, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)))
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(manv_search, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void bang_nvKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bang_nvKeyReleased
        // TODO add your handling code here:
//         int selectRow=bang_nv.getSelectedRow();
//        try {
//            clickRowTable(selectRow);
//        } catch (SQLException ex) {
//            Logger.getLogger(FormQLNV.class.getName()).log(Level.SEVERE, null, ex);
//        }
       
    }//GEN-LAST:event_bang_nvKeyReleased

    private void bang_nvMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bang_nvMouseClicked
        // TODO add your handling code here:
         int selectRow=bang_nv.getSelectedRow();
        try {
            clickRowTable(selectRow);
            click(selectRow, manv_search.getText());
        } catch (SQLException ex) {
            Logger.getLogger(FormQLNV.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bang_nvMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       if(ma_nv.getText().equals("")==true||ten_nv.getText().equals("")==true||ngaysinh.getText().equals("")==true||diachi.getText().equals("")==true||sodienthoai.getText().equals("")==true)
        {
            JOptionPane.showMessageDialog(this, "Bạn phải nhập đầy đủ thông tin");
        }
        else{
        String Manv=ma_nv.getText();
        String Ngaysinh=ngaysinh.getText();
        String Diachi=diachi.getText();
        String Sodienthoai=sodienthoai.getText();
        String Tennv=ten_nv.getText();
        String Gioitinh="";
        if(nam_btn.isSelected())
        {
            Gioitinh="Nam";
            
        }
        if(nu_btn.isSelected())
        {
            Gioitinh="Nữ";
        }
       
        db db =new db();
           try {
               if(db.check_nv(Manv)==false){
                   JOptionPane.showMessageDialog(this, "Nhân viên này đã tồn tại trong hệ thống.Mời bạn nhập lại");
                   
               }   
               else{
                    try {
               db.addNV(Manv, Tennv, Ngaysinh, Gioitinh, Sodienthoai, Diachi);
               updatetable();
           } catch (SQLException ex) {
               Logger.getLogger(FormQLNV.class.getName()).log(Level.SEVERE, null, ex);
           }
               
               }
           } catch (SQLException ex) {
               Logger.getLogger(FormQLNV.class.getName()).log(Level.SEVERE, null, ex);
           }
          
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
         if(ma_nv.getText().equals("")==true||ten_nv.getText().equals("")==true||ngaysinh.getText().equals("")==true||diachi.getText().equals("")==true||sodienthoai.getText().equals("")==true)
        {
            JOptionPane.showMessageDialog(this, "Chưa có đầy đủ thông tin");
        }
         else{
               int check= JOptionPane.showConfirmDialog(this, "Bạn có chắc chắc muốn sửa");
                if(check==JOptionPane.YES_OPTION){
                          String Manv=ma_nv.getText();
        String Ngaysinh=ngaysinh.getText();
        String Diachi=diachi.getText();
        String Sodienthoai=sodienthoai.getText();
        String Tennv=ten_nv.getText();
        String Gioitinh="";
        if(nam_btn.isSelected())
        {
            Gioitinh="Nam";
            
        }
        if(nu_btn.isSelected())
        {
            Gioitinh="Nữ";
        }
        db db=new db();
                   try {
                       db.editt_nv(Manv, Tennv, Ngaysinh, Sodienthoai, Gioitinh, Diachi);
                       updatetable();
                   } catch (SQLException ex) {
                       Logger.getLogger(FormQLNV.class.getName()).log(Level.SEVERE, null, ex);
                   }
                }
                
         
         }
       
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
      
         if(ma_nv.getText().equals("")==true||ten_nv.getText().equals("")==true||ngaysinh.getText().equals("")==true||diachi.getText().equals("")==true||sodienthoai.getText().equals("")==true)
        {
            JOptionPane.showMessageDialog(this, "Chưa chọn dữ liệu để xóa");
        }
         else{
        int check =JOptionPane.showConfirmDialog(this, "bạn có chắc chắn xóa không");
       if(check==JOptionPane.YES_OPTION)
       {
           db db =new db();
           try {
               db.delete_nv(ma_nv.getText());
              
               updatetable();
           } catch (SQLException ex) {
               Logger.getLogger(FormQLNV.class.getName()).log(Level.SEVERE, null, ex);
           }
            
       }
         }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
        // TODO add your handling code here:
        if(manv_search.getText().equals("")==true)
        {
                JOptionPane.showMessageDialog(this, "Bạn chưa nhập mã nhân viên");
                manv_search.setBackground(Color.red);
        }
        else{
             manv_search.setBackground(Color.white);
             db db =new db();
            try {
                if(db.check_nv(manv_search.getText())==true)
                {
                   JOptionPane.showMessageDialog(this, "Nhân viên này không tồn tại");
                }
                else{
                  ArrayList<nhanvien> nv= db.Search_nv(manv_search.getText());
                 
                DefaultTableModel model =(DefaultTableModel) bang_nv.getModel();
                resettable();
                for(nhanvien a : nv){
                    System.out.println(a.getDiachi());
                    Object object[]={a.getMa_nv(),a.getTen_nv(),a.getGioitinh(),a.getNgaysinh(),a.getSodienthoai(),a.getDiachi()};
                    model.addRow(object);
                }
                  int selectRow=bang_nv.getSelectedRow();
        try {
            clickRowTable(selectRow);
        } catch (SQLException ex) {
            Logger.getLogger(FormQLNV.class.getName()).log(Level.SEVERE, null, ex);
        }
                }
            } catch (SQLException ex) {
                Logger.getLogger(FormQLNV.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
       
    }//GEN-LAST:event_SearchActionPerformed

    private void manv_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manv_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_manv_searchActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        resettable();
        try {
            showDataTable();
        } catch (SQLException ex) {
            Logger.getLogger(FormQLNV.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormQLNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormQLNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormQLNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormQLNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new FormQLNV().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(FormQLNV.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Search;
    private javax.swing.JTable bang_nv;
    private javax.swing.JTextField diachi;
    private javax.swing.ButtonGroup gioitinh_btn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField ma_nv;
    private javax.swing.JTextField manv_search;
    private javax.swing.JRadioButton nam_btn;
    private javax.swing.JTextField ngaysinh;
    private javax.swing.JRadioButton nu_btn;
    private javax.swing.JTextField sodienthoai;
    private javax.swing.JTextField ten_nv;
    // End of variables declaration//GEN-END:variables
}
