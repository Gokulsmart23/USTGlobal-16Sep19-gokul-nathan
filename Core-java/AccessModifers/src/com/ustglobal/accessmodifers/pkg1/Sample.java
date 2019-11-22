package com.ustglobal.accessmodifers.pkg1;

import com.ustglobal.accessmodifers.pkg2.Demo;

public class Sample extends Demo{
public static void main(String[] args) {
	Demo d = new Demo();
	/*System.out.println(d.a); d.add();
	 //Private */
	
	Sample s = new Sample();
	// Default
	/*System.out.println(d.b);
	s.sub();*/
	
	// Protected
	System.out.println(s.c);
	s.mul();
	
	//Public
	System.out.println(d.name);
	d.div();
}
}
