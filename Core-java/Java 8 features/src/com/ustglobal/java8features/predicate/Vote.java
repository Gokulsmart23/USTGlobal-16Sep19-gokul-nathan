package com.ustglobal.java8features.predicate;

import java.util.function.Predicate;

public class Vote {

	int age;
	
	public Vote(int age) {
		super();
		this.age = age;
	}

	public static void main(String[] args) {
		
		Predicate<Vote> p = v-> {
			if (v.age >= 18) 
				return true;
			else
				return false;
		};
		
		Vote v = new Vote(22);
		System.out.println("Result is "+p.test(v));
	}

}
