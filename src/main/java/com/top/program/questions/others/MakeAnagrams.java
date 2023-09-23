package com.top.program.questions.others;

public class MakeAnagrams {

	public static void main(String[] args) {
		String str1 = "ddccpp", str2 = "ppddff";
		System.out.println(remAnagram(str1, str2));
	}

	// return no of deletion required from either of strings to make both strings
	// anagrams of each other.
	static int remAnagram(String a, String b) {
		// make hash array for both string
		// and calculate frequency of each
		// character
		int count1[] = new int[26];
		int count2[] = new int[26];

		// count frequency of each character
		// in first string
		for (int i = 0; i < a.length(); i++)
			count1[a.charAt(i) - 'a']++;

		// count frequency of each character
		// in second string
		for (int i = 0; i < b.length(); i++)
			count2[b.charAt(i) - 'a']++;

		// traverse count arrays to find
		// number of characters to be removed
		int result = 0;
		for (int i = 0; i < 26; i++)
			result += Math.abs(count1[i] - count2[i]);
		return result;
	}

}

//Java program to find minimum number of characters to be removed to make two strings anagram.
