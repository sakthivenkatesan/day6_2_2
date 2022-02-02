package com.capgemini.day6;

public class StringBufferOperations 
{
	public static void main(String [] args)
	{
		//Creation of string buffer
		StringBuffer sb = new StringBuffer("Sakthi ");
		
		//Concatenation operation in string buffer
		sb.append("Venkatesan");
		System.out.println("After String Buffer Concatenation ");
		System.out.println(sb);
		
		//String Deletion
		System.out.println();
		System.out.println("After String Buffer Deletion ");
		sb.delete(2, 5);
		System.out.println(sb);
		
		//String buffer insertion
		System.out.println();
		System.out.println("After String Buffer Insertion ");
		sb.insert(2,"kth");
		System.out.println(sb);
		
		//replacement of string buffer
		System.out.println();
		System.out.println("After String Buffer Insertion ");
		StringBuffer sb1=new StringBuffer("A12EFG");  
		sb1.replace(1,3,"BCD");  
		System.out.println(sb1);
		
		//String reversal
		System.out.println();
		System.out.println("After String Reversal ");
		sb.reverse();  
		System.out.println(sb);
		
		//String builder creation
		System.out.println();
		StringBuilder stb=new StringBuilder("String ");
        sb.append("Builder");
        System.out.println(stb);
	}
}
