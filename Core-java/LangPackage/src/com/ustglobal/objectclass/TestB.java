package com.ustglobal.objectclass;

public class TestB {

	public static void main(String[] args) {
		Pen p = new Pen();
		int hash = p.hashCode();
		System.out.println("HashCode of p is "+hash);
		
		Pen q = new Pen();
		int hash1 = q.hashCode();
		System.out.println("HashCode of q is "+hash1);
		
	}

}
