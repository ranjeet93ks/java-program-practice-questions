package com.top.program.questions.digocn;

import java.util.Arrays;
import java.util.Collections;
import java.util.Optional;
import java.util.Random;

public class DigitalOceanProgramArrays {

	public static void main(String[] args) {
		sortIntArray(new int[] { 1, 7, 5, 3, 9, 4, 0, 2, 6 });

		System.out.println(sameElements(new int[] { 1, 2, 3, 4, 5 }, new int[] { 1, 2, 3, 4, 5 }));// true
		System.out.println(sameElements(new int[] { 1, 2, 3, 4, 5 }, new int[] { 1, 2, 3, 4, 7 }));// false

		System.out.println(findSecondlargest(new int[] { 1, 7, 5, 3, 9, 4, 0, 2, 6 }));// 7
		System.out.println(findSecondHighest(new int[] { 1, 7, 5, 3, 9, 4, 0, 2, 6 }));// 7
		System.out.println(findHighest(new int[] { 1, 7, 5, 3, 9, 4, 0, 2, 6 }));// 9
		shuffleArray();

	}

	// how to sort an array
	public static void sortIntArray(int[] inpArr) {
		System.out.println("before sorting " + Arrays.toString(inpArr));
		Arrays.sort(inpArr);
		System.out.println("after sorting " + Arrays.toString(inpArr));
	}

	// checks if two arrays contain the same elements.
	public static boolean sameElements(int[] inpArr1, int[] inpArr2) {
		System.out.println("inpArr1 " + Arrays.toString(inpArr1));
		System.out.println("inpArr2 " + Arrays.toString(inpArr2));
		boolean result = true;

		int length1 = inpArr1.length;
		int length2 = inpArr2.length;

		if (length1 != length2)
			result = false;
		else {
			for (int j = 0; j < length1; j++) {
				if (inpArr1[j] != inpArr2[j]) {
					result = false;
					break;
				}
			}
		}
		return result;
	}

	// the second largest number in an array
	public static int findSecondlargest(int[] intArr) {
		// int array to Integer array
		Integer[] boxedArray = new Integer[intArr.length];
		for (int i = 0; i < intArr.length; i++) {
			boxedArray[i] = Integer.valueOf(intArr[i]);
		}

		if (intArr != null && intArr.length != 0)
			// Arrays.sort(intArr);
			Arrays.sort(boxedArray, Collections.reverseOrder());

		Optional<Integer> secondElement = Optional.ofNullable(intArr[1]);
		return secondElement.get();
	}

	private static int findSecondHighest(int[] array) {
		int highest = Integer.MIN_VALUE;
		int secondHighest = Integer.MIN_VALUE;

		for (int i : array) {
			if (i > highest) {
				secondHighest = highest;
				highest = i;
			} else if (i > secondHighest) {
				secondHighest = i;
			}

		}
		return secondHighest;
	}

	private static int findHighest(int[] array) {
		int highest = Integer.MIN_VALUE;
		for (int i : array) {
			if (i > highest) {
				highest = i;
			}

		}
		return highest;
	}

	// shuffle an array
	public static void shuffleArray() {
		int[] array = { 1, 2, 3, 4, 5, 6, 7 };
		System.out.println("before shuffle : " + Arrays.toString(array));

		Random rand = new Random();
		int length = array.length;
		for (int i = 0; i < length; i++) {
			int randomIndexToSwap = rand.nextInt(length);
			int temp = array[randomIndexToSwap];
			array[randomIndexToSwap] = array[i];
			array[i] = temp;
		}

		System.out.println("after shuffle : " + Arrays.toString(array));
	}

}
