package com.prathamesh.program;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//---------------------reverse Array Elements-------------------------------------------//
		int [] inputArray={1,2,3,4,5};
		int temp;
        
        for (int i = 0; i < inputArray.length/2; i++) 
        {
            temp = inputArray[i];
             
            inputArray[i] = inputArray[inputArray.length-1-i];
             
            inputArray[inputArray.length-1-i] = temp;
        }
         
        System.out.println("Array After Reverse : "+ Arrays.toString(inputArray));
//--------------------------------------------------------------------------------------//
    }
	}
