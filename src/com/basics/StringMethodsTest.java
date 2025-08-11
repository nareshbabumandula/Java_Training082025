package com.basics;

public class StringMethodsTest {

	public static void main(String[] args) {
		String str = "arif";
		String s = "MANGULAL";
		String s1 = "hello world welcome to java se training";
		String s2 = "";
		String s3=null;
		String s4 = "      Selenium automation               ";
		System.out.println(str.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println("Length of the string is: " + s.length());
		System.out.println(s1.contains("java"));
		System.out.println(s1.charAt(0));
		System.out.println(s1.charAt(1));
		System.out.println(s1.replaceAll("se", "software edition"));
		System.out.println(s1.concat(" program"));
		System.out.println("hello");
		System.out.println(str.equals("arif")); // true
		System.out.println(str.equals("ARIF")); // false
		System.out.println(str.equalsIgnoreCase("ARIF")); // true
		System.out.println(s1.isEmpty()); //false
		System.out.println(s2.isEmpty()); // true
		System.out.println(s1.isBlank()); // false
		//System.out.println(s3.isEmpty()); // NullPointerException
		//System.out.println(s3.length()); // NullPointerException
		System.out.println(s1.substring(2, 10)); // llo worl
		//System.out.println(s1.substring(2, 100)); // StringIndexOutOfBoundsException:
		System.out.println(s4);
		System.out.println(s4.trim());
		System.out.println("String endsWith status: " + s1.endsWith("training"));

		char[] res = s1.toCharArray();
		System.out.println("Length of the array is: " + res.length);

		System.out.println(res[0]);
		System.out.println(res[1]);

		// for each loop
		for (char c : res) {
			System.out.print(c + " ");
		}

		for (int i = 0; i < 10; i++) {
			System.out.println("Iteration is: " + i);		
		}

		System.out.println("for loop in reverse order..!");
		for (int i = 10; i > 0; i--) {
			System.out.println("Iteration is: " + i);		
		}

		for (int i = 0; i < res.length; i++) {
			System.out.println("Character found is: " + res[i]);		
		}

		// Write a java code to reverse a string
		String sText = "arif";
		String rev="";

		for (int i = sText.length()-1; i>=0; i--) {
			rev+=sText.charAt(i);
		}
		System.out.println("Reverse of " + sText + " is: " + rev);
		System.out.println(str.equals("arif"));

	}
}