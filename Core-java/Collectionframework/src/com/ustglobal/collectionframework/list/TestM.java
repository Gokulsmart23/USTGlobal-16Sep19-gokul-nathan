package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.Collections;

public class TestM {
	
	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("raju");
		al.add("pavan");
		al.add("Reddy");
		al.add("guru");
		
		
		System.out.println("Before sort ---->"+al);
		Collections.sort(al);
		System.out.println("after sort ------>"+al);
	}

}
