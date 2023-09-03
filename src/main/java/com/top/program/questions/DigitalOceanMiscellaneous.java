package com.top.program.questions;

public class DigitalOceanMiscellaneous {

	ThreadStates myVar = ThreadStates.START;

	public static void main(String[] args) {
		ThreadStates myVar = ThreadStates.START;

	}

}

enum ThreadStates {
	START, RUNNING, WAITING, DEAD;
}