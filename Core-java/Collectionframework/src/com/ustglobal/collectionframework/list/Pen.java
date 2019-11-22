package com.ustglobal.collectionframework.list;

public class Pen implements Comparable<Pen> {
	double price;
	String brand;
	public Pen(double price, String brand) {
		super();
		this.price = price;
		this.brand = brand;
	}
	@Override
	public int compareTo(Pen p) {
		Double d =this.price;
		Double e = p.price;
		return d.compareTo(e);
	}
	

}
