package com.test.TestSample;

public class HelloWorld {

	public static void main(String[] args) {

		System.out.println("We are in hello world program.");
		for (String string : args) {
			System.out.println("String args:"+string);
		}
	}

}
