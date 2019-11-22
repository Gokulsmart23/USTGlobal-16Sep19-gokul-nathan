package com.ustglobal.lambdaexpression;

public class TestFactorail {

	public static void main(String[] args) {
		
		FactorailInterface f1 = (n)->{
			int fact = 1;
			for(int i= 2;i<=n;i++) {
				fact = fact*i;
			}
			return fact;
		};
		
		int factorail = f1.factorail(5);
		System.out.println("Factorail is "+factorail);
	}

}
