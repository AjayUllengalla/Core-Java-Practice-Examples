package com.nonprimitivetypes;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "hello java";
		String str1 = "HELLO JAVA";
		System.out.println("using relational Operator "+ str == str1);
		System.out.println("Equals() method :"+ str.equals(str1));
		
		//ignoreCase Using
		System.out.println("Using ignoreCase : "+ str.equalsIgnoreCase(str1));
		
		//converting lower case and Upper Case
		System.out.println(str.toUpperCase());
		System.out.println(str1.toLowerCase());

		//index
		System.out.println("charcter at index :"+ str.indexOf(5));
		System.out.println("charcter at index :"+ str.indexOf(0));
		System.out.println("last  index of character : "+ str.lastIndexOf('l'));
		System.out.println("last  index of character : "+ str.lastIndexOf('a'));
		
		//intern() 
		String str2 = new String("HELLO JAVA");
		System.out.println("Using equals method: "+ str1.equals(str2));
		System.out.println("Using equals method: "+ str1 == str2);
		str1.intern();
		str2.intern();
		
		System.out.println("Using intern() method : "+ str1== str2);
		
		//char
		
		System.out.println(str.charAt(1));
		System.out.println(str.charAt(6));
		System.out.println(" ");
		//toCharArray()

		char[] charArray = str.toCharArray();
		
		for(char ele: charArray) {
			System.out.println(ele);
			
		}
		
		//compare
		System.out.println("Compare method: "+str.compareTo(str2));
		System.out.println();
		
		
	}

}
