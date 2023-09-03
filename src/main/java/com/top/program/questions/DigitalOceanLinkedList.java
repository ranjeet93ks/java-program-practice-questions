package com.top.program.questions;

import java.util.LinkedList;

public class DigitalOceanLinkedList {

	public static void main(String[] args) {
		reverseLinkedList();
	}

	// reverse linkedlist
	public static void reverseLinkedList() {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println(list);

		LinkedList<Integer> newList = new LinkedList<>();
		list.descendingIterator().forEachRemaining(newList::add);
		System.out.println(newList);
	}

}
