package com.prathamesh.program;

public class DuplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//-----------------Duplicates From Array------------------------//
		 String[] strArray = {"abc", "def", "mno", "xyz", "pqr", "xyz", "def"};
		 
	        for (int i = 0; i < strArray.length-1; i++)
	        {
	            for (int j = i+1; j < strArray.length; j++)
	            {
	                if( (strArray[i].equals(strArray[j])) && (i != j) )
	                {
	                    System.out.println("Duplicate Element is : "+strArray[j]);
	                }
	            }
	        }
//------------------------------------------------------------------//
	}

}
