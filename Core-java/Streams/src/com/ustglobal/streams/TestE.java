package com.ustglobal.streams;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class TestE {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<>();
		al.add(70);
		al.add(25);
		al.add(35);
		al.add(30);
		al.add(90);
		al.add(45);
		
		List<Integer> l = al.stream().sorted().collect(Collectors.toList());
		Iterator<Integer> it = l.iterator();
		System.out.println("Sorted -------------->");
		while (it.hasNext()) {
			Integer i = it.next();
			System.out.println(i);
		}
				
	}

}
