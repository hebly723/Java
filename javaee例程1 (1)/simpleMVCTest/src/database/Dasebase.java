package database;
import java.sql.*;

import javax.swing.text.DefaultEditorKit.CutAction;

import com.microsoft.sqlserver.jdbc.*;
public class Dasebase {
public static Connection conn;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			System.out.println("驱动加载成功");
			conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;DatabaseName = OrderDB",
					"sa", "123");
			System.out.println("连接成功");
			conn.close();
		}
		catch (Exception e)
		{
			System.out.println("连接失败");
			e.printStackTrace();
		}
	}
	public static Connection getConnection()
	{
		try
		{

			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			System.out.println("驱动加载成功");
			conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;DatabaseName = OrderDB",
					"sa", "123");
			System.out.println("连接成功");
			conn.close();
		}
		catch (Exception e)
		{
			System.out.println("连接失败");
			e.printStackTrace();
		}
		return conn;
	}
	public static void addCustomer(String customerNo, String customerName, String telephone,
			String address, String zip)
	{
		conn = getConnection();
		try {
			String sql="insert into Customer values(?,?,?,?,?)";
			PreparedStatement pStatement=conn.prepareStatement(sql);
			pStatement.setString(0, customerNo);
			pStatement.setString(1, customerName);
			pStatement.setString(2, telephone);
			pStatement.setString(3, address);
			pStatement.setString(4, zip);
			int rtn = pStatement.executeUpdate();
			System.out.println("数据库连接成功");
		} catch (Exception e) {
			System.out.println("数据库连接失败");
		}
	}
	public static void addEmployee(String employeeNo, String employeeName, String gender,
			Date birthday, String address, String telephone, String hiredate, String department,
			String headShip, float salary)
	{
		conn = getConnection();
		try {
			String sql="insert into Employee values(?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement pStatement=conn.prepareStatement(sql);
			pStatement.setString(0, employeeNo);
			pStatement.setString(1, employeeName);
			pStatement.setString(2, gender);
			pStatement.setDate(3, birthday);
			pStatement.setString(4, address);
			pStatement.setString(5, telephone);
			pStatement.setString(6, hiredate);
			pStatement.setString(7, department);
			pStatement.setString(8, headShip);
			pStatement.setFloat(9, salary);
			int rtn = pStatement.executeUpdate();
			System.out.println("数据库连接成功");
		} catch (Exception e) {
			System.out.println("数据库连接失败");
		}
	}
	public static void addOrderDetail(String orderNo, String productNo, String quantity,
			float price)
	{
		conn = getConnection();
		try {
			String sql="insert into OrderDetail values(?,?,?,?)";
			PreparedStatement pStatement=conn.prepareStatement(sql);
			pStatement.setString(0, orderNo);
			pStatement.setString(1, productNo);
			pStatement.setString(2, quantity);
			pStatement.setFloat(3, price);
			//pStatement.setString(5, telephone);
			//pStatement.setString(6, hiredate);
			//pStatement.setString(7, department);
			//pStatement.setString(8, headShip);
			//pStatement.setFloat(9, salary);
			int rtn = pStatement.executeUpdate();
			System.out.println("数据库连接成功");
		} catch (Exception e) {
			System.out.println("数据库连接失败");
		}
	}
	public static void addOrderMaster(String orderNo, String customerNo, String employeeNo, 
			Date orderDate, float orderSum, String invoiceNo)
	{
		conn = getConnection();
		try {
			String sql="insert into OrderMaster values(?,?,?,?,?,?)";
			PreparedStatement pStatement=conn.prepareStatement(sql);
			pStatement.setString(0, orderNo);
			pStatement.setString(1, customerNo);
			pStatement.setString(2, employeeNo);
			pStatement.setDate(3, orderDate);
			pStatement.setFloat(4, orderSum);
			pStatement.setString(5, invoiceNo);
			//pStatement.setString(7, department);
			//pStatement.setString(8, headShip);
			//pStatement.setFloat(9, salary);
			int rtn = pStatement.executeUpdate();
			System.out.println("数据库连接成功");
		} catch (Exception e) {
			System.out.println("数据库连接失败");
		}
	}
	
	public static void addProduct(String productNo, String productName, String productClass, 
			float productPrice, int inStock)
	{
		conn = getConnection();
		try {
			String sql="insert into OrderDetail values(?,?,?,?,?)";
			PreparedStatement pStatement=conn.prepareStatement(sql);
			pStatement.setString(0, productNo);
			pStatement.setString(1, productName);
			pStatement.setString(2, productClass);
			pStatement.setFloat(3, productPrice);
			pStatement.setInt(4, inStock);
			//pStatement.setString(5, invoiceNo);
			//pStatement.setString(7, department);
			//pStatement.setString(8, headShip);
			//pStatement.setFloat(9, salary);
			int rtn = pStatement.executeUpdate();
			System.out.println("数据库连接成功");
		} catch (Exception e) {
			System.out.println("数据库连接失败");
		}
	}
	
	 public static ResultSet select( String database, String out, String condition)
	 {
		 ResultSet ret = null;
		 String sql="select ? from ? where ? ";
		 try{
		 PreparedStatement statement = conn.prepareStatement(sql);
		 statement.setString(0, out);
		 statement.setString(1, database);
		 statement.setString(2, condition);
		 ret = statement.executeQuery();
		 }catch(Exception e){
			 
		 }
		 return ret;
	 }
	 
	 public boolean dbDelete(String tableName, String condition) 
	 {//——–>>> 删除操作
		 boolean delResult = false; 
		 String sql = "delete from " + tableName + " " + condition; 
		 try{ 
		 PreparedStatement statement = conn.prepareStatement(sql);
		 statement.executeUpdate(sql); 
		 //return int // int delRe = ?? 
		 delResult = true; 
		 }catch(Exception e){ 
		 System.out.println ("sql = " + sql); 
		 System.out.println ("Exception: " + e.getMessage()); 
		 } 
		 if (delResult) 
		 return true; 
		 else 
		 return false; 
	 }
	 
	 
}
