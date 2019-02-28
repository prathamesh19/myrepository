package com.prathamesh.program;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//---------------------Set To Array---------------//
Set set=new HashSet();
set.add(1);
set.add(2);
set.add(3);
set.add(4);
set.add(5);
System.out.println(set);
Object [] obj=set.toArray();
System.out.println(Arrays.toString(obj));
//-------------------------------------------------//
	}

}
