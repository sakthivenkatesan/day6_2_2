package com.capgemini.day6;

public class StringOperations 
{
	public static void main(String [] args)
	{
		//Length function --> Returns the length of the string
		String str = "Hello World";
		System.out.println("The length of the given string " + str.length());
		
		//Checking for Empty String
		System.out.println("Empty string check");
		String estr = new String();
		System.out.println(estr.isEmpty());  
		System.out.println(str.isEmpty());  
		
		//Checking for equality with and without case
		System.out.println("Equal to operations");
		String str1 = "Hello World";
		String str2 = "Sakthi Venkatesan";
		String str3 = "HeLlO wOrLd";
		System.out.println(str1.equals(str));
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		System.out.println(str1.equalsIgnoreCase(str3));	
		
		//Retrieving a character using its index
	    System.out.println("8th character of the string Sakthi Venkatesan is " + str2.charAt(7));
	    
	    //Comparing two strings and return an integer 
		String str4 = "B";
		String str5 = "T";
	    System.out.println("String comparision" + str4.compareTo(str5)); 
	    
	    //Checks whether the string starts with certain letter
	    System.out.println("Does Sakthi Venkatesan starts with S? " + str2.startsWith("S"));
	    System.out.println("Does Sakthi Venkatesan starts with V? " + str2.startsWith("V"));
	    
	    //Case Conversion
	    System.out.println("String in a lower case " + str2.toLowerCase());
	    System.out.println("String in a upper case " + str2.toUpperCase());
	    
	    /*//To trim the string after space
	    System.out.println("String after trimming: " + str2.trim());*/
	    
	    //Pick out the substrings in a string
	    System.out.println("Substring after seven characters: " + str2.substring(7));
	    System.out.println("Substring between 7 and 13: " + str2.substring(7, 13));






	}
}
