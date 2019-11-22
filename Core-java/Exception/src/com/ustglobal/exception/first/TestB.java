package com.ustglobal.exception.first;

public class TestB {

	public static void main(String[] args) {
		System.out.println("Main started");
		
		int a = 10;
		int b = 0;
		try {
			b = 10/0;
			System.out.println(b);
			System.out.println("Hello");
			System.out.println("Happy Diwali");
		} catch (ArithmeticException e) {
			System.out.println("number is divided by zero");
		}
		
		System.out.println("Main ended");
	}

}
