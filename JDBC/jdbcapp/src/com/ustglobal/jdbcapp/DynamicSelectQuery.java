package com.ustglobal.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//import com.mysql.jdbc.Driver;

public class DynamicSelectQuery {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/ust_db?user=root&password=root";
		String sql = " select * from employee_info where id=? ";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			//Driver driver = new Driver();
			//DriverManager.registerDriver(driver);
			
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url);
			pstmt = conn.prepareStatement(sql);
			
			String empid = args[0];
			int id = Integer.parseInt(empid);
			pstmt.setInt(1, id);
			
			rs = pstmt.executeQuery();
			if (rs.next()) {
				int eid = rs.getInt("id");
				int sal = rs.getInt("sal");
				String name = rs.getString("name");
				String gender = rs.getString("gender");
				
				System.out.println("Id is "+eid);
				System.out.println("Name is "+name);
				System.out.println("Salary is "+sal);
				System.out.println("Gender is "+gender);
				System.out.println("----------------------------------------------------");
			}
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null) {
					conn.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}

}
