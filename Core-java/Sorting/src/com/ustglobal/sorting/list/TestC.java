package com.ustglobal.sorting.list;

import java.util.LinkedList;

public class TestC {

	public static void main(String[] args) {
		
		LinkedList<Integer> li = new LinkedList<>();
		
		li.add(12);
		li.add(23);
		li.add(34);
		li.add(25);
		
		Integer peekElement = li.peek();
		System.out.println(""+peekElement);
		Integer peekFirstElement = li.peekFirst();
		System.out.println(peekFirstElement);
		Integer peekLastElement = li.peekLast();
		System.out.println(peekLastElement);
		System.out.println("After peek --------------> "+li);
		
		Integer pollElement = li.poll();
		System.out.println(pollElement);
		Integer pollFirstElement = li.pollFirst();
		System.out.println(pollFirstElement);
		Integer pollLastElement = li.pollLast();
		System.out.println(pollLastElement);
		System.out.println("After poll --------------->"+li);
		
		li.push(12);
		System.out.println("After push"+li);
		Integer p = li.pop();
		System.out.println(p);
		System.out.println("After pop -------------> "+li);
	}

}
