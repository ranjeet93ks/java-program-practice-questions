package com.top.program.questions.others;

public class JavaOuputTest {

	public static void main(String[] args) {
		int index = 0;
		boolean flag = true;
		boolean a = false;
		@SuppressWarnings("unused")
		boolean b;
		b = (flag | ((index++) == 0));
		b = (a | ((index += 2) > 0));
		System.out.println(index);

		char ach = 'A';
		int ax = ach;
		System.out.println("A" + " : " + ax);

		int g = 3;
		System.out.println(++g * 8);// 32

		int h = 3;
		System.out.println(h++ * 8);// 24

		int d = 9;
		System.out.println(d++);// 9
		System.out.println(d);// 10
		System.out.println(++d);// 11

	}

}
