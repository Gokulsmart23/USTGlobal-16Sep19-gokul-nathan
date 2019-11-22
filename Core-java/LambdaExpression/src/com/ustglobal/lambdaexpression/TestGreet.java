package com.ustglobal.lambdaexpression;

public class TestGreet {

	public static void main(String[] args) {
		
		GreetInterface msg = (message)->{
			System.out.println("Hello");
			return message;
		};
		
		String m = msg.greet("gokul");
		System.out.println(m);
		
	
}
}
