package com.stringbuffer;

public class StringBufferMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String is Immutable
		String s1 = "Ajay";
		String s2 = "Ajay";
		System.out.println(s1 == s2); // here we get true because 2 variables stored in same address
		s1 = s1+"Singh";
		System.out.println(s1 == s2);
		String s3 = "AjaySingh";
		System.out.println(s1 == s3); // here we get false because string has immutable nature it doesn't change it creates new memory space
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>");
		//StringBuffer
		
		StringBuffer sb1 = new StringBuffer("Ajay");
		StringBuffer sb2 = new StringBuffer("Ajay");
		System.out.println(sb1 == sb2);
		
		sb1.append("Singh");
		System.out.println(sb1 == sb2);
		StringBuffer sb3 = new StringBuffer("AjaySingh");
		System.out.println(sb1 == sb3);
		
		//methods
		System.out.println(sb1.compareTo(sb3)); // it compares actual value
		System.out.println(sb1.append(0));
		System.out.println(sb1.reverse()); //yaja
		 

	}

}
