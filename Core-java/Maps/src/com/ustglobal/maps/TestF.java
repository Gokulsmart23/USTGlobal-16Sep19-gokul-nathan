package com.ustglobal.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class TestF {

	public static void main(String[] args) {
		
		Student s1 = new Student(2, "divya", 67.89);
		Student s2 = new Student(5, "ambika", 89.86);
		Student s3 = new Student(12, "kiran", 45.08);
		Student s4 = new Student(23, "rose", 81.06);
		Student s5 = new Student(1, "gokul", 69.01);
		Student s6 = new Student(8, "kavin", 59.86);
		Student s7 = new Student(4, "mohan", 65.06);
		Student s8 = new Student(7, "sonu", 47.83);
		Student s9 = new Student(9, "sasi", 59.86);
		
		ArrayList<Student>	al1 = new ArrayList<Student>();
		al1.add(s1);
		al1.add(s2);
		al1.add(s3);
		
		ArrayList<Student>	al2 = new ArrayList<Student>();
		al2.add(s4);
		al2.add(s5);
		al2.add(s6);
		
		ArrayList<Student>	al3 = new ArrayList<Student>();
		al3.add(s7);
		al3.add(s8);
		al3.add(s9);
		
		HashMap<String, ArrayList<Student>> hm = new HashMap<>();
		hm.put("first", al1);
		hm.put("second", al2);
		hm.put("third", al3);
		
		ArrayList<Student> second = hm.get("second");
		
		Iterator<Student> it = second.iterator();
		while (it.hasNext()) {
			Student s = it.next();
			System.out.println("Id is "+s.id);
			System.out.println("Name is "+s.name);
			System.out.println("Percentage is "+s.percetage);
			System.out.println("------------------------------------------------------");
		}
		
	}

}
