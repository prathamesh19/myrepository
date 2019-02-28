package com.prathamesh.program;

public class FibonacciSeries {
public static void main(String[] args) {
//------------Fibonacci Series---------------//
	int count = 10, num1 = 0, num2 = 1;
	for (int i = 1; i <= count; ++i) {
		System.out.print(num1 + " ");
		int sumOfPrevTwo = num1 + num2;
		num1 = num2;
		num2 = sumOfPrevTwo;
	}
//-------------------------------------------//
}
}
