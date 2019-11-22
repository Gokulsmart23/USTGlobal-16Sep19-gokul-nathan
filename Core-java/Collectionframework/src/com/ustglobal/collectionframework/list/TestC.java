package com.ustglobal.collectionframework.list;

import java.util.LinkedList;

public class TestC {
	public static void main(String[] args) {
		LinkedList<Integer> l = new LinkedList<Integer>();
		l.add(12);
		l.add(25);
		l.add(34);
		l.add(24);
		System.out.println(l);
		
		Integer peekElement = l.peek();
		System.out.println("peek element is "+peekElement);
		
		Integer peekFirstElement = l.peekFirst();
		System.out.println("peek firstelement is "+peekFirstElement);
		
		Integer peekLastElement = l.peekLast();
		System.out.println("peek lastelement is "+peekLastElement);
		
		System.out.println("=============================");
		
		Integer pollElement = l.poll();
		System.out.println("poll element is "+pollElement);
		
		Integer pollFirstElement = l.pollFirst();
		System.out.println("poll first element is "+pollFirstElement);
		
		Integer pollLastElement = l.pollLast();
		System.out.println("poll last element is "+pollLastElement);
		
		System.out.println("after poll "+l);
		
		l.push(12);
		System.out.println("after push"+l);
		
		Integer p = l.pop();
		System.out.println(p);
		
	
		
		
		
		
	}

}
