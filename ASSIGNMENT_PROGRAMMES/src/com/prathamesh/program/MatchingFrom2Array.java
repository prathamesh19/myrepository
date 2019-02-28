package com.prathamesh.program;

public class MatchingFrom2Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//----------------Matching Numbers From 2 Arrays--------------//
		int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
        int[] arr2 = {11,2,14,16,7};
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    System.out.println(arr1[i]);
                }
            }
        }
//-----------------------------------------------------------//
	}

}
