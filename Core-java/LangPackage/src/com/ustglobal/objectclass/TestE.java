package com.ustglobal.objectclass;

public class TestE {

	public static void main(String[] args) {
		Car c1= new Car(1000000, "Verna", "White");
		Car c2= new Car(800000, "City", "Black");
		Car c3 = new Car(600000, "Ciaz", "white");
		
		System.out.println("Verna cost is "+c1.hashCode());
		System.out.println("City cost is "+c2.hashCode());
		System.out.println("Ciaz cost is "+c3.hashCode());
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		System.out.println(c3.toString());
		
	
	}

}
