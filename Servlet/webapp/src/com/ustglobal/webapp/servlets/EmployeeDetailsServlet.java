package com.ustglobal.webapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EmployeeDetailsServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int empId = Integer.parseInt(req.getParameter("id"));
		
		PrintWriter out = resp.getWriter();
//		out.println(empId);

		String url = "jdbc:mysql://localhost:3306/ust_db?user=root&password=root";
		String sql = " select * from employee_info where id= "+empId;
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url);
			stmt = conn.createStatement();
			
			rs = stmt.executeQuery(sql);
			if (rs.next()) {
				int eid = rs.getInt("id");
				int sal = rs.getInt("sal");
				String name = rs.getString("name");
				String gender = rs.getString("gender");
				out.println("<html>");
				out.println("<body>");
				out.println("<table border='1px'>");
				out.println("<tr>");
				
				out.println("<th>id</th>");
				out.println("<th>name</th>");
				out.println("<th>sal</th>");
				out.println("<th>gender</th>");
				out.println("</tr>");
				
				out.println("<tr>");
				out.println("<td>");
				out.println(eid);
				out.println("</td>");
				out.println("<td>");
				out.println(name);
				out.println("</td>");
				out.println("<td>");
				out.println(sal);
				out.println("</td>");
				out.println("<td>");
				out.println(gender);
				out.println("</td>");
				out.println("</tr>");
				
				out.println("</table>");
				out.println("</body>");
				out.println("</html>");
			}
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null) {
					conn.close();
				}
				if (stmt != null) {
					stmt.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
