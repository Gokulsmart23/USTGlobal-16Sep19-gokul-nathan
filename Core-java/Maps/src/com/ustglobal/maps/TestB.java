package com.ustglobal.maps;

import java.util.HashMap;

public class TestB {

	public static void main(String[] args) {

		HashMap hm = new HashMap();
		hm.put("kuku", 998987);
		hm.put("mala", 840543);
		hm.put("sheela", 7999898);
		
		HashMap hm1 = new HashMap();
		hm1.put("deepu", 7999800);
		hm1.put("riya", 3453533);
		hm1.put("kirthi", 132445);
		
		boolean hasKey = hm1.containsKey("riya");
		System.out.println("Has key "+hasKey);
		
		boolean hasValue = hm1.containsValue(3453533);
		System.out.println("Has value "+hasValue);
		
		System.out.println(hm1.containsKey(null));
		
		hm.putAll(hm1);
		System.out.println("After putAll ------------->"+hm);
		
		System.out.println(hm.size());
		hm.clear();
		System.out.println(hm.isEmpty());
		
		
		
		
	}

}
