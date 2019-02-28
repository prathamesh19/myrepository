package com.prathamesh.INHERITANCE;



public class Test {
	
	public static void main(String[] args) {
		new OuterClass().a=10;
		OuterClass.b=10;
		new OuterClass().instanceMethodOfOuterClass();
		OuterClass.staticMethodOfOuterClass();

		new OuterClass().instanceMethodOfOuterClass();
	}
}

class OuterClass {
	int a;
	  static int b;
	  static void staticMethodOfOuterClass(){}
	  void instanceMethodOfOuterClass(){
		  class InnerClass{
	            int i;
	            static final int j=10;
	            void instanceMethodOfInnerClass(){}
	  }
		  int c=InnerClass.j;
		  new InnerClass().i=10;
		  new InnerClass().instanceMethodOfInnerClass();
     }
}