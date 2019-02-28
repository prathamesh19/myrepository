package com.prathamesh.program;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayToSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//----------------Array To Set--------------------------//
String [] array={"abc","def","ghi","jkl","mno"};
Set arraytoset=new HashSet(Arrays.asList(array));
System.out.println(Arrays.toString(array));
System.out.println(arraytoset);
//-----------------------------------------------------//
	}

}
