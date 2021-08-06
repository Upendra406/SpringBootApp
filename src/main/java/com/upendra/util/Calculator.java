package com.upendra.util;

public class Calculator {
	
	public void add(int a, int b) {
		System.out.println(a + b);
	}
	public void sub(int a, int b) {
		System.out.println(a - b);
	}
	public void mul(int a, int b) {
		System.out.println(a * b);
	}
	public void div(int a, int b) {
		System.out.println(a / b);
	}
	public void mod(int a, int b) {
		System.out.println(a % b);
	}
	
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		calculator.add(10, 20);
		calculator.sub(10, 20);
		calculator.mul(10, 20);
		calculator.div(10, 20);
		calculator.mod(10, 20);
		
	}

}
