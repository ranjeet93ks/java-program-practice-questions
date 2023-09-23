package com.top.program.questions.digocn;

public class DigitalOceanProgramString {

	public static void main(String[] args) {
		System.out.println(reverseString("Hello"));// olleH
		System.out.println(reverseStringSB("Hello"));// olleH
		swappingNumbers(100, 500);
		System.out.println(isVowelPresentMatches("Ranjeet"));
		System.out.println(isVowelPresent("Ranjeet"));
		System.out.println(isVowelPresent("rdhgtr"));
		isPalindrome("aba");// aba is a palindrome
		isPalindrome("madam");// madam is a palindrome
		isPalindrome("racecar");// racecar is a palindrome
		System.out.println(removeSpace(" Hello Java World "));// HelloJavaWorld
		System.out.println(removeSpaceTrim("    Hello Java  "));// Hello Java
		System.out.println(removeSpaceStrip("    Hello Java  "));// Hello Java
	}

	// reverse string
	public static String reverseStringSB(String str) {
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		return sb.toString();
	}

	// reverse string
	public static String reverseString(String str) {
		char[] charArr = str.toCharArray();
		int length = charArr.length;
		char[] newCharArr = new char[length];
		for (int j = 0; j < length; j++) {
			newCharArr[length - j - 1] = charArr[j];
		}
		return String.valueOf(newCharArr);
	}

	// Swapping numbers without using a third variable
	public static void swappingNumbers(int a, int b) {
		System.out.println("Nos. before swapping :" + a + "," + b);
		b = b + a; // now b is sum of both the numbers
		a = b - a; // b - a = (b + a) - a = b (a is swapped)
		b = b - a; // (b + a) - b = a (b is swapped)
		System.out.println("Nos. after swapping :" + a + "," + b);
	}

	// to check whether the string contains vowels
	public static boolean isVowelPresentMatches(String input) {
		System.out.println("input is : " + input);
		return input.toLowerCase().matches(".*[aeiou].*");
	}

	public static boolean isVowelPresent(String input) {
		System.out.println("input is : " + input);
		for (char c : input.toLowerCase().toCharArray()) {
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				return true;
			}
		}
		return false;
	}

	// A palindrome string is the same string backwards or forwards.
	public static void isPalindrome(String input) {
		boolean result = true;
		int length = input.length();
		for (int i = 0; i < length / 2; i++) {
			if (input.charAt(i) != input.charAt(length - i - 1)) {
				result = false;
				break;
			}
		}
		if (result)
			System.out.println(input + " is a palindrome");
		else
			System.out.println(input + " is not a palindrome");
	}

	// remove all white spaces from a string
	public static String removeSpace(String str) {
		str = str.replaceAll("\\s+", "");
		return str;
	}

	// remove leading and trailing whitespaces
	public static String removeSpaceTrim(String str) {
		str = str.trim();
		return str;
	}

	public static String removeSpaceStrip(String str) {
		str = str.strip();// strip() introduced in java11
		return str;
	}

}
