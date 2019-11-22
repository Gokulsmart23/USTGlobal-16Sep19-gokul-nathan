package com.ustglobal.sorting.set;

import java.util.Comparator;

public class SortByMICR implements Comparator<Bank>{

	@Override
	public int compare(Bank o1, Bank o2) {
		Long m1 = o1.micr;
		Long m2 = o2.micr;
		return m1.compareTo(m2);
	}
	
}
