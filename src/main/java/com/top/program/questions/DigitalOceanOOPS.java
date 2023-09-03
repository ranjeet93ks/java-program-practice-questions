package com.top.program.questions;

public class DigitalOceanOOPS {

	public static void main(String[] args) {

	}

}

//show diamond problem in java
class Parent {

}

class ChildA extends Parent {

}

class ChildB extends Parent {

}

class grandChild extends ChildA, ChildB{//compilation error
	
}

//