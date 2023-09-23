package com.top.program.questions.digocn;

import java.util.Arrays;
import java.util.List;

public class DigitalOceanProgramInteger {

	public static void main(String[] args) {
		isPrime(7);// true
		isPrime(8);// false
		isPrime(9);// false
		isPrime(10);// false
		isPrime(11);// true
		printFibonacci(10);// 0 1 1 2 3 5 8 13 21 34
		System.out.println(onlyOddNumbers(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12)));// false
		System.out.println(onlyOddNumbers(Arrays.asList(3, 5, 7, 9, 11, 13)));// true
		System.out.println(onlyOddNumbersStream(Arrays.asList(3, 5, 7, 9, 11, 13)));// true
		System.out.println(factorial(4));// 24
		System.out.println(factorial(5));// 120
		System.out.println(sumOfElements(10));
	}

	// check a number is prime
	public static void isPrime(int no) {
		boolean result = false;
		if (no == 0 || no == 1)
			result = false;
		else if (no == 2 || no == 3)
			result = true;
		else if (no % 1 == 0 || no % no == 0) {
			for (int j = 2; j < no - 1; j++) {
				if (no % j == 0) {
					result = false;
					break;
				} else
					result = true;
			}

		} else
			result = false;

		if (result)
			System.out.println(no + " is a prime number");
		else
			System.out.println(no + " is not a prime number");
	}

	// print first n no in Fibonacci sequence -> each number is the sum of the two
	// previous numbers.
	public static void printFibonacci(int seqLength) {
		System.out.print("A Fibonacci sequence of " + seqLength + " numbers: ");
		for (int i = 0; i < seqLength; i++) {
			System.out.print(fibonacci(i) + " ");
		}
		System.out.println();
	}

	public static int fibonacci(int count) {
		if (count <= 1)
			return count;
		return fibonacci(count - 1) + fibonacci(count - 2);
	}

	// check if a list of integers contains only odd numbers
	public static boolean onlyOddNumbers(List<Integer> list) {
		for (int i : list) {
			if (i % 2 == 0)
				return false;
		}
		return true;
	}

	public static boolean onlyOddNumbersStream(List<Integer> list) {
		return list.parallelStream() // parallel stream for faster processing
				.anyMatch(x -> x % 2 != 0); // return as soon as any elements match the condition
	}

	// The factorial of an integer
	public static long factorial(long n) {
		if (n == 1)
			return 1;
		else
			return (n * factorial(n - 1));
	}

	// sum of n elements
	public static long sumOfElements(int n) {
		int sum = 0;
		for (int j = 1; j <= n; j++) {
			sum = sum + j;
		}
		return sum;
	}

}
