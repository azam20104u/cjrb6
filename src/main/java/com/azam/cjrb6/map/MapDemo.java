package com.azam.cjrb6.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String,  String>();
		//mostly used because of searching operation frequently, and HashMap peform faster than any other Map
		map.put("RN101", "Rahul");
		map.put("RN102", "Shubham");
		map.put("RN104", "Sonali");
		map.put("RN103", "Ravi");
		map.put("RN105", "Faizal");
		map.put("RN1001", "Mike");
		//Entry is Inner interface of Map interface, which has methods getKey() and getValue()
		Set<Entry<String,String>> entrySet = map.entrySet();
		for (Entry<String, String> entry : entrySet) {
			System.out.println(entry.getKey()+"-->"+entry.getValue());
		}
	}
}
