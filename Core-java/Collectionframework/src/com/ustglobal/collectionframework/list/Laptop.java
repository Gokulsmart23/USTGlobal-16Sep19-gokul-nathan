package com.ustglobal.collectionframework.list;

public class Laptop implements Comparable<Laptop>{
	
	double price;
	int ram;
	String name;
	public Laptop(double price, int ram, String name) {
		super();
		this.price = price;
		this.ram = ram;
		this.name = name;
	}
//	@Override
//	public int compareTo(Laptop p) {
//
//		Double d = this.price;
//		Double e = p.price;
//		
//		return d.compareTo(e);
//	}
	@Override
	public int compareTo(Laptop p) {
		Integer x = this.ram;
		Integer y = p.ram;
		return x.compareTo(y);
	}
	
	

}
