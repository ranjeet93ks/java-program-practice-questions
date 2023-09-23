package com.top.program.questions.digocn;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DigitalOceanProgramString1 {

	public static void main(String[] args) {
		countCharOfString("Ranjeet"); // R=1 a=1 n=1 j=1 e=2 t=1 --order followed
		countCharOfString1("Ranjeet");// a=1 R=1 t=1 e=2 j=1 n=1 --order didnt followed
		proveImmutability();

		String s1 = "abc";
		String s2 = "abc";
		System.out.println("s1 == s2 is:" + s1 == s2);// false
		// The output of the given statement is false because the + operator has a
		// higher precedence
		// than the == operator. So the given expression is evaluated to “s1 == s2
		// is:abc” == “abc”, which is false.

	}

	// distinct characters and their count in a string

	public static void countCharOfString(String str) {
		char[] charArr = str.toCharArray();
		Map<Character, Long> map = new LinkedHashMap<>();// follow insertion order
		for (char c : charArr)
			map.put(c, map.getOrDefault(c, 0l) + 1);

		map.entrySet().stream().forEach(System.out::println);
	}

	public static void countCharOfString1(String str) {
		System.out.println("countCharOfString1 --> ");
		Map<Character, Long> map = new LinkedHashMap<>();
		map = str.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		map.entrySet().stream().forEach(System.out::println);// here order is not followed
	}

	// prove programmeticall that string is immutable
	public static void proveImmutability() {
		String s1 = "Java"; // "Java" String created in pool and reference assigned to s1

		String s2 = s1; // s2 also has the same reference to "Java" in the pool

		System.out.println(s1 == s2);// true // proof that s1 and s2 have the same reference

		s1 = "Python";
		// s1 value got changed above, so how String is immutable?

		// in the above case a new String "Python" got created in the pool
		// s1 is now referring to the new String in the pool
		// BUT, the original String "Java" is still unchanged and remains in the pool
		// s2 is still referring to the original String "Java" in the pool

		// proof that s1 and s2 have different reference
		System.out.println(s1 == s2);// false

		System.out.println(s2);// java
		// prints "Java" supporting the fact that original String value is unchanged,
		// hence String is immutable
	}
}
