package com.top.program.questions.others;

public class HackerrankTest extends Child {

	public HackerrankTest() {
		super();
		System.out.println("HackerrankTest class");
	}
	// o/p
	// HackerrankTest class
	// Child class

	public static void main(String[] args) {
		Parent p = new HackerrankTest();
		p.parent();

	}

}

abstract class Parent {
	public abstract void parent();
}

class Child extends Parent {
	@Override
	public void parent() {
		System.out.println("Child class");
	}
}
