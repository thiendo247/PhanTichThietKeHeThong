/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.QLS;

import controller.db;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import model.Laymasach;

/**
 *
 * @author Admin
 */
public class FormQLSach extends javax.swing.JFrame {

    DefaultTableModel tableModel;
    ArrayList<Sach> listsach = Sachcs.DSSach();

    /**
     * Creates new form FormQLSch
     */
    public FormQLSach() {
        initComponents();
         
        setLocationRelativeTo(null);
       
        tableModel = (DefaultTableModel) tblSach.getModel();
        HienthiSach();
        
    }

    private void HienthiSach() {
        listsach = Sachcs.DSSach();
        tableModel.setRowCount(0);
        for (Sach sach : listsach) {
            tableModel.addRow(sach.toArray());
        }
        

    }
    public void xuly()
    {
   
        db db =new db();
         if(txtmas.getText().length()>0)
        {
             System.out.println("huy");
            try {
                if(db.check_masach(txtmas.getText())==true)
                {
                    ArrayList<Laymasach> ls= db.Laysach(txtmas.getText());
                    for(Laymasach a :ls)
                    {
                        txtnxb.setText(a.getNxb());
                        txttens.setText(a.getTensachnhap());
                        txttacg.setText(a.getTacgia());
                        
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(FormQLSach.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
         else{
               txtnxb.setText("");
               txttens.setText("");
               txttacg.setText("");
         }
             
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSach = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtmas = new javax.swing.JTextField();
        txtdong = new javax.swing.JTextField();
        txttacg = new javax.swing.JTextField();
        txttens = new javax.swing.JTextField();
        buttonTimkiem = new javax.swing.JButton();
        buttonXoa = new javax.swing.JButton();
        buttonDong = new javax.swing.JButton();
        buttonSua = new javax.swing.JButton();
        cbthel = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        txtsol = new javax.swing.JTextField();
        buttonReset = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtnxb = new javax.swing.JTextField();
        buttonThem = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 51));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/sach.png"))); // NOI18N
        jLabel1.setText("QU???N L?? S??CH");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("M?? s??ch:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("T??n s??ch:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Th??? lo???i:");

        tblSach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "M?? s??ch", "T??n s??ch", "Th??? lo???i", "????n gi??", "S??? l?????ng", "Nh?? xu???t b???n", "T??c gi???"
            }
        ));
        tblSach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSachMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblSach);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("S??? l?????ng:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("????n gi??:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("T??c gi???:");

        txtmas.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                txtmasComponentAdded(evt);
            }
        });
        txtmas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtmasMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtmasMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtmasMouseReleased(evt);
            }
        });
        txtmas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmasActionPerformed(evt);
            }
        });
        txtmas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtmasKeyReleased(evt);
            }
        });

        txttens.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txttensMouseClicked(evt);
            }
        });

        buttonTimkiem.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        buttonTimkiem.setText("T??m ki???m");
        buttonTimkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTimkiemActionPerformed(evt);
            }
        });

        buttonXoa.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        buttonXoa.setText("X??a");
        buttonXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonXoaActionPerformed(evt);
            }
        });

        buttonDong.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        buttonDong.setText("????ng");
        buttonDong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDongActionPerformed(evt);
            }
        });

        buttonSua.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        buttonSua.setText("S???a");
        buttonSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSuaActionPerformed(evt);
            }
        });

        cbthel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "V??n h???c n?????c ngo??i", "Ngo???i ng???", "Truy???n thi???u nhi", "V??n h???c Vi???t Nam", " ", " " }));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Nh?? xu???t b???n:");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        buttonReset.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        buttonReset.setText("?????t l???i");
        buttonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonResetActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Ghi ch??:");

        buttonThem.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        buttonThem.setText("Th??m ");
        buttonThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonThemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(buttonTimkiem)
                .addGap(65, 65, 65)
                .addComponent(buttonThem, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(buttonSua, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addComponent(buttonXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(buttonReset, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(buttonDong, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(654, 654, 654)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txttens, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtmas, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbthel, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(469, 469, 469))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(550, 550, 550)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtsol, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtnxb, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtdong, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txttacg, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1218, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(388, 388, 388)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtmas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txttens, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtsol, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbthel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtnxb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(1, 1, 1)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txttacg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(8, 8, 8)))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonTimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonSua, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonDong, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonReset, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonThem, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonTimkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTimkiemActionPerformed
        // TODO add your handling code here:
        String data = JOptionPane.showInputDialog(this, "Nh???p t??n s??ch: ");
        if (data.length() > 0) {
            listsach = Sachcs.Timkiemtheoten(data);
            tableModel.setRowCount(0);
            for (Sach sach : listsach) {
                tableModel.addRow(sach.toArray());
            }

        }
    }//GEN-LAST:event_buttonTimkiemActionPerformed

    private void buttonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonResetActionPerformed
        txtmas.setText("");
        txttens.setText("");
        cbthel.setSelectedIndex(0);
        txtdong.setText("");
        txtsol.setText("");
        txtnxb.setText("");
        txttacg.setText("");
        HienthiSach();
    }//GEN-LAST:event_buttonResetActionPerformed

    private void txtmasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmasActionPerformed

    private void buttonThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonThemActionPerformed
        if (txtmas.getText().equals("")
                || txttens.getText().equals("")
                || txtdong.getText().equals("")
                || txtsol.getText().equals("")
                || txtnxb.getText().equals("")
                || txttacg.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "B???n ch??a nh???p ????? th??ng tin!");
            return;
        } else {
             int chiso = JOptionPane.showConfirmDialog(this, "B???n c?? ch???c ch???n mu???n th??m?");
       if(chiso == 0){
            String maS = txtmas.getText();
            String tenS = txttens.getText();
            String theL = cbthel.getSelectedItem().toString();
            float donG = Float.parseFloat(txtdong.getText());
            int soL = Integer.parseInt(txtsol.getText());
            String nhaXB = txtnxb.getText();
            String tacG = txttacg.getText();
            db db =new db();
                 try {
                     if(db.check_masach(maS)==true)
                     {
                        ArrayList<Laymasach>ls= db.Laysach(maS);
                        for(Laymasach a :ls)
                        {
                                txtnxb.setText(a.getNxb());
                                txttens.setText(a.getTensachnhap());
                                txttacg.setText(a.getTacgia());
                        
                        }
                         Sach s = new Sach(maS, tenS, theL, soL, donG, nhaXB, tacG);
                         try {
                             Sachcs.insert(s);
                             HienthiSach();
                         } catch (SQLException ex) {
                             JOptionPane.showMessageDialog(this, "L???i! Ki???m tra l???i m?? s??ch!");
                             
                         }
                     }
                     else
                     {
                         JOptionPane.showMessageDialog(this, "B???n nh???p ch??a ????ng m?? s??ch");
                     }    } catch (SQLException ex) {
                     Logger.getLogger(FormQLSach.class.getName()).log(Level.SEVERE, null, ex);
                 }
       }
    }//GEN-LAST:event_buttonThemActionPerformed
    }
    private void tblSachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSachMouseClicked
        // TODO add your handling code here:
        int hang = tblSach.getSelectedRow();
        if (hang >= 0) {
            String ma = (String) tblSach.getValueAt(hang, 0);
            listsach = Sachcs.TimkiemtheoMa(ma);
            Sach sach = listsach.get(0);
       
            if (sach != null) {
                String gia = sach.getGiaban()+"";
                String soluong = sach.getSoluong()+"";
                txtmas.setText(sach.getMasach());
                txttens.setText(sach.getTensach());
                cbthel.setToolTipText(sach.Theloai);
                txtdong.setText(gia);
                txtsol.setText(soluong);
                txtnxb.setText(sach.getNXB());
                txttacg.setText(sach.Tacgia);
            }
        }
    }//GEN-LAST:event_tblSachMouseClicked

    private void buttonSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSuaActionPerformed
        // TODO add your handling code here:
                if (txtmas.getText().equals("")
                || txttens.getText().equals("")
                || txtdong.getText().equals("")
                || txtsol.getText().equals("")
                || txtnxb.getText().equals("")
                || txttacg.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "B???n ch??a nh???p ????? th??ng tin!");
            return;
        } else {
                     int chiso = JOptionPane.showConfirmDialog(this, "B???n c?? ch???c mu???n s???a?");
       if(chiso == 0){
            String maS = txtmas.getText();
            String tenS = txttens.getText();
            String theL = cbthel.getSelectedItem().toString();
            float donG = Float.parseFloat(txtdong.getText());
            int soL = Integer.parseInt(txtsol.getText());
            String nhaXB = txtnxb.getText();
            String tacG = txttacg.getText();
            Sach s = new Sach(maS, tenS, theL, soL, donG, nhaXB, tacG);
            try {
                Sachcs.update(s);
                HienthiSach();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "L???i! Ki???m tra l???i m?? s??ch!");

            }
       }
    }  

    }//GEN-LAST:event_buttonSuaActionPerformed

    private void buttonXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonXoaActionPerformed
      String maS = txtmas.getText();
       int chiso = JOptionPane.showConfirmDialog(this, "B???n c?? ch???c mu???n xo????");
       if(chiso == 0){
           try {
               Sachcs.delete(maS);
               HienthiSach();
           } catch (SQLException ex) {
               Logger.getLogger(FormQLSach.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
    }//GEN-LAST:event_buttonXoaActionPerformed

    private void buttonDongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDongActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_buttonDongActionPerformed

    private void txtmasComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_txtmasComponentAdded
        // TODO add your handling code here:
       
    }//GEN-LAST:event_txtmasComponentAdded

    private void txtmasMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtmasMouseReleased
        // TODO add your handling code here:
         
    }//GEN-LAST:event_txtmasMouseReleased

    private void txtmasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtmasMousePressed
        // TODO add your handling code here:
        System.out.println(txtmas.getText());
    }//GEN-LAST:event_txtmasMousePressed

    private void txtmasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtmasMouseClicked
        // TODO add your handling code here:
       
    }//GEN-LAST:event_txtmasMouseClicked

    private void txttensMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txttensMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txttensMouseClicked

    private void txtmasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmasKeyReleased
        // TODO add your handling code here:
        db db =new db();
        try {
            if(txtmas.getText().length()>0&&db.check_masach(txtmas.getText())==true)
            {
                System.out.println("huy");
                try {
                    if(db.check_masach(txtmas.getText())==true)
                    {
                        ArrayList<Laymasach> ls= db.Laysach(txtmas.getText());
                        for(Laymasach a :ls)
                        {
                            txtnxb.setText(a.getNxb());
                            txttens.setText(a.getTensachnhap());
                            txttacg.setText(a.getTacgia());
                            
                        }
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(FormQLSach.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else{
                txtnxb.setText("");
                txttens.setText("");
                txttacg.setText("");
            }
        } catch (SQLException ex) {
            Logger.getLogger(FormQLSach.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtmasKeyReleased

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
            java.util.logging.Logger.getLogger(FormQLSach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormQLSach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormQLSach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormQLSach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormQLSach().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonDong;
    private javax.swing.JButton buttonReset;
    private javax.swing.JButton buttonSua;
    private javax.swing.JButton buttonThem;
    private javax.swing.JButton buttonTimkiem;
    private javax.swing.JButton buttonXoa;
    private javax.swing.JComboBox<String> cbthel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTable tblSach;
    private javax.swing.JTextField txtdong;
    private javax.swing.JTextField txtmas;
    private javax.swing.JTextField txtnxb;
    private javax.swing.JTextField txtsol;
    private javax.swing.JTextField txttacg;
    private javax.swing.JTextField txttens;
    // End of variables declaration//GEN-END:variables
}
