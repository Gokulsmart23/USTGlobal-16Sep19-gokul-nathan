package com.ustglobal.empapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import java.util.Scanner;

import com.ustglobal.empapp.dao.EmployeeDAO;
import com.ustglobal.empapp.dao.EmployeeDAOImpl;
import com.ustglobal.empapp.dto.EmployeeBean;
import com.ustglobal.empapp.util.EmployeeManager;

public class App {

	public static void main(String[] args) {

		System.out.println("press 1 to get all employee data");
		System.out.println("press 2 to insert employee data");
		System.out.println("press 3 to update employee data");
		System.out.println("press 4 to delete employee data");
		System.out.println("press 5 to search single employee");

		Scanner scn = new Scanner(System.in);
		int ch = scn.nextInt();

		switch (ch) {
		case 1 :
			EmployeeDAO dao = EmployeeManager.getEmployeeDAO();
			List<EmployeeBean> result=dao.getAllEmployeeData();

			for(EmployeeBean bean : result) {
				System.out.println("id: "+bean.getId());
				System.out.println("name: "+bean.getName());
				System.out.println("gender: "+bean.getGender());
				System.out.println("salary: "+bean.getSal());
				System.out.println("------------------------------------------");			
			}

			break;

		case 2:
			EmployeeDAO dao2 = EmployeeManager.getEmployeeDAO();
			EmployeeBean bean2 = new EmployeeBean();
			System.out.println("Enter Id");
			int id2 = sc.nextInt();
			bean2.setId(id2);

			System.out.println("Enter the name");
			String name = sc.next();
			bean2.setName(name);

			System.out.println("Enter salary");
			int sal = sc.nextInt();
			bean2.setSal(sal);

			System.out.println("Enter Gender");
			String gender = sc.next();
			bean2.setGender(gender);

			int count = dao2.insertEmployeeData(bean2);
			System.out.println(count+" Rows Inserted");

			break;
		case 3:
			EmployeeDAO dao3 = EmployeeManager.getEmployeeDAO();
			EmployeeBean bean3 = new EmployeeBean();

			System.out.println("Enter Id");
			int id3 = sc.nextInt();
			bean3.setId(id3);

			System.out.println("Enter Name");
			String name3 = sc.next();
			bean3.setName(name3);

			int count3  = dao3.updateEmployeeData(bean3);
			System.out.println(count3+" Rows Updated");
			break;

		case 4:
			EmployeeDAO dao4 = EmployeeManager.getEmployeeDAO();
			EmployeeBean bean4 = new EmployeeBean();
			//		    
			//		    int id4 = sc.nextInt();
			//		    bean4.setId(id4);

			int count4 = dao4.deleteEmployeeData(bean4);
			System.out.println(count4 +" Rows Deleted");
			break;

		case 5:
			EmployeeDAO dao5 = EmployeeManager.getEmployeeDAO();
			int id = scn.nextInt();
			EmployeeBean bean = dao5.searchEmployeeData(id);
			if(bean!=null) {
				System.out.println("id: "+bean.getId());
				System.out.println("name:  "+bean.getName());
				System.out.println("gender: "+bean.getGender());
				System.out.println("salary: "+bean.getSal());
				
			}
			else {
				System.out.println("no data found");
			}
			break;
		}
	}
}
