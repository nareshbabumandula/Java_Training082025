package com.java.collections;


import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		/**
		 * ArrayList
			Implements List interface.
			Backed by a dynamic array (resizable).
			Index based access.
			Accepts multiple null elements
			Allows duplicate elements.
			Maintains insertion order.
			Not synchronized (not thread-safe).
			Fast for read-heavy use cases.
			Located in java.util package.
		 */
		ArrayList<String> alist = new ArrayList<>();		
		alist.add("mangulal");
		alist.add("amruth");
		alist.add("ankith");
		alist.add("aditi");
		alist.add("shyam");
		alist.add("kiran");
		alist.add("shyam");
		alist.add(null);
		alist.add(null);
			
		List<String> arrList = new ArrayList<String>();
				
		System.out.println(alist);
		System.out.println(alist.contains("mangulal"));
		alist.remove(0);
		System.out.println(alist);
		alist.add("naresh");
		System.out.println(alist);
		alist.add(0, "shiva");
		System.out.println(alist);
		boolean bflag = alist.contains("mangulal");
		System.out.println(bflag);
		System.out.println(alist.get(2)); // output: ankith
	
		ArrayList<String> alist1 = new ArrayList<>();	
		alist.add("prem");
		alist.add("raja");
		alist.add("pete");
		alist.add("micheal");
		
		alist.addAll(alist1);
		System.out.println(alist);
		
		System.out.println("No of elements in the ArrayList are: " + alist.size());

	}

}
