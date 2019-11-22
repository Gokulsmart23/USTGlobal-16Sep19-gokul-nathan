package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

public class ExecuteDeleteQueryWithProperties {
	
		public static void main(String[] args) {
			
			Connection conn = null;
			PreparedStatement pstmt = null;
			FileReader reader = null;

		try {
			reader = new FileReader("db.properties");
			Properties prop = new Properties();
			prop.load(reader);
			//Driver driver  = new Driver();
			//DriverManager.registerDriver();
			
			Class.forName(prop.getProperty("driver-class-name"));
			String url = prop.getProperty("url");
			conn = DriverManager.getConnection(url, prop);
			String sql = prop.getProperty("delete-query");
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, Integer.parseInt(args[0]));
			
			int count = pstmt.executeUpdate();
			System.out.println(count + " Row(s) deleted");
		} catch (SQLException | ClassNotFoundException | IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null) {
					conn.close();
				}
				if (pstmt != null) {
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
