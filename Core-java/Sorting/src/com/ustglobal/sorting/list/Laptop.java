package com.ustglobal.sorting.list;

public class Laptop implements Comparable<Laptop>{
	
	double price;
	int ram;
	String name;
	
	public Laptop(double price, int qty, String brand) {
		super();
		this.price = price;
		this.ram = qty;
		this.name = brand;
	}

	@Override
	public int compareTo(Laptop lp) {
		if(this.ram > lp.ram) {
			return 1;
		} else if (this.ram < lp.ram) {
			return -1;
		} else {
		return 0;
		}
	}
	
	
	
	
}
