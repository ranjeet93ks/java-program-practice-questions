package com.top.program.questions.digocn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DigitalOceanArrayList {

	public static void main(String[] args) {
		reverseArrayList();
		mergeList();
		
		List<String> list = Arrays.asList(new String[] {"A","B"});
		list.forEach(System.out::print);//AB
		list.stream().forEach(System.out::print);//AB
		list.forEach(i-> System.out.print(i));//AB
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

	// merge two list
	public static void mergeList() {
		List<Integer> list1 = Arrays.asList(new Integer[] { 1, 3, 5, 7, 9 });
		List<Integer> list2 = Arrays.asList(new Integer[] { 2, 4, 6, 8 });
		System.out.println("list1 : " + list1.toString());
		System.out.println("list2 :" + list2.toString());

		//list1.addAll(list2);//java.lang.UnsupportedOperationException
		List<Integer> mergedList = new ArrayList<>(list1);
		mergedList.addAll(list2);
		System.out.println("after merging");
		System.out.println("list1 : " + list1.toString());
		System.out.println("list2 :" + list2.toString());
		System.out.println("mergedList :" + mergedList.toString());
		
		//concl :- to merge two list, need to create a separate list n add for list there
		

	}

}
