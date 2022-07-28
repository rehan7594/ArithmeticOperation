package com.rehan;

import java.util.Scanner;

public class ArithmeticOperation {
	public int add(int a,int b) {
		return a+b;
	}

	public int sub(int a, int b) {
		return a-b;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first value a : ");
		int a = scanner.nextInt();
		System.out.println("Enter the sceond value of b : ");
		int b = scanner.nextInt();

		ArithmeticOperation arithmeticOeration = new ArithmeticOperation();
		
		int result1 = arithmeticOeration.add(a, b);
		System.out.println("Addition of a and b is : " + result1);

		int result2 = arithmeticOeration.sub(a, b);
		System.out.println("Subtraction of a and b is : " + result2);
	}

}