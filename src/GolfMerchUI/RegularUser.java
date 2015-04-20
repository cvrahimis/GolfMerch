/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GolfMerchUI;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Costasv
 */
public class RegularUser extends javax.swing.JFrame {
    private DBManager db;
    private DefaultTableModel model;
    private ArrayList<Object[]> results;
    
    public RegularUser() {
        initComponents();
        db = new DBManager();
        db.connect();
        model = (DefaultTableModel)jTable1.getModel();
    }
    
    public RegularUser(String name) {
        initComponents();
        db = new DBManager();
        db.connect();
        model = (DefaultTableModel)jTable1.getModel();
        greetingLbl.setText("Hello " + name);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        shwBakOrdBtn = new javax.swing.JButton();
        wholeSaleCustItmBtn = new javax.swing.JButton();
        getInvByCustIdBtn = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        bakOrdItemIdTxtFld = new javax.swing.JTextField();
        greetingLbl = new javax.swing.JLabel();
        wholeSaleCustItmTxtFld = new javax.swing.JTextField();
        getInvByCustIDTxtFld = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        shwBakOrdBtn.setText("Show Back Orders");
        shwBakOrdBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shwBakOrdBtnActionPerformed(evt);
            }
        });

        wholeSaleCustItmBtn.setText("Show Wholesale Customer Items");
        wholeSaleCustItmBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wholeSaleCustItmBtnActionPerformed(evt);
            }
        });

        getInvByCustIdBtn.setText("Get Invoices By Customer ID");
        getInvByCustIdBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getInvByCustIdBtnActionPerformed(evt);
            }
        });

        jButton4.setText("jButton4");

        jButton5.setText("jButton5");

        jButton6.setText("jButton6");

        greetingLbl.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        greetingLbl.setForeground(new java.awt.Color(51, 51, 255));
        greetingLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        greetingLbl.setText("Hello");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4)
                            .addComponent(jButton5)
                            .addComponent(jButton6)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(getInvByCustIdBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(wholeSaleCustItmBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(shwBakOrdBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bakOrdItemIdTxtFld)
                            .addComponent(wholeSaleCustItmTxtFld)
                            .addComponent(getInvByCustIDTxtFld, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 676, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
            .addGroup(layout.createSequentialGroup()
                .addGap(366, 366, 366)
                .addComponent(greetingLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(greetingLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(shwBakOrdBtn)
                            .addComponent(bakOrdItemIdTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(wholeSaleCustItmBtn)
                            .addComponent(wholeSaleCustItmTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(getInvByCustIdBtn)
                            .addComponent(getInvByCustIDTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5)
                        .addGap(18, 18, 18)
                        .addComponent(jButton6))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void shwBakOrdBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shwBakOrdBtnActionPerformed
        String[] columns = new String[]{"Order ID", "Customer ID", "Created Date", "Item ID", "Quantity"};
        
        int tableSize = model.getRowCount(); 
        for(int i = 0; i < tableSize; i++)
        {
            model.removeRow(0);
        }
        
        try{
            results = db.getAllBackOrders(bakOrdItemIdTxtFld.getText());
            model = (DefaultTableModel)jTable1.getModel();
            model.setColumnCount(columns.length);
            model.setColumnIdentifiers(columns);
            for(int i = 0; i < results.size(); i++)
            {
                model.insertRow(model.getRowCount(), results.get(i));
            }
        }
        catch(SQLException e ){
        }
    }//GEN-LAST:event_shwBakOrdBtnActionPerformed

    private void wholeSaleCustItmBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wholeSaleCustItmBtnActionPerformed
        String[] columns = new String[]{"Customer ID", "Customer Name", "Item Id", "Item Name", "Quantity", "Category", "Retail Price", "Wholesale Price"};
        
        int tableSize = model.getRowCount(); 
        for(int i = 0; i < tableSize; i++)
        {
            model.removeRow(0);
        }
        
        try{
            results = db.getWholeSaleItemsByCustomerID(wholeSaleCustItmTxtFld.getText());
            model = (DefaultTableModel)jTable1.getModel();
            model.setColumnCount(columns.length);
            model.setColumnIdentifiers(columns);
            for(int i = 0; i < results.size(); i++)
            {
                model.insertRow(model.getRowCount(), results.get(i));
            }
        }
        catch(SQLException e ){
        }
    }//GEN-LAST:event_wholeSaleCustItmBtnActionPerformed

    private void getInvByCustIdBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getInvByCustIdBtnActionPerformed
        String[] columns = new String[]{"Customer Name", "Order ID", "Amount Paid", "Invoiced Date", "Shipping Address", "Tracking Number", "Total Price", "Order Balance"};
        
        int tableSize = model.getRowCount(); 
        for(int i = 0; i < tableSize; i++)
        {
            model.removeRow(0);
        }
        
        try{
            results = db.getInvoicesByCustID(getInvByCustIDTxtFld.getText());
            model = (DefaultTableModel)jTable1.getModel();
            model.setColumnCount(columns.length);
            model.setColumnIdentifiers(columns);
            for(int i = 0; i < results.size(); i++)
            {
                model.insertRow(model.getRowCount(), results.get(i));
            }
        }
        catch(SQLException e ){
        }
    }//GEN-LAST:event_getInvByCustIdBtnActionPerformed

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
            java.util.logging.Logger.getLogger(RegularUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegularUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegularUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegularUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegularUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bakOrdItemIdTxtFld;
    private javax.swing.JTextField getInvByCustIDTxtFld;
    private javax.swing.JButton getInvByCustIdBtn;
    private javax.swing.JLabel greetingLbl;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton shwBakOrdBtn;
    private javax.swing.JButton wholeSaleCustItmBtn;
    private javax.swing.JTextField wholeSaleCustItmTxtFld;
    // End of variables declaration//GEN-END:variables
}
