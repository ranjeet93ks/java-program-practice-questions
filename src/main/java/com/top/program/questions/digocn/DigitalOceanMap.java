package com.top.program.questions.digocn;

import java.util.HashMap;
import java.util.Map;

public class DigitalOceanMap {

	public static void main(String[] args) {
		sortByValue();
	}

	// sort hashmap by value
	public static void sortByValue() {
		Map<String, Integer> map = new HashMap<>();
		map.put("IT", 1000);
		map.put("Admin", 200);
		map.put("HR", 50);
		map.put("Security", 100);
		map.entrySet().forEach(System.out::println);
		map.entrySet().stream()
				.sorted((e1, e2) -> e1.getValue() > e2.getValue() ? -1 : e1.getValue() < e2.getValue() ? 1 : 0);
		System.out.println("after sorting");
		map.entrySet().forEach(System.out::println);
	}

}
