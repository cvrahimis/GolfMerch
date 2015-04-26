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
import javax.swing.DefaultComboBoxModel;

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
        try{
            categoryComBox.setModel(new DefaultComboBoxModel(db.getDistCategories()));
        }
        catch(SQLException e ){
        }
    }
    
    public RegularUser(String name) {
        initComponents();
        db = new DBManager();
        db.connect();
        model = (DefaultTableModel)jTable1.getModel();
        greetingLbl.setText("Hello " + name);
        try{
            categoryComBox.setModel(new DefaultComboBoxModel(db.getDistCategories()));
            categoryComBox.setSelectedIndex(0);
        }
        catch(SQLException e ){
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jSeparator1 = new javax.swing.JSeparator();
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
        itemReportBtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        itemReportTxtFld = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        slowMovInventBtn = new javax.swing.JButton();
        slowMovStartDtPik = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        slowMovEndDtPik = new com.toedter.calendar.JDateChooser();
        jSeparator7 = new javax.swing.JSeparator();
        categoryComBox = new javax.swing.JComboBox();
        inventoryByCatBtn = new javax.swing.JButton();
        jSeparator8 = new javax.swing.JSeparator();
        custNtPaidStartDtPik = new com.toedter.calendar.JDateChooser();
        custNtPaidEndDtPik = new com.toedter.calendar.JDateChooser();
        custNtPaidBtn = new javax.swing.JButton();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        zeroQtyPOsBtn = new javax.swing.JButton();
        custNotBuyStartDtPik = new com.toedter.calendar.JDateChooser();
        custNotBuyEndDtPik = new com.toedter.calendar.JDateChooser();
        custNotBuyBtn = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        PurchOrdMenItm = new javax.swing.JMenuItem();
        customeMenItm = new javax.swing.JMenuItem();
        orderMenItm = new javax.swing.JMenuItem();
        itemMenItm = new javax.swing.JMenuItem();
        invoiceMenItm = new javax.swing.JMenuItem();

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

        itemReportBtn.setText("Item Report");
        itemReportBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemReportBtnActionPerformed(evt);
            }
        });

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Item ID");

        jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);

        slowMovInventBtn.setText("Slow Moving Inventory");
        slowMovInventBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                slowMovInventBtnActionPerformed(evt);
            }
        });

        slowMovStartDtPik.setDateFormatString("MM/dd/yyyy");

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Start Date");

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("End Date");

        slowMovEndDtPik.setDateFormatString("MM/dd/yyyy");

        jSeparator7.setOrientation(javax.swing.SwingConstants.VERTICAL);

        inventoryByCatBtn.setText("Inventory By Category");
        inventoryByCatBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inventoryByCatBtnActionPerformed(evt);
            }
        });

        jSeparator8.setOrientation(javax.swing.SwingConstants.VERTICAL);

        custNtPaidStartDtPik.setDateFormatString("MM/dd/yyyy");

        custNtPaidEndDtPik.setDateFormatString("MM/dd/yyyy");

        custNtPaidBtn.setText("Customers Not Paid");
        custNtPaidBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custNtPaidBtnActionPerformed(evt);
            }
        });

        jSeparator9.setOrientation(javax.swing.SwingConstants.VERTICAL);

        zeroQtyPOsBtn.setText("POs With Items 0 Qty");
        zeroQtyPOsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroQtyPOsBtnActionPerformed(evt);
            }
        });

        custNotBuyStartDtPik.setDateFormatString("MM/dd/yyyy");

        custNotBuyEndDtPik.setDateFormatString("MM/dd/yyyy");

        custNotBuyBtn.setText("<html>Customers Not Purchasing<br><center>In Time Frame</center></html>");
        custNotBuyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custNotBuyBtnActionPerformed(evt);
            }
        });

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Insert");

        PurchOrdMenItm.setText("Item");
        PurchOrdMenItm.setToolTipText("");
        jMenu3.add(PurchOrdMenItm);

        customeMenItm.setText("Customer");
        customeMenItm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customeMenItmActionPerformed(evt);
            }
        });
        jMenu3.add(customeMenItm);

        orderMenItm.setText("Order");
        jMenu3.add(orderMenItm);

        itemMenItm.setText("Purchase Order");
        jMenu3.add(itemMenItm);

        invoiceMenItm.setText("Invoice");
        jMenu3.add(invoiceMenItm);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

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
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(itemReportTxtFld)
                            .addComponent(itemReportBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(slowMovInventBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(slowMovStartDtPik, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(slowMovEndDtPik, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(categoryComBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(inventoryByCatBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator10, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(zeroQtyPOsBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(custNtPaidEndDtPik, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(custNtPaidStartDtPik, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(custNtPaidBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(custNotBuyBtn)
                            .addComponent(custNotBuyStartDtPik, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(custNotBuyEndDtPik, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 12, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(greetingLbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(greetingLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
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
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                                    .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(slowMovInventBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(slowMovStartDtPik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(slowMovEndDtPik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(itemReportBtn)
                                    .addGap(20, 20, 20)
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(itemReportTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(custNotBuyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(custNotBuyStartDtPik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(custNotBuyEndDtPik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(custNtPaidBtn)
                                .addGap(25, 25, 25)
                                .addComponent(custNtPaidStartDtPik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(custNtPaidEndDtPik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(inventoryByCatBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(categoryComBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(zeroQtyPOsBtn))
                            .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void clarTable(){
        int tableSize = model.getRowCount(); 
        for(int i = 0; i < tableSize; i++)
        {
            model.removeRow(0);
        }
    }    
    
    private void shwBakOrdBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shwBakOrdBtnActionPerformed
        String[] columns = new String[]{"Order ID", "Customer ID", "Created Date", "Item ID", "Quantity"};
        clarTable();        
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
        clarTable();
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
        clarTable();
        
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
        clarTable();
        
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

    private void itemReportBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemReportBtnActionPerformed
        if(!itemReportTxtFld.getText().equals(""))
        {
            String[] columns = new String[]{"Customer ID", "Customer Name", "Item ID", "Total Purchased"};
            clarTable();

            try{
                results = db.getItemReport(itemReportTxtFld.getText());
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
        }
    }//GEN-LAST:event_itemReportBtnActionPerformed

    private void slowMovInventBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_slowMovInventBtnActionPerformed
        
        String[] columns = new String[]{"Item ID", "Item Name", "Description", "Quantity", "Category", "Retail Price", "Wholesale Price"}; 
        String startDate = ((JTextField)slowMovStartDtPik.getDateEditor().getUiComponent()).getText();
        String endDate = ((JTextField)slowMovEndDtPik.getDateEditor().getUiComponent()).getText();
        clarTable();
        
        try{
            results = db.getSlowMovInv(startDate, endDate);
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
    }//GEN-LAST:event_slowMovInventBtnActionPerformed

    private void inventoryByCatBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inventoryByCatBtnActionPerformed
        String[] columns = new String[]{"Category", "Inventory Count"};
                
        String selectItm = (String)categoryComBox.getSelectedItem();
        clarTable();
        
        try{
            results = db.getInventoryByCategory(selectItm);
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
    }//GEN-LAST:event_inventoryByCatBtnActionPerformed

    private void custNtPaidBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custNtPaidBtnActionPerformed
        String[] columns = new String[]{"Customer ID", "Customer Name", "Order ID", "Total Price", "Order Balance", "Order Date"};
                
        String startDate = ((JTextField)custNtPaidStartDtPik.getDateEditor().getUiComponent()).getText();
        String endDate = ((JTextField)custNtPaidEndDtPik.getDateEditor().getUiComponent()).getText();
        clarTable();
        
        try{
            results = db.getCustNtPaid(startDate, endDate);
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
    }//GEN-LAST:event_custNtPaidBtnActionPerformed

    private void zeroQtyPOsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zeroQtyPOsBtnActionPerformed
        String[] columns = new String[]{"Item ID", "Itemname", "Quantity", "Purchase Order Date"};
        clarTable();
        
        try{
            results = db.getZeroQtyPOs();
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
    }//GEN-LAST:event_zeroQtyPOsBtnActionPerformed

    private void custNotBuyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custNotBuyBtnActionPerformed
        String[] columns = new String[]{"Customer ID", "Customer Name", "Created Date", "Phone", "Email"};
                
        String startDate = ((JTextField)custNotBuyStartDtPik.getDateEditor().getUiComponent()).getText();
        String endDate = ((JTextField)custNotBuyEndDtPik.getDateEditor().getUiComponent()).getText();
        clarTable();
        
        try{
            results = db.getCustNtBuy(startDate, endDate);
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
    }//GEN-LAST:event_custNotBuyBtnActionPerformed

    private void customeMenItmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customeMenItmActionPerformed
        // TODO add your handling code here:
        CustomerInsert cusInsGUI = new CustomerInsert();
        cusInsGUI.setVisible(true);
    }//GEN-LAST:event_customeMenItmActionPerformed

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
    private javax.swing.JMenuItem PurchOrdMenItm;
    private javax.swing.JTextField bakOrdItemIdTxtFld;
    private javax.swing.JComboBox categoryComBox;
    private javax.swing.JButton custNotBuyBtn;
    private com.toedter.calendar.JDateChooser custNotBuyEndDtPik;
    private com.toedter.calendar.JDateChooser custNotBuyStartDtPik;
    private javax.swing.JButton custNtPaidBtn;
    private com.toedter.calendar.JDateChooser custNtPaidEndDtPik;
    private com.toedter.calendar.JDateChooser custNtPaidStartDtPik;
    private javax.swing.JButton custReportBtn;
    private javax.swing.JMenuItem customeMenItm;
    private com.toedter.calendar.JDateChooser endDtPik;
    private javax.swing.JTextField getInvByCustIDTxtFld;
    private javax.swing.JButton getInvByCustIdBtn;
    private javax.swing.JLabel greetingLbl;
    private javax.swing.JButton inventoryByCatBtn;
    private javax.swing.JMenuItem invoiceMenItm;
    private javax.swing.JMenuItem itemMenItm;
    private javax.swing.JButton itemReportBtn;
    private javax.swing.JTextField itemReportTxtFld;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTable jTable1;
    private javax.swing.JMenuItem orderMenItm;
    private javax.swing.JButton shwBakOrdBtn;
    private com.toedter.calendar.JDateChooser slowMovEndDtPik;
    private javax.swing.JButton slowMovInventBtn;
    private com.toedter.calendar.JDateChooser slowMovStartDtPik;
    private com.toedter.calendar.JDateChooser startDtPik;
    private javax.swing.JButton wholeSaleCustItmBtn;
    private javax.swing.JTextField wholeSaleCustItmTxtFld;
    private javax.swing.JButton zeroQtyPOsBtn;
    // End of variables declaration//GEN-END:variables
}
