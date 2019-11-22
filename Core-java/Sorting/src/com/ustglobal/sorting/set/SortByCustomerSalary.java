package com.ustglobal.sorting.set;

import java.util.Comparator;

public class SortByCustomerSalary implements Comparator<Customer>{

	@Override
	public int compare(Customer o1, Customer o2) {
		Double d1 = o1.salary;
		Double d2 = o2.salary;
		return d1.compareTo(d2);
	}

}
