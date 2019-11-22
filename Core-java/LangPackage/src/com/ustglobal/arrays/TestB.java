package com.ustglobal.arrays;

public class TestB {

	public static void main(String[] args) {
		int[] nums = {10,20,30,40,50};
		
		String arr[] = {"hello","hi","welcome","bye"};
		
		//System.out.println(nums[10]);
		receive(nums);
		int[] values = getArray();
		
	}
	
	static void receive(int[] nums) {
		for(int i: nums) {
			System.out.println(i);
		}
	}

	static int[] getArray() {
		int[] values = {28,38,48,58};
		return values;
	}
	
	static void receive(String[] arr) {
		for(String i : arr) {
			System.out.println(i);
		}
		
			}
}
