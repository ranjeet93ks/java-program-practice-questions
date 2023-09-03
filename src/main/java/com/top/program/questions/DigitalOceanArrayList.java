package com.top.program.questions;

import java.util.ArrayList;
import java.util.List;

public class DigitalOceanArrayList {

	public static void main(String[] args) {
		reverseArrayList();
	}

	// reverse linkedlist
	public static void reverseArrayList() {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println(list);

		List<Integer> newList = new ArrayList<>();
		list.stream().sorted((i1, i2) -> i1 > i2 ? -1 : (i2 > i1 ? 1 : -1)).forEach(newList::add);
		System.out.println(newList);
	}

}
