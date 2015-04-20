package GolfMerchUI;

import java.sql.*;
import java.util.ArrayList;
/**
 *
 * @author Costasv
 */
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
