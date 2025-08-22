package com.basics;

public class ArrayTest {

	public static void main(String[] args) {
		
		/**
		 * Array - To store and retrieve group of elements of same type we can use array.
		 * Arrays are fixed in nature (it means we can't add or remove elements from an array once declared). Hence
		   we prefer collections over array to store and manipulate, sort the groups of elements.
		 */

		int[] marks = {45,70,35,50,80};
		String[] names = {"aditi", "srinivas", "mangulal", "surender", "amruth"};
		double[] salary = {5000.00, 86500.00, 45000.00, 70.000};
		System.out.println("Length of the salary array is: " + salary.length);
		System.out.println(marks[0]);
		System.out.println(marks[1]);
		System.out.println(marks[2]);
		System.out.println(marks[3]);
		System.out.println(marks[4]);
		// System.out.println(marks[5]); // ArrayIndexOutOfBoundsException
		System.out.println("Length of the array is: " + marks.length);

		for (int i = 0; i < marks.length; i++) {
			System.out.println(marks[i]);
		}

		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		
		// Array Declaration Only
		int[] a; // preferred  
		int b[]; // legacy style
		String[] str;
		
		// Array Declaration + allocation (fixed length, default values)
		int[] c = new int[5]; // {0,0,0,0,0}
		System.out.println(c[0]);
		System.out.println(c[1]);
		System.out.println(c[2]);
		System.out.println(c[3]);
		System.out.println(c[4]);
		// System.out.println(c[5]); // ArrayIndexOutOfBoundsException
		
		String[] sText = new String[3]; // {null, null, null}
		System.out.println(sText[0]);
		System.out.println(sText[1]);
		System.out.println(sText[3]); // ArrayIndexOutOfBoundsException
		System.out.println(sText[2]);
		
		// Array declaration + initialization
		int[] d = {1,2,3,4};
		System.out.println(d[0]);
		System.out.println(d[1]);
		System.out.println(d[2]);
		System.out.println(d[3]);
		// System.out.println(d[4]); // ArrayIndexOutOfBoundsException
		String[] cities = {"hyderabad", "chennai", "bangalore"};
		System.out.println(cities[0]);
		System.out.println(cities[1]);
		System.out.println(cities[2]);
		System.out.println(cities[3]); // ArrayIndexOutOfBoundsException
	}
}
