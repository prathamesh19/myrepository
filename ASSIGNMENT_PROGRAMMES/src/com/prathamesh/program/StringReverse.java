package com.prathamesh.program;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class StringReverse {
//------------------------------String Reverse 5 ways---------------------------------//
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}	public static void reverseStringWay1() {
			String input = "java";
			StringBuilder input1 = new StringBuilder();
			input1.append(input);
			input1 = input1.reverse();
			System.out.println(input1);
		}

		public static void reverseStringWay2() {
			String input = "java";
			byte[] strAsByteArray = input.getBytes();
			byte[] result = new byte[strAsByteArray.length];
			for (int i = 0; i < strAsByteArray.length; i++)
				result[i] = strAsByteArray[strAsByteArray.length - i - 1];
			System.out.println(new String(result));
		}

		public static void reverseStringWay3() {
			String input = "java";
			char[] try1 = input.toCharArray();
			for (int i = try1.length - 1; i >= 0; i--)
				System.out.print(try1[i]);
		}

		public static void reverseStringWay4() {
			String input = "java";
			char[] temparray = input.toCharArray();
			int left, right = 0;
			right = temparray.length - 1;
			for (left = 0; left < right; left++, right--) {
				// Swap values of left and right
				char temp = temparray[left];
				temparray[left] = temparray[right];
				temparray[right] = temp;
			}
			for (char c : temparray)
				System.out.print(c);
			System.out.println();
		}

		public static void reverseStringWay5() {
			String input = "java";
			char[] hello = input.toCharArray();
			List<Character> trial1 = new ArrayList<>();
			for (char c : hello)
				trial1.add(c);
			Collections.reverse(trial1);
			ListIterator li = trial1.listIterator();
			while (li.hasNext())
				System.out.print(li.next());
		}

		public static String reverseStringUsingRecursion(String str) {
			String reverse = "";
			if (str.length() == 1) {
				return str;
			} else {
				reverse += str.charAt(str.length() - 1) + reverseStringUsingRecursion(str.substring(0, str.length() - 1));
				return reverse;
			}
		}
	}

//------------------------------------------------------------------------------------------------------------------------------//