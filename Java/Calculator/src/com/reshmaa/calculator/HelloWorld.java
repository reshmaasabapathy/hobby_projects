package com.reshmaa.calculator;

import com.reshmaa.calculator.operations.Operation;

public class HelloWorld {
	/**
	 * Main Function.
	 * @param args
	 */
	public static void main (String args[]) {
		Operation object = new Operation(10, 20);
		object.print();
	}
}
