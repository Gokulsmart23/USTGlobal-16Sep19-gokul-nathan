package com.ustglobal.beanobject.bean;

public class TestB {

	public static void main(String[] args) {
		Employee e = new Employee();
		e.setId(3);
		e.setSalary(12000);
		e.setName("gokul");
		e.setDept("Developement");
		e.setDesgination("First");
		
		Database1 db = new Database1();
		db.receive(e);
	}

}
