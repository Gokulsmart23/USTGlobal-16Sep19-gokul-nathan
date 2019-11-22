package com.ustglobal.filehandling;

import java.io.FileReader;
import java.util.Properties;

public class PropertiesFileReader {

	public static void main(String[] args) {
		
		String path = "db.properties";
		FileReader reader = null;
		try {
			reader = new FileReader(path);
			Properties properties = new Properties();
			properties.load(reader);
			String name = properties.getProperty("url");
			String company = properties.getProperty("user");
			String role = properties.getProperty("password");
			
			System.out.println("Name: "+name);
			System.out.println("Company: "+company);
			System.out.println("Role: "+role);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		

	}

}
