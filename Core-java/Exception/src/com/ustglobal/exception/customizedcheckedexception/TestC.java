package com.ustglobal.exception.customizedcheckedexception;

import java.util.Scanner;

public class TestC {
	
	Scanner sc1 = new Scanner(System.in);

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			Scanner sc2 = new Scanner(System.in);
			
			System.out.println("Enter age");
			int age = sc.nextInt();
			
			System.out.println("age "+age);
			
			System.out.println(age/0);
			
		} catch (ArithmeticException ae) {
			
			ae.printStackTrace();
		} finally {
			
			System.out.println("finally executed");
		}
		
		System.out.println("-----------------------------------------");
		
	}

}
