package com.top.program.questions.others;

public class TestClass {
	public static void main(String[] args) {
		someMethod(null);// String method Invoked
		System.out.println(0.1 * 3 == 0.3);// false
		System.out.println(0.1 * 2 == 0.2);// true
		System.out.println(0.1 * 4 == 0.4);// true
		System.out.println(0.1 * 6 == 0.6);// false
		System.out.println(0.1 * 8 == 0.8);// true
		// This expectation mismatch is due to the error that occurs while rounding
		// float-point numbers and the fact that in Java, only the floating-point
		// numbers that are powers of 2 are represented accurately by the binary
		// representation. The rest of the numbers should be rounded to accommodate the
		// limited bits as required.
		
		System.out.println(Math.min(Double.MIN_VALUE, 0.0d));//0.0
		System.out.println(1.0/0.0);//Infinity
		System.out.println(1/0.0);//Infinity
		//System.out.println(1/0);//java.lang.ArithmeticException

	}

	public static void someMethod(Object o) {
		System.out.println("Object method Invoked");
	}

	public static void someMethod(String s) {
		System.out.println("String method Invoked");
	}
}