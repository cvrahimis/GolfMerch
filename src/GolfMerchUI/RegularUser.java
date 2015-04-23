/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GolfMerchUI;

import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;

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
        bakOrdItemIdTxtFld = new javax.swing.JTextField();
        greetingLbl = new javax.swing.JLabel();
        wholeSaleCustItmTxtFld = new javax.swing.JTextField();
        getInvByCustIDTxtFld = new javax.swing.JTextField();
        custReportBtn = new javax.swing.JButton();
        startDtPik = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        endDtPik = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();

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

        wholeSaleCustItmBtn.setText("Wholesale Items");
        wholeSaleCustItmBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wholeSaleCustItmBtnActionPerformed(evt);
            }
        });

        getInvByCustIdBtn.setText("Get Invoices");
        getInvByCustIdBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getInvByCustIdBtnActionPerformed(evt);
            }
        });

        greetingLbl.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        greetingLbl.setForeground(new java.awt.Color(51, 51, 255));
        greetingLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        greetingLbl.setText("Hello");

        custReportBtn.setText("Customer Report");
        custReportBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custReportBtnActionPerformed(evt);
            }
        });

        startDtPik.setDateFormatString("MM/dd/yyyy");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Customer ID");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Customer ID");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Start Date");

        endDtPik.setDateFormatString("MM/dd/yyyy");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("End Date");

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Item ID");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(shwBakOrdBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bakOrdItemIdTxtFld, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(getInvByCustIdBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(getInvByCustIDTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(wholeSaleCustItmBtn)
                            .addComponent(wholeSaleCustItmTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(custReportBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(startDtPik, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(endDtPik, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 741, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(greetingLbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(greetingLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(wholeSaleCustItmTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(getInvByCustIDTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(74, 74, 74))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(custReportBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(startDtPik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addGap(62, 62, 62))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(endDtPik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(shwBakOrdBtn)
                                        .addGap(19, 19, 19)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bakOrdItemIdTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(wholeSaleCustItmBtn)
                                    .addComponent(getInvByCustIdBtn))
                                .addGap(45, 45, 45)))
                        .addGap(30, 30, 30))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

    private void custReportBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custReportBtnActionPerformed
        String[] columns = new String[]{"Customer ID", "Customer Name", "Life Time Spent"};
                
        String startDate = ((JTextField)startDtPik.getDateEditor().getUiComponent()).getText();
        String endDate = ((JTextField)endDtPik.getDateEditor().getUiComponent()).getText();
                
        int tableSize = model.getRowCount(); 
        for(int i = 0; i < tableSize; i++)
        {
            model.removeRow(0);
        }
        
        try{
            results = db.getCustomerInfo(startDate, endDate);
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
    }//GEN-LAST:event_custReportBtnActionPerformed

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
    private javax.swing.JButton custReportBtn;
    private com.toedter.calendar.JDateChooser endDtPik;
    private javax.swing.JTextField getInvByCustIDTxtFld;
    private javax.swing.JButton getInvByCustIdBtn;
    private javax.swing.JLabel greetingLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton shwBakOrdBtn;
    private com.toedter.calendar.JDateChooser startDtPik;
    private javax.swing.JButton wholeSaleCustItmBtn;
    private javax.swing.JTextField wholeSaleCustItmTxtFld;
    // End of variables declaration//GEN-END:variables
}
