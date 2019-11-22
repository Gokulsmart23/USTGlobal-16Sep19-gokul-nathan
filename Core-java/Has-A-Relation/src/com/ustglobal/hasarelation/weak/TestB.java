package com.ustglobal.hasarelation.weak;

public class TestB {

	public static void main(String[] args) {
		
		Car c = new Car();
		System.out.println("Car color is "+c.color);
		c.start();
		c.mp.playMusic();
		c.mp.pauseMusic();
	}

}
