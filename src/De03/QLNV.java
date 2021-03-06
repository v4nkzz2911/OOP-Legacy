/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package De03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import static java.lang.System.exit;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author er1nzz
 */
public class QLNV extends javax.swing.JFrame {

    /**
     * Creates new form QLNV
     */
    ArrayList<NhanVien> ds = new ArrayList();
    String[] header = {"Họ tên", "Ngày sinh", "Địa chỉ", "Giới tính", "Phòng ban", "Hệ số lương", "Thâm niên", "Lương cơ bản", "Lương thực lĩnh"};
    DefaultTableModel model = new DefaultTableModel(header,0);
    public QLNV() {
        initComponents();    
        txtpaneSalary.setEditable(false);
        tblResult.setModel(model);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtBirtday = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtSalaryRate = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtSeniority = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtSalaryBase = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        radMale = new javax.swing.JRadioButton();
        radFemale = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        cbDepartment = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtpaneSalary = new javax.swing.JTextPane();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblResult = new javax.swing.JTable();
        btnReadFile = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Quản lý nhân viên");

        jLabel2.setText("Họ tên");

        jLabel3.setText("Ngày sinh");

        jLabel4.setText("Địa chỉ");

        jLabel5.setText("Hệ số lương");

        txtSalaryRate.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSalaryRateFocusLost(evt);
            }
        });

        jLabel6.setText("Thâm niên");

        txtSeniority.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSeniorityFocusLost(evt);
            }
        });

        jLabel7.setText("Lương cơ bản");

        txtSalaryBase.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSalaryBaseFocusLost(evt);
            }
        });

        jLabel8.setText("Giới tính");

        buttonGroup1.add(radMale);
        radMale.setText("Nam");
        radMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radMaleActionPerformed(evt);
            }
        });

        buttonGroup1.add(radFemale);
        radFemale.setText("Nữ");

        jLabel9.setText("Phòng ban");

        cbDepartment.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ATTT", "CNTT", "DTVT", "NV" }));

        jLabel10.setText("Lương thực lĩnh");

        jScrollPane1.setViewportView(txtpaneSalary);

        jButton1.setText("Thêm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Lưu file");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Reset");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Thoát");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        tblResult.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tblResult);

        btnReadFile.setText("Đọc file");
        btnReadFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReadFileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(50, 50, 50)
                        .addComponent(jButton3)
                        .addGap(46, 46, 46)
                        .addComponent(jButton4))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtSeniority, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtSalaryRate, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel8))
                        .addGap(51, 51, 51)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(radMale)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(radFemale))
                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBirtday, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtSalaryBase, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                            .addComponent(jScrollPane1))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReadFile))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtBirtday, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(radMale)
                            .addComponent(jLabel8)
                            .addComponent(radFemale))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(cbDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtSalaryRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtSeniority, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtSalaryBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(btnReadFile))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(272, 272, 272)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void radMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radMaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radMaleActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        NhanVien t = new NhanVien();
        t.setName(txtName.getText());
        t.setBirthday(txtBirtday.getText());
        t.setAddress(txtAddress.getText());
        if (radFemale.isSelected()){
            t.setSex("Nữ");
        }
        else{
            t.setSex("Nam");
        }
        t.setDepartment(cbDepartment.getSelectedItem()+"");
        t.setSalaryrate(Double.parseDouble(txtSalaryRate.getText()));
        t.setSeniority(Double.parseDouble(txtSeniority.getText()));
        t.setSalarybase(Integer.parseInt(txtSalaryBase.getText()));
        ds.add(t);
        System.out.println(t.toString());
        JOptionPane.showMessageDialog(rootPane, "Thêm thành công 1 nhân viên");
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        txtName.setText("");
        txtBirtday.setText("");
        txtAddress.setText("");
        buttonGroup1.clearSelection();
        cbDepartment.setSelectedIndex(0);
        txtSalaryRate.setText("");
        txtSeniority.setText("");
        txtSalaryBase.setText("");
        txtpaneSalary.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        exit(0);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void txtSalaryRateFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSalaryRateFocusLost
        // TODO add your handling code here:
        String empty = "";
        if (!(txtSeniority.getText().equals(empty)) && !(txtSalaryBase.getText().equals(empty)) && !(txtSalaryRate.getText().equals(empty))) {
            float r = Float.parseFloat(txtSalaryRate.getText());
            float s = Float.parseFloat(txtSeniority.getText());
            int b = Integer.parseInt(txtSalaryBase.getText());
            txtpaneSalary.setText("" + b * r * (1+(s / 100)));

        }
    }//GEN-LAST:event_txtSalaryRateFocusLost

    private void txtSeniorityFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSeniorityFocusLost
        // TODO add your handling code here:
        String empty = "";
        if (!(txtSeniority.getText().equals(empty)) && !(txtSalaryBase.getText().equals(empty)) && !(txtSalaryRate.getText().equals(empty))) {
            float r = Float.parseFloat(txtSalaryRate.getText());
            float s = Float.parseFloat(txtSeniority.getText());
            int b = Integer.parseInt(txtSalaryBase.getText());
            txtpaneSalary.setText("" + b * r * (1 + (s / 100)));

        }
    }//GEN-LAST:event_txtSeniorityFocusLost

    private void txtSalaryBaseFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSalaryBaseFocusLost
        // TODO add your handling code here:
        String empty = "";
        if (!(txtSeniority.getText().equals(empty)) && !(txtSalaryBase.getText().equals(empty)) && !(txtSalaryRate.getText().equals(empty))) {
            float r = Float.parseFloat(txtSalaryRate.getText());
            float s = Float.parseFloat(txtSeniority.getText());
            int b = Integer.parseInt(txtSalaryBase.getText());
            txtpaneSalary.setText("" + b * r * (1 + (s / 100)));

        }
    }//GEN-LAST:event_txtSalaryBaseFocusLost

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try {
            FileWriter fw = new FileWriter("nhanvien.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            
            for(NhanVien t : ds){
                bw.write(t.toString());
                bw.newLine();
            }
            bw.close();
            
            fw.close();
            JOptionPane.showMessageDialog(rootPane, "Lưu thành công danh sách");
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnReadFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReadFileActionPerformed
        // TODO add your handling code here:
        model.setRowCount(0);
        try {
            FileReader fr =new FileReader("nhanvien.txt");
            BufferedReader br = new BufferedReader(fr);
            
            String stringLine;
            
            while ((stringLine = br.readLine()) != null){
                if (stringLine.length()>0){
                    NhanVien t = new NhanVien();
                    String[] result = stringLine.split("\\$");
                    t.setName(result[0]);
                    t.setBirthday(result[1]);
                    t.setAddress(result[2]);
                    t.setSex(result[3]);
                    t.setDepartment(result[4]);
                    t.setSalaryrate(Double.parseDouble(result[5]));
                    t.setSeniority(Double.parseDouble(result[6]));
                    t.setSalarybase(Integer.parseInt(result[7]));
                    
                    //model.addRow(new Object[]{t.getName(), t.getBirthday(), t.getAddress(), t.getSex(), t.getDepartment(), t.getSalaryrate(), t.getSeniority(), t.getSalarybase(), t.calcSalary()});
                    model.addRow(new Object[]{result[0],result[1],result[2],result[3],result[4],result[5],result[6],result[7],result[8]});
                   
                }
            }
            br.close();
            fr.close();
            
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        
       
    }//GEN-LAST:event_btnReadFileActionPerformed

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
            java.util.logging.Logger.getLogger(QLNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QLNV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReadFile;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbDepartment;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JRadioButton radFemale;
    private javax.swing.JRadioButton radMale;
    private javax.swing.JTable tblResult;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtBirtday;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSalaryBase;
    private javax.swing.JTextField txtSalaryRate;
    private javax.swing.JTextField txtSeniority;
    private javax.swing.JTextPane txtpaneSalary;
    // End of variables declaration//GEN-END:variables
}
