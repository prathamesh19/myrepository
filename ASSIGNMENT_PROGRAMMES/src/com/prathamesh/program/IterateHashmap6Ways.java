package com.prathamesh.program;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class IterateHashmap6Ways {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Map map=new HashMap();
map.put(100, "hundred");
map.put(200, "two-hundred");
map.put(300, "three-hundred");
Set s1=map.entrySet();
Iterator itr=s1.iterator();
while(itr.hasNext()){
	System.out.println(itr.next());
}
	for(Object i:s1){
	System.out.println(i);
}
Set s2=map.keySet();
Iterator itr1=s2.iterator();
while(itr1.hasNext()){
	System.out.println(itr1.next());
}
for(Object j:s2){
System.out.println(j);
}
Collection s3=map.values();
Iterator itr3=s3.iterator();
while(itr3.hasNext()){
	System.out.println(itr3.next());
}
for(Object k:s3){
System.out.println(k);
}


	}

}
