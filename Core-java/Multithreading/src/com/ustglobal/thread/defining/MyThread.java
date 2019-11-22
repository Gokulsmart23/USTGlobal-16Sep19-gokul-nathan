package com.ustglobal.thread.defining;

public class MyThread extends Thread {

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("child thread");
		}
	}

	@Override
	public void start() {
		super.start();
		System.out.println("start() method");
	}
	
}
