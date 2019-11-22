package com.ustglobal.beanobject.bean;

import java.util.Scanner;

public class TestC {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age");
		int age = sc.nextInt();
		System.out.println("Age is "+age);
		System.out.println("Enter name");
		String name = sc.next();
		System.out.println(name);
		System.out.println("Enter sentence");
		String sentence = sc.nextLine()	;
		System.out.println(sentence);
	}

}
