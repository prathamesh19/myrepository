package com.prathamesh.program;

public class Swap2NumberWithoutUsing3rdVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//-------------------Swap 2 Numbers Without Using 3rd Variable----------------//
		int num1 = 90;
		int num2 = 80;
		
		System.out.println("Before Swapping");
		System.out.println("Value of num1 is :" + num1);
		System.out.println("Value of num2 is :" +num2);
		
		//add both the numbers and assign it to first
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		
		System.out.println("After Swapping");
		System.out.println("Value of num1 is :" + num1);
		System.out.println("Value of num2 is :" +num2);
//-----------------------------------------------------------------------------//
	}

}
