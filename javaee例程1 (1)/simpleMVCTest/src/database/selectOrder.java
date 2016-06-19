package database;
import javax.servlet.*;

import database.*;

import javax.servlet.http.*;

import java.sql.*;
import java.io.*;
public class selectOrder {
	public selectOrder()
	{
		super();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=GB2312");//设置响应的MIME类型。   
		java.io.PrintWriter out = response.getWriter();  
		//String constr =request.getParameter("condition");
		String datastr = request.getParameter("database");
		String outstr = request.getParameter("out");
		ResultSet ret = database.Dasebase.select(datastr, outstr, "*");
		if (ret!=null)
			try {
				while(ret.next())
				out.println("<table>"
						+ "<tr>"+ret.getString("employeeNo")+"</tr>"
						+ "<tr>"+ret.getString("employeeName")+"</tr>"
						+ "<tr>"+ret.getString("gender")+"</tr>"
						+ "<tr>"+ret.getDate("birthday")+"</tr>"
						+ "<tr>"+ret.getString("address")+"</tr>"
								+ "</table>");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
