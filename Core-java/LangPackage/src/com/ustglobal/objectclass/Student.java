package com.ustglobal.objectclass;

public class Student {
	
	int id;
	String name;
	double percentage;
	
	public Student(int id, String name, double percentage) {
		super();
		this.id = id;
		this.name = name;
		this.percentage = percentage;
	}
	
	void printDetails() {
		System.out.println("Name is "+name+" Id is "+id+" Percentage is "+percentage);
	}
	
	@Override
	public int hashCode() {
		return id;
	}
	
	@Override
	public String toString() {
		return "Name is "+name+" Id is "+id+" Percentage is "+percentage;
	}
	
	
}
