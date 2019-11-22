package com.ustglobal.objectclass;

public class TestD {
	public static void main(String[] args) {
		Student s1 = new Student(10,"gokul",60.1);
		
		int h = s1.hashCode();
		System.out.println(h);
		String s = s1.toString();
		System.out.println(s);
	}
}
