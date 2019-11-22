package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

public class ExecuteInsertQueryWithProperties {
	
public static void main(String[] args) {
		
		Connection conn = null;
		//Statement stmt = null;
		PreparedStatement pstmt = null;
		FileReader reader = null;
		
		try {
			// Step 1 Load the Driver
			//Driver driver = new Driver();
			//DriverManager.registerDriver(driver);
			reader = new FileReader("db.properties");
			Properties prop = new Properties();
			prop.load(reader);
			
			Class.forName(prop.getProperty("driver-class-name"));
			String url = prop.getProperty("url");
			
			// Step 2 Get the connection
			conn = DriverManager.getConnection(url, prop);
			
			// Step 3 Issue SQL Query
			//String sql = prop.getProperty("insert-query");
			pstmt = conn.prepareStatement(prop.getProperty("insert-query"));
			
			String empid = args[0];
			int id = Integer.parseInt(empid);
			pstmt.setInt(1, id);
			
			String name = args[1];
			pstmt.setString(2, name);
			
			String empsal = args[2];
			int sal = Integer.parseInt(empsal);
			pstmt.setInt(3, sal);
			
			String gender = args[3];
			pstmt.setString(4, gender);
			
			
			int count = pstmt.executeUpdate();
			
			// Step 4 Read the Result
			System.out.println(count +" Row(s) inserted");
		} catch (SQLException | ClassNotFoundException | IOException e) {
			e.printStackTrace();
		} finally {
			
			try {
				if (conn != null) {
					conn.close();
				}
				if (pstmt !=null) {
					pstmt.close();
				}
				if (reader != null) {
					reader.close();
				}
			} catch (SQLException | IOException e) {
				e.printStackTrace();
			}
		}
	}

}
