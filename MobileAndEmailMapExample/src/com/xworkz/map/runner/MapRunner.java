package com.xworkz.map.runner;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapRunner {

	public static void main(String[] args) {

		Map<Long, String> map = new HashMap<>();

		map.put(9380916659L, "meghamantur@gmail.com");
		map.put(9901108485L, "preetibh@gmail.com");
		map.put(8974374682L, "soumyahalalli@gmail.com");

		Set<Long> keys = map.keySet();
		keys.forEach(ref -> System.out.println("Keys:" + keys));
		System.out.println("=====================");

		Collection<String> values = map.values();
		values.forEach(ref -> System.out.println("Values:" + values));

		System.out.println("=====================");

		Set<Map.Entry<Long, String>> entries = map.entrySet();
		entries.forEach(ref -> System.out.println("Entries:" + entries));

	}

}
