package com.top.program.questions;

public class DigitalOceanFIStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r1 = () -> System.out.println("My Runnable");
		// r1.run();
		// r1.start() --not available
		Thread t1 = new Thread(r1);
		t1.start();//My Runnable
		Foo foo = () -> System.out.println("My Foo");
		foo.test();//My Foo
	}

}

@FunctionalInterface
interface Foo {
	void test();
}
