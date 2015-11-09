package com.reshmaa.calculator.operations;

public class Operation {
	private int a;
	private int b;
	
	public Operation () {
		this.a = 1;
		this.b = 2;
	}
	
	public Operation (int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public void print () {
		System.out.println("A=" + this.a);
		System.out.println("B=" + this.b);
	}
}
