/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GolfMerchUI;

import javax.swing.JOptionPane;

/**
 *
 * @author orlandobarreiroiii
 */
public class CustomerInsert extends javax.swing.JFrame {

    private DBManager db;

    public CustomerInsert() {
        db = new DBManager();
        db.connect();        
        initComponents();
        creditLimitLbl.setVisible(false);
        creditLimitTxtFld.setVisible(false);         
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        customerIDtxtFld = new javax.swing.JTextField();
        customerNameTxtFld = new javax.swing.JTextField();
        phoneNumberTxtFld = new javax.swing.JTextField();
        emailAddressTxtFld = new javax.swing.JTextField();
        customerIDlbl = new javax.swing.JLabel();
        nameLbl = new javax.swing.JLabel();
        phoneNumberLbl = new javax.swing.JLabel();
        emailAddressLbl = new javax.swing.JLabel();
        wholesaleAccountLbl = new javax.swing.JLabel();
        insertBtn = new javax.swing.JButton();
        wholesaleAccountCheckBox = new javax.swing.JCheckBox();
        creditLimitLbl = new javax.swing.JLabel();
        creditLimitTxtFld = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        emailAddressTxtFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailAddressTxtFldActionPerformed(evt);
            }
        });

        customerIDlbl.setText("Customer ID");

        nameLbl.setText("Name");

        phoneNumberLbl.setText("Phone Number");

        emailAddressLbl.setText("Email Address");

        wholesaleAccountLbl.setText("Wholesale Account?");

        insertBtn.setText("Insert");
        insertBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertBtnActionPerformed(evt);
            }
        });

        wholesaleAccountCheckBox.setText("Yes");
        wholesaleAccountCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wholesaleAccountCheckBoxActionPerformed(evt);
            }
        });

        creditLimitLbl.setText("Credit Limit");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(customerIDlbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(nameLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(phoneNumberLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(emailAddressLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(wholesaleAccountLbl))
                            .addComponent(creditLimitLbl))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(wholesaleAccountCheckBox)
                            .addComponent(customerIDtxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(customerNameTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(phoneNumberTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailAddressTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(creditLimitTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(insertBtn)))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(customerIDtxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customerIDlbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(customerNameTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneNumberTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneNumberLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailAddressTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailAddressLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(wholesaleAccountLbl)
                    .addComponent(wholesaleAccountCheckBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(creditLimitLbl)
                    .addComponent(creditLimitTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(insertBtn)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void emailAddressTxtFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailAddressTxtFldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailAddressTxtFldActionPerformed

    private void wholesaleAccountCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wholesaleAccountCheckBoxActionPerformed
        if(wholesaleAccountCheckBox.isSelected())
        {
            creditLimitLbl.setVisible(true);
            creditLimitTxtFld.setVisible(true);
        }
        else
        {
            creditLimitLbl.setVisible(false);
            creditLimitTxtFld.setVisible(false);            
        }
    }//GEN-LAST:event_wholesaleAccountCheckBoxActionPerformed

    private void insertBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertBtnActionPerformed
        if(db.insertNewCustomer(customerIDtxtFld.getText(),customerNameTxtFld.getText(),phoneNumberTxtFld.getText(),emailAddressTxtFld.getText(),Double.parseDouble(creditLimitTxtFld.getText())))
        {   // Successful insert
            setVisible(false);
            dispose();
        }
        else
        {   // Unsuccessful insert
            JOptionPane.showMessageDialog(this,"Error inserting values into database");
        }
    }//GEN-LAST:event_insertBtnActionPerformed

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
            java.util.logging.Logger.getLogger(CustomerInsert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerInsert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerInsert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerInsert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerInsert().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel creditLimitLbl;
    private javax.swing.JTextField creditLimitTxtFld;
    private javax.swing.JLabel customerIDlbl;
    private javax.swing.JTextField customerIDtxtFld;
    private javax.swing.JTextField customerNameTxtFld;
    private javax.swing.JLabel emailAddressLbl;
    private javax.swing.JTextField emailAddressTxtFld;
    private javax.swing.JButton insertBtn;
    private javax.swing.JLabel nameLbl;
    private javax.swing.JLabel phoneNumberLbl;
    private javax.swing.JTextField phoneNumberTxtFld;
    private javax.swing.JCheckBox wholesaleAccountCheckBox;
    private javax.swing.JLabel wholesaleAccountLbl;
    // End of variables declaration//GEN-END:variables
}
