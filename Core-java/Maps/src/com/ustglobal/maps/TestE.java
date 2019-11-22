package com.ustglobal.maps;

import java.util.Map;
import java.util.TreeMap;

public class TestE {

	public static void main(String[] args) {

		TreeMap<String, Integer> tm = new TreeMap<String, Integer>();
		tm.put("hosur", 560068);
		tm.put("hariyana", 134203);
		tm.put("banglore", 635109);
//		tm.put(null, 5345454);
		
		for (Map.Entry<String, Integer> m : tm.entrySet()) {
			String key = m.getKey();
			Integer value = m.getValue();
			System.out.println("Key is "+key);
			System.out.println("Value is "+value);
		}
	}

}
