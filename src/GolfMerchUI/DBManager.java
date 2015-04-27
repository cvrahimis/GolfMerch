package GolfMerchUI;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

//@author Costasv
public class DBManager {
    private Connection conn;
    public DBManager(){
        conn = null;
    }
    
    public Connection connect(){
        conn = connectToDatabaseOrDie();
        return conn;
    }
    
    private static Connection connectToDatabaseOrDie() {
	    Connection con = null;
	 
		//load Driver
		try {
			Class.forName("org.postgresql.Driver");
			
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		
	    String url = "jdbc:postgresql://localhost/GolfMerch";
	    String user = "postgres";
	    String password = "finny";

	    try {
	        con = DriverManager.getConnection(url, user, password);
	    }

	    catch (SQLException e) {
	      e.printStackTrace();
	 //     System.exit(2);
	    }
	    return con;
    }
    
    public String[] getDistCategories() throws SQLException{
        ArrayList<String> results = new ArrayList<>();
        String[] categories;
        Statement stmt = null;
	String query = "select distinct category from products";	    
	ResultSet rs = null;
        
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(query);
           
            while (rs.next()) {
                results.add(rs.getString("category"));
            }
        } 
        catch (SQLException e ) {
            e.printStackTrace();
        } finally {
            if (stmt != null) { stmt.close(); }
        }
        
        categories = new String[results.size()];
            for(int i = 0; i < results.size(); i++)
                categories[i] = results.get(i);
        
        return categories;
    }
    
    public String[] getAllProducts() throws SQLException{
        ArrayList<String> results = new ArrayList<>();
        String[] products;
        Statement stmt = null;
	String query = "select itemid from products";	    
	ResultSet rs = null;
        
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(query);
           
            while (rs.next()) {
                results.add(rs.getString("itemid"));
            }
        } 
        catch (SQLException e ) {
            e.printStackTrace();
        } finally {
            if (stmt != null) { stmt.close(); }
        }
        
        products = new String[results.size()];
            for(int i = 0; i < results.size(); i++)
                products[i] = results.get(i);
        
        return products;
    }
    
    public String[] getAllOrders() throws SQLException{
        ArrayList<String> results = new ArrayList<>();
        String[] orders;
        Statement stmt = null;
	String query = "select orderID from CustOrderInfo";	    
	ResultSet rs = null;
        
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(query);
           
            while (rs.next()) {
                results.add(rs.getString("orderID"));
            }
        } 
        catch (SQLException e ) {
            e.printStackTrace();
        } finally {
            if (stmt != null) { stmt.close(); }
        }
        
        orders = new String[results.size()];
            for(int i = 0; i < results.size(); i++)
                orders[i] = results.get(i);
        
        return orders;
    }   
        
    public ArrayList<Object[]> getDistCustomers() throws SQLException{
        ArrayList<Object[]> results = new ArrayList<>();
        String[] categories;
        Statement stmt = null;
	String query = "select distinct customerid, customerName from customer";	    
	ResultSet rs = null;
        
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(query);
           
            while (rs.next()) {
                results.add(new Object[]{rs.getString("customerid"), rs.getString("customerName")});
            }
        } 
        catch (SQLException e ) {
            e.printStackTrace();
        } finally {
            if (stmt != null) { stmt.close(); }
        }        
        return results;
    }
    
    public void InsertNewUser(String fname, String lname, String uname, String pass, boolean admin) throws SQLException {	
        String SQL = "INSERT INTO Users (firstname, lastname, username, passwd, isAdmin) VALUES(?, ?, ?, ?, ?)";

        // Create PrepareStatement object
        PreparedStatement pstmt = conn.prepareStatement(SQL);

        //Set auto-commit to false
        conn.setAutoCommit(false);

        // Set the variables	
        pstmt.setString( 1, fname);
        pstmt.setString(2, lname);
        pstmt.setString(3, uname);
        pstmt.setString(4, pass);
        pstmt.setBoolean(5, admin);
        // Add it to the batch
        pstmt.addBatch();
        //Execute
        pstmt.executeBatch();
        
        //Explicitly commit statements to apply changes
        conn.commit();
    }
    
    public boolean InsertNewItem(String itmeId, String itemName, String description, int quantity, String category, double retailPrice, double wholesalePrice) {
        boolean success = true;
        try{
            String SQL = "INSERT INTO products (itemid, itemname, description, quantity, category, retailprice, wholesaleprice) VALUES(?, ?, ?, ?, ?, ?, ?)";

            // Create PrepareStatement object
            PreparedStatement pstmt = conn.prepareStatement(SQL);

            //Set auto-commit to false
            conn.setAutoCommit(false);

            // Set the variables	
            pstmt.setString(1, itmeId);
            pstmt.setString(2, itemName);
            pstmt.setString(3, description);
            pstmt.setInt(4, quantity);
            pstmt.setString(5, category);
            pstmt.setDouble(6, retailPrice);
            pstmt.setDouble(7, wholesalePrice);
            // Add it to the batch
            pstmt.addBatch();
            //Execute
            pstmt.executeBatch();

            //Explicitly commit statements to apply changes
            conn.commit();
        }
        catch(SQLException ex){
            success = false;
        }
        return success;
    }
    
    public boolean isUsernameTaken(String uname) throws SQLException{
        PreparedStatement pstmt = null;
	ResultSet rs = null;
        String query = "select count(*) as count from users where username = ? limit 1;";
        try {            
            pstmt = conn.prepareStatement(query);
	    pstmt.setString(1, uname);
	    rs = pstmt.executeQuery();
            if (rs.next() & rs.getInt("count") > 0) 
                return true;
            else 
                return false;
        } 
        catch (SQLException e ) {
            //System.out.println(e.getMessage());
            e.printStackTrace();
        } finally {
            if (pstmt != null) { pstmt.close(); }
        }
        return true;
    }
    
    public ArrayList<Object[]> getAllUsers() throws SQLException{
        ArrayList<Object[]> results = new ArrayList<>();
        Statement stmt = null;
	String query = "select * from users;";	    
	ResultSet rs = null;
        
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(query);
           
            while (rs.next()) {
                results.add(new Object[]{rs.getString("userID"), rs.getString("firstname"), rs.getString("lastname"), rs.getString("passwd"), rs.getBoolean("isAdmin"), rs.getString("username")});
            }
        } 
        catch (SQLException e ) {
            e.printStackTrace();
        } finally {
            if (stmt != null) { stmt.close(); }
        }
        return results;
    }
    
    public ArrayList<Object[]> getAllBackOrders(String itemID) throws SQLException{
        ArrayList<Object[]> results = new ArrayList<>();
        PreparedStatement pstmt = null;
        String query = "";
        ResultSet rs = null;
        
        try {
            if(itemID.equals(""))
            {
                query = "select * from custorderinfo coi inner join orderitemsinfo oii on coi.orderid = oii.orderid inner join products p on p.itemid = oii.itemid where coi.status = 4 and p.quantity = 0;";
                pstmt = conn.prepareStatement(query);
            }	    
            else
            {
                query = "select * from custorderinfo coi inner join orderitemsinfo oii on coi.orderid = oii.orderid inner join products p on p.itemid = oii.itemid where coi.status = 4 and p.quantity = 0 and oii.itemid like ?;";
                pstmt = conn.prepareStatement(query);
                pstmt.setString(1, itemID);
            }
            
	    rs = pstmt.executeQuery();
            while (rs.next()) {
                results.add(new Object[]{rs.getString("orderID"), rs.getString("CustomerID"), rs.getString("createdDate"), rs.getString("itemID"), rs.getInt("Quantity")});
            }
        } 
        catch (SQLException e ) {
            e.printStackTrace();
        } finally {
            if (pstmt != null) { pstmt.close(); }
        }
        return results;
    }
    
    public ArrayList<Object[]> getWholeSaleItemsByCustomerID(String customerID) throws SQLException{
        ArrayList<Object[]> results = new ArrayList<>();
        PreparedStatement pstmt = null;
        String query = "";
        ResultSet rs = null;
        
        try {
            if(customerID.equals(""))
            {
                query = "select wsi.customerid, c.customername, p.itemid, p.itemname, p.quantity, p.category, p.retailprice, p.wholesaleprice from WholeSaleItems wsi inner join products p on p.itemID = wsi.itemID inner join customer c on wsi.customerID = c.customerID";
                pstmt = conn.prepareStatement(query);
            }	    
            else
            {
                query = "select wsi.customerid, c.customername, p.itemid, p.itemname, p.quantity, p.category, p.retailprice, p.wholesaleprice from WholeSaleItems wsi inner join products p on p.itemID = wsi.itemID inner join customer c on wsi.customerID = c.customerID where c.customerID like ?;";
                pstmt = conn.prepareStatement(query);
                pstmt.setString(1, customerID);
            }
            
	    rs = pstmt.executeQuery();
            while (rs.next()) {
                results.add(new Object[]{rs.getString("customerid"), rs.getString("customername"), rs.getString("itemid"), rs.getString("itemname"), rs.getInt("quantity"), rs.getString("category"), rs.getDouble("retailprice"), rs.getDouble("wholesaleprice")});
            }
        } 
        catch (SQLException e ) {
            e.printStackTrace();
        } finally {
            if (pstmt != null) { pstmt.close(); }
        }
        return results;
    }
    
    public ArrayList<Object[]> getInvoicesByCustID(String customerID) throws SQLException{
        ArrayList<Object[]> results = new ArrayList<>();
        PreparedStatement pstmt = null;
        String query = "";
        ResultSet rs = null;
        
        try {
            if(customerID.equals(""))
            {
                query = "select coi.orderid, i.amountpaid, i.createdDate, c.customerName, coi.shippingaddress, coi.trackingnumber, coi.totalprice, coi.orderbalance from Invoices i inner join CustOrderInfo coi on i.orderid = coi.orderid inner join customer c on c.customerID = coi.customerID;";
                pstmt = conn.prepareStatement(query);
            }	    
            else
            {
                query = "select coi.orderid, i.amountpaid, i.createdDate, c.customerName, coi.shippingaddress, coi.trackingnumber, coi.totalprice, coi.orderbalance from Invoices i inner join CustOrderInfo coi on i.orderid = coi.orderid inner join customer c on c.customerID = coi.customerID where coi.customerID like ?;";
                pstmt = conn.prepareStatement(query);
                pstmt.setString(1, customerID);
            }
            
	    rs = pstmt.executeQuery();
            while (rs.next()) {
                results.add(new Object[]{rs.getString("customerName"), rs.getString("orderid"), rs.getString("amountpaid"), rs.getString("shippingaddress"), rs.getString("trackingnumber"), rs.getDouble("totalprice"), rs.getDouble("orderbalance")});
            }
        } 
        catch (SQLException e ) {
            e.printStackTrace();
        } finally {
            if (pstmt != null) { pstmt.close(); }
        }
        return results;
    } 
    
    public ArrayList<Object[]> getCustomerInfo(String startDate, String endDate) throws SQLException{
        ArrayList<Object[]> results = new ArrayList<>();
        Statement stmt = null;
        String query = "";
        ResultSet rs = null;
        
        try {
            if(startDate.equals("") && endDate.equals(""))
            {
                DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
                Date todayDate = new Date();
                endDate = dateFormat.format(todayDate);
                
                Calendar cal = Calendar.getInstance();
                cal.add(Calendar.DATE, -1);        
                startDate = dateFormat.format(cal.getTime()); 
            }
            query = "select c.customerid, c.customername, sum(coi.totalPrice) as \"Total Spent\" from customer c inner join custorderinfo coi on c.customerid = coi.customerid where coi.createddate between '"+ startDate +"' and '"+ endDate +"' group by c.customerID;";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(query);       
	    
            while (rs.next()) {
                results.add(new Object[]{rs.getString("customerid"), rs.getString("customername"), rs.getString("Total Spent")});
            }
        } 
        catch (SQLException e ) {
            e.printStackTrace();
        } 
        finally {
            if (stmt != null) { stmt.close(); }
        }
        return results;
    }
    
    public ArrayList<Object[]> getInventoryByCategory(String category) throws SQLException{
        ArrayList<Object[]> results = new ArrayList<>();
        PreparedStatement pstmt = null;
        String query = "";
        ResultSet rs = null;
        
        try {
            query = "SELECT category, COUNT(itemID) Item_Count\n" +
                    "FROM Products\n" +
                    "WHERE category = ?\n" +
                    "GROUP BY category;";
            pstmt = conn.prepareStatement(query);
            pstmt.setString(1, category);
            rs = pstmt.executeQuery();       
	    
            while (rs.next()) {
                results.add(new Object[]{rs.getString("category"), rs.getString("item_count")});
            }
        } 
        catch (SQLException e ) {
            e.printStackTrace();
        } 
        finally {
            if (pstmt != null) { pstmt.close(); }
        }
        return results;
    }
    
    public ArrayList<Object[]> getItemReport(String itemID) throws SQLException{
        ArrayList<Object[]> results = new ArrayList<>();
        PreparedStatement pstmt = null;
        String query = "";
        ResultSet rs = null;
        
        try {
            query = "select c.customerid, c.customername, oii.itemID, sum(oii.quantity) as totalPurchased \n" +
                    "from custorderinfo coi\n" +
                    "	inner join orderitemsinfo oii on\n" +
                    "		coi.orderid = oii.orderid\n" +
                    "	inner join customer c on\n" +
                    "		coi.customerid = c.customerid\n" +
                    "where oii.itemID = ? \n" +
                    "group by c.customerid, oii.itemid;";
            pstmt = conn.prepareStatement(query);
            pstmt.setString(1, itemID);
            
	    rs = pstmt.executeQuery();
            while (rs.next()) {
                results.add(new Object[]{rs.getString("customerid"), rs.getString("customername"), rs.getString("itemID"), rs.getInt("totalPurchased")});
            }
        } 
        catch (SQLException e ) {
            e.printStackTrace();
        } finally {
            if (pstmt != null) { pstmt.close(); }
        }
        return results;
    }
    
    public ArrayList<Object[]> getSlowMovInv(String startDate, String endDate) throws SQLException{
        ArrayList<Object[]> results = new ArrayList<>();
        Statement stmt = null;
        String query = "";
        ResultSet rs = null;
        
        try {
            if(startDate.equals("") && endDate.equals(""))
            {
                DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
                Date todayDate = new Date();
                endDate = dateFormat.format(todayDate);
                
                Calendar cal = Calendar.getInstance();
                cal.add(Calendar.DATE, -1);        
                startDate = dateFormat.format(cal.getTime()); 
            }
            query = "SELECT *\n" +
                    "FROM Products\n" +
                    "WHERE itemID NOT IN (\n" +
                    "	SELECT itemID \n" +
                    "	FROM OrderItemsInfo ii, CustOrderInfo oi\n" +
                    "	WHERE oi.orderID = ii.orderID AND oi.createdDate between '" + startDate + "' AND '"+ endDate +"');";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(query);       
	    
            while (rs.next()) {
                results.add(new Object[]{rs.getString("itemid"), rs.getString("itemname"), rs.getString("description"), rs.getString("quantity"), rs.getString("category"), rs.getString("retailprice"), rs.getString("wholesaleprice")});
            }
        } 
        catch (SQLException e ) {
            e.printStackTrace();
        } 
        finally {
            if (stmt != null) { stmt.close(); }
        }
        return results;
    }
    
    public ArrayList<Object[]> getCustNtPaid(String startDate, String endDate) throws SQLException{
        ArrayList<Object[]> results = new ArrayList<>();
        Statement stmt = null;
        String query = "";
        ResultSet rs = null;
        
        try {
            if(startDate.equals("") && endDate.equals(""))
            {
                DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
                Date todayDate = new Date();
                endDate = dateFormat.format(todayDate);
                
                Calendar cal = Calendar.getInstance();
                cal.add(Calendar.DATE, -1);        
                startDate = dateFormat.format(cal.getTime()); 
            }
            query = "SELECT c.customerID, customerName, orderID, totalPrice, orderBalance, oi.createdDate Order_Date\n" +
                    "FROM Customer c, CustOrderInfo oi\n" +
                    "WHERE c.customerID = oi.customerID AND oi.createdDate between '" + startDate + "' AND '" + endDate + "'; ";
                    
            stmt = conn.createStatement();
            rs = stmt.executeQuery(query);       
	    
            while (rs.next()) {
                results.add(new Object[]{rs.getString("customerID"), rs.getString("customerName"), rs.getString("orderID"), rs.getDouble("totalPrice"), rs.getDouble("orderBalance"), rs.getDate("Order_Date")});
            }
        } 
        catch (SQLException e ) {
            e.printStackTrace();
        } 
        finally {
            if (stmt != null) { stmt.close(); }
        }
        return results;
    }
    
    public ArrayList<Object[]> getCustNtBuy(String startDate, String endDate) throws SQLException{
        ArrayList<Object[]> results = new ArrayList<>();
        Statement stmt = null;
        String query = "";
        ResultSet rs = null;
        
        try {
            if(startDate.equals("") && endDate.equals(""))
            {
                DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
                Date todayDate = new Date();
                endDate = dateFormat.format(todayDate);
                
                Calendar cal = Calendar.getInstance();
                cal.add(Calendar.DATE, -1);        
                startDate = dateFormat.format(cal.getTime()); 
            }
            query = "SELECT *\n" +
                    "FROM Customer\n" +
                    "WHERE customerID NOT IN (SELECT customerID FROM CustOrderInfo WHERE createdDate between '" + startDate + "' AND '" + endDate + "');";
                    
            stmt = conn.createStatement();
            rs = stmt.executeQuery(query);       
	    
            while (rs.next()) {
                results.add(new Object[]{rs.getString("customerID"), rs.getString("customerName"), rs.getDate("createddate"), rs.getString("phone"), rs.getString("email")});
            }
        } 
        catch (SQLException e ) {
            e.printStackTrace();
        } 
        finally {
            if (stmt != null) { stmt.close(); }
        }
        return results;
    }
    
    public ArrayList<Object[]> getZeroQtyPOs() throws SQLException{
        ArrayList<Object[]> results = new ArrayList<>();
        Statement stmt = null;
        String query = "";
        ResultSet rs = null;
        
        try {
            
            query = "SELECT pr.itemID, pr.itemName, po.quantity, po.createdDate Purchase_Order_Date\n" +
                    "FROM Products pr, PurchaseOrder po\n" +
                    "WHERE pr.itemID = po.itemID AND pr.quantity = 0 AND isFulfilled = 0;";
                    
            stmt = conn.createStatement();
            rs = stmt.executeQuery(query);       
	    
            while (rs.next()) {
                results.add(new Object[]{rs.getString("itemID"), rs.getString("itemName"), rs.getString("quantity"), rs.getDouble("createdDate"), rs.getDouble("Purchase_Order_Date")});
            }
        } 
        catch (SQLException e ) {
            e.printStackTrace();
        } 
        finally {
            if (stmt != null) { stmt.close(); }
        }
        return results;
    }
    
    public double getTotalAmountForOrder(String orderID) throws SQLException{
        ArrayList<Object[]> results = new ArrayList<>();
        PreparedStatement pstmt = null;
        String query = "";
        ResultSet rs = null;
        
        try {
            query = "select totalPrice From CustOrderInfo where orderID = ?;";
            pstmt = conn.prepareStatement(query);
            pstmt.setString(1, orderID);
            
	    rs = pstmt.executeQuery();
            while (rs.next()) {
                results.add(new Object[]{rs.getDouble("totalPrice")});
            }
        } 
        catch (SQLException e ) {
            e.printStackTrace();
        } finally {
            if (pstmt != null) { pstmt.close(); }
        }
        Object[] totalPrice = results.get(0);
        return (Double)totalPrice[0];  
    }  
    
    public boolean insertNewCustomer(String customerID, String customerName, String phoneNumber, String emailAddress, double creditLimit)
    {
        PreparedStatement pstmt;        
        boolean success = true;
        try {
            String sql = "INSERT INTO Customer (customerid,customername,createddate,phone,email) VALUES (?,?,?,?,?)";
            DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
            Date today = new Date();          
            pstmt = conn.prepareStatement(sql);        
            pstmt.setString(1,customerID);
            pstmt.setString(2,customerName);
            pstmt.setTimestamp(3,new java.sql.Timestamp(System.currentTimeMillis()));
            pstmt.setString(4,phoneNumber);
            pstmt.setString(5,emailAddress);
            pstmt.executeUpdate();
            if(creditLimit != 0)
            {
                sql = "INSERT INTO CreditLimits (customerid,creditlimit,currentbalance) VALUES (?,?,?)";
                pstmt = conn.prepareStatement(sql);
                pstmt.setString(1,customerID);
                pstmt.setDouble(2,creditLimit);
                pstmt.setDouble(3,0.00);
                pstmt.executeUpdate();                               
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBManager.class.getName()).log(Level.SEVERE, null, ex);
            success = false;
        }
        finally
        {
            return success;
        }
    }
    
       public boolean insertNewPurchaseOrder(String itemID, int quantity)
    {
        PreparedStatement pstmt;        
        boolean success = true;
        try {
            String sql = "INSERT INTO PurchaseOrder (itemid,quantity,createddate,isfulfilled) VALUES (?,?,?,?)";
            DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
            Date today = new Date();          
            pstmt = conn.prepareStatement(sql);        
            pstmt.setString(1,itemID);
            pstmt.setInt(2,quantity);
            pstmt.setTimestamp(3,new java.sql.Timestamp(System.currentTimeMillis()));
            pstmt.setInt(4,0);            
            pstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DBManager.class.getName()).log(Level.SEVERE, null, ex);
            success = false;
        }
        finally
        {
            return success;
        }
    }
       
       public boolean insertNewInvoice(String orderID, double amountPaid)
    {
        PreparedStatement pstmt;        
        boolean success = true;
        try {
            String sql = "INSERT INTO Invoices (orderid,amountpaid,createddate) VALUES (?,?,?)";
            DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
            Date today = new Date();          
            pstmt = conn.prepareStatement(sql);        
            pstmt.setString(1,orderID);
            pstmt.setDouble(2,amountPaid);
            pstmt.setTimestamp(3,new java.sql.Timestamp(System.currentTimeMillis()));                      
            pstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DBManager.class.getName()).log(Level.SEVERE, null, ex);
            success = false;
        }
        finally
        {
            return success;
        }
    }       
   
    public Object[] login(String username, String password) throws SQLException {
    
        PreparedStatement pstmt = null;
	ResultSet rs = null;
        Object[] user = null;
        String query = "select * from users where username = ? and password = ? limit 1;";
        try {
            //stmt = conn.createStatement();
            
            pstmt = conn.prepareStatement(query);
	    pstmt.setString(1, username);
            pstmt.setString(2, password);
	    rs = pstmt.executeQuery();
            if (rs.next()) 
                user = new Object[]{rs.getString("ID"), rs.getString("firstname"), rs.getString("lastname"), rs.getString("password"), rs.getBoolean("isAdmin"), rs.getString("username")};
            else 
                user = null;
	    
        } 
        catch (SQLException e ) {
            //System.out.println(e.getMessage());
            e.printStackTrace();
        } finally {
            if (pstmt != null) { pstmt.close(); }
        }
        return user;
    }
}
