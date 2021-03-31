/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dictionary;

import static java.lang.System.exit;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author er1nzz
 */
public class MainInterface extends javax.swing.JFrame {

    /**
     * Creates new form MainInterface
     */
    public MainInterface() {
        initComponents();
        txtInputWord.setEnabled(false);
        pnResult.setEditable(false);
        pnResult.setEnabled(false);
        lbInputWord.setEnabled(false);
        lbResult.setEnabled(false);
        btnSearch.setEnabled(false);
        btnAdd.setEnabled(false);
        
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnReadFile = new javax.swing.JButton();
        btnCreateFile = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        lbInputWord = new javax.swing.JLabel();
        txtInputWord = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        pnResult = new javax.swing.JTextPane();
        lbResult = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnReadFile.setText("Đọc File từ điển ");
        btnReadFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReadFileActionPerformed(evt);
            }
        });

        btnCreateFile.setText("Tạo File từ điển");
        btnCreateFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateFileActionPerformed(evt);
            }
        });

        btnExit.setText("Thoát");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        lbInputWord.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbInputWord.setText("Nhập từ cần tìm: ");

        txtInputWord.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtInputWord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInputWordActionPerformed(evt);
            }
        });

        pnResult.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jScrollPane1.setViewportView(pnResult);

        lbResult.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbResult.setText("Kết quả:");

        btnSearch.setText("Tìm");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnAdd.setText("Thêm vào từ điển");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnExit)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnReadFile)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCreateFile))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbInputWord)
                                .addComponent(lbResult))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnSearch)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 185, Short.MAX_VALUE)
                                    .addComponent(btnAdd))
                                .addComponent(jScrollPane1)
                                .addComponent(txtInputWord)))))
                .addContainerGap(199, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreateFile)
                    .addComponent(btnReadFile))
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbInputWord)
                    .addComponent(txtInputWord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbResult))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearch)
                    .addComponent(btnAdd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addComponent(btnExit)
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnReadFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReadFileActionPerformed
        // TODO add your handling code here:
        Dictionary.readWordList();
        if (Dictionary.list.isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Từ điển rỗng, hãy tạo từ điển");
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "Đọc từ điển thành công!");
            txtInputWord.setEnabled(true);
            pnResult.setEnabled(true);
            lbInputWord.setEnabled(true);
            lbResult.setEnabled(true);
            btnSearch.setEnabled(true);
            btnAdd.setEnabled(true);
        }
        
    }//GEN-LAST:event_btnReadFileActionPerformed

    private void btnCreateFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateFileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCreateFileActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void txtInputWordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInputWordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInputWordActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        if (txtInputWord.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Nhập từ cần tìm!");
        }
        else{
            
            int result = Dictionary.searchWord(txtInputWord.getText(), 0, Dictionary.list.size() - 1);
            if (result == -1){
                JOptionPane.showMessageDialog(rootPane, "Không tìm thấy, ấn bổ sung vào từ điển!"); 
                pnResult.setEnabled(false);
            }
            else{
                pnResult.setText(Dictionary.list.get(result).getMeaning());
            }
        }
        
        
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        AddWord aw = new AddWord();
        AddWord.word = txtInputWord.getText();
        aw.setVisible(true);
        
    }//GEN-LAST:event_btnAddActionPerformed

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
            java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCreateFile;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnReadFile;
    private javax.swing.JButton btnSearch;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbInputWord;
    private javax.swing.JLabel lbResult;
    private javax.swing.JTextPane pnResult;
    public static javax.swing.JTextField txtInputWord;
    // End of variables declaration//GEN-END:variables
}
