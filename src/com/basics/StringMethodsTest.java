package com.basics;

public class StringMethodsTest {

	public static void main(String[] args) {
		String str = "arif";
		String s = "MANGULAL";
		String s1 = "hello world welcome to java se training";
		String s2 = "";
		String s3 = null;
		String s4 = "      Selenium automation               ";
		System.out.println(str.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println("Length of the string is:"+ s.length());
		System.out.println(s1.contains("java"));
		System.out.println(s1.charAt(0));
		System.out.println(s1.charAt(1));
		System.out.println(s1.replaceAll("se", "software edition"));
		System.out.println(s1.concat(" program"));
		System.out.println("hello");
		System.out.println(str.equals("arif"));
		System.out.println(s1.concat(" program"));
		System.out.println(str.equals("ARIF"));
		System.out.println(str.equalsIgnoreCase("ARIF"));
		System.out.println(s1.isEmpty());
		System.out.println(s2.isEmpty());
		//System.out.println(s3.isEmpty());
		//System.out.println(s3.length());
		System.out.println(s1.substring(2, 10));
		System.out.println(s4);
		System.out.println(s4.trim());

		char[] res =s1.toCharArray();

		System.out.println(res[0]);
		System.out.println(res[1]);

		for(char c : res) {
			System.out.println(c + " ");
		}
		for (int i = 0; i < res.length; i++) {
			System.out.println("chracter found is: " + res[i]);
		}
		
			String sText = "MANGULAL";
			String rev="";
			
		for (int i = sText.length()-1; i>=0; i--)	 {
			rev+=sText.charAt(i);
		}
		System.out.println("Reverse of " + sText + " is: " + rev );
		
	}
	
		
	}


