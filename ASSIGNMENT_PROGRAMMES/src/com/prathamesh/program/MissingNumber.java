package com.prathamesh.program;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//----------------------Missing Number------------------//
		int[] arr={1,2,3,4,5,7,8,9,10};
		int missingNumber=0;
		int n=arr.length+1;
		int sum=n*(n+1)/2;
		int restSum=0;
		for (int i = 0; i < arr.length; i++) {
			restSum=restSum + arr[i];
			 missingNumber=sum-restSum;	
	}
		System.out.println(missingNumber);
//------------------------------------------------------//
	}
}
