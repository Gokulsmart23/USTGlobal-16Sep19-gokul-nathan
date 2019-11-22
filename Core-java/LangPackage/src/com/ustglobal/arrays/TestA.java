package com.ustglobal.arrays;

public class TestA {

	public static void main(String[] args) {
		
		int[] nums = new int[5];
		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 30;
		nums[3] = 40;
		nums[4] = 50;
		
		for(int i=0; i<nums.length; i++) {
			System.out.println(nums[i]);
		}
		System.out.println("---------------For Each----------------");
		for(int i: nums) {
			System.out.println(i);
		}
		
		boolean[] i = {true, false};
		
		double[] d = {1.1, 2.2, 3.3, 4.4, 5.5};
		for(int i1=0; i1<d.length; i1++) {
			System.out.println(d[i1]);
		}
		for(double j: d) {
			System.out.println(j);
		}
		
		byte[] by = new byte[5];
		by[0] = 10;
		by[1] = 20;
		by[2] = 30;
		by[3] = 40;
		by[4] = 50;
		
		for(int k=0; k<by.length; k++) {
			System.out.println(nums[k]);
		}
		System.out.println("---------------For Each----------------");
		for(int k: by) {
			System.out.println(k);
		}
		
		String[] arg = {"hello","hi","welcome","bye"};
		
		for(int l=0; l<arg.length; l++) {
			System.out.println(arg[l]);
		}
		
		for(String l : arg) {
			System.out.println(l);
		}
		
	}

}
