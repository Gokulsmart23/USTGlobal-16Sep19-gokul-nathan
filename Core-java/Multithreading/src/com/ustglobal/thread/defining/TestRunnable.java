package com.ustglobal.thread.defining;

public class TestRunnable {

	public static void main(String[] args) {
		
		System.out.println("Main started");
		
		MyRunnable mr = new MyRunnable();
//		mr.start(); start() method is in Thread class 
		
		Thread t = new Thread(mr);
		t.start();
		
		for (int i=0; i<10; i++) {
			System.out.println("Main thread");
		}
		
		System.out.println("Main ended");
	}

}
