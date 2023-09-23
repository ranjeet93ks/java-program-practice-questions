package com.top.program.questions.digocn;

public class DigitalOceanPyramidPattern {

	public static void main(String[] args) {
		printPattern1(7);
	}

	// print pyramid pattern
	// 1
	// 2 2
	private static void printPattern1(int rows) {
		// for loop for the rows
		for (int i = 1; i <= rows; i++) {
			// white spaces in the front of the numbers
			int numberOfWhiteSpaces = rows - i;

			// print leading white spaces
			printString(" ", numberOfWhiteSpaces);

			// print numbers
			printString(i + " ", i);

			// move to next line
			if (i < rows)
				System.out.println("");
		}
	}

	// utility function to print string given times
	private static void printString(String s, int times) {
		for (int j = 0; j < times; j++) {
			System.out.print(s);
		}
	}

	// ref :-
	// https://www.digitalocean.com/community/tutorials/pyramid-pattern-programs-in-java

}
