package com.ustglobal.thread.defining;

public class TestA {

	public static void main(String[] args) {

		System.out.println("Main started");

		MyThread t1 = new MyThread();
		t1.start();
//		t1.start();	  IllegalThreadStateException	
		/*
		 * it will behaves like noraml program
		 * Dont call run method
		 * t1.run();
		 */


		for (int i = 0; i < 10; i++) {
			System.out.println("main thread");
		}

		System.out.println("Main ended");
	}

}
