package com.ustglobal.maps;

import java.util.HashMap;
public class TestA {

	public static void main(String[] args) {
		
		HashMap hm = new HashMap();
		
		hm.put("kuku", 998987);
		hm.put("mala", 840543);
		hm.put("sheela", 7999898);
		
		System.out.println("Data "+hm);
		hm.put("mala", 7009909);
		System.out.println("After modify "+hm);
		hm.put("dimple", 7009909);
		System.out.println("After modify "+hm);
		hm.put(null, 5757669);
		System.out.println("After modify "+hm);
		hm.put(null, 93434242);
		System.out.println("After modify "+hm);
		Object num = hm.get("mala");
		System.out.println("Value "+num);
		
		System.out.println("-------------------------------------------");
		
		System.out.println(hm.get("gokul"));
		
		Object value = hm.remove("kuku");
		System.out.println("Removed value "+value);
		
		System.out.println("After remove ---------------------------> "+hm);
		
	}

}
