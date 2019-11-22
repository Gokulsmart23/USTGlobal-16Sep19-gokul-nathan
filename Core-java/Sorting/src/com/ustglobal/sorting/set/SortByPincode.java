package com.ustglobal.sorting.set;

import java.util.Comparator;

public class SortByPincode implements Comparator<Bank>{

	@Override
	public int compare(Bank o1, Bank o2) {
		Integer i1 = o1.pincode;
		Integer i2 = o2.pincode;
		return i1.compareTo(i2);
	}

}
