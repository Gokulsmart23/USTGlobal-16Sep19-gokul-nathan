package com.ustglobal.accessmodifers.pkg2;

public class Run {

	public static void main(String[] args) {
		Demo d = new Demo();
		/*System.out.println(d.a); d.add();
		 //Private */
		
		// Default
		System.out.println(d.b);
		d.sub();
		
		// Protected
		System.out.println(d.c);
		d.mul();
		
		//Public
		System.out.println(d.name);
		d.div();
	}

}
