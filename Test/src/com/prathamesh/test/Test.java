package com.prathamesh.test;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Test {

public static void main(String[] args) {
passGen(6, 15, Complexity.LOW);
}
public enum Complexity{
	LOW,MEDIUM,HIGH
}

public static char [] passGen(int min, int max, Complexity cmp){
	String low="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
	String medium="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
	String high="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz@#$%&*<>?";
	String s="";
	
	if(cmp==Complexity.LOW){
		s=low;
	}
	if(cmp==Complexity.MEDIUM){
		s=medium;
	}
	if(cmp==Complexity.HIGH){
		s=high;
	}
	 int i=ThreadLocalRandom.current().nextInt(min, max);
	 Random rnd=new Random();
	 char [] pwd=new char[i];
	 for(int j=0;j<i;j++){
		 pwd [j]= s.charAt(rnd.nextInt(s.length()));
	 }
	 System.out.println(pwd);
	
	return pwd;
}
}
