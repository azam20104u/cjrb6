package com.azam.cjrb6.map;

import java.util.HashMap;
import java.util.Map;

public class UserDefineClassKeyMap {
	public static void main(String[] args) {
		Map<Batch, Subject> map = new HashMap<Batch, Subject>();
		map.put(new Batch(101, "cjrb6"), new Subject(11, "IT"));
		map.put(new Batch(101, "cjrb6"), new Subject(12, "HR"));
		System.out.println(map.size());
		System.out.println(map);
	}
}
