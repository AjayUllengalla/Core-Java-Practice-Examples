package com.stringbuilder;

public class StringBuilderMain {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("Hello java");
		
		sb.append(" Programming");
		System.out.println(sb);
//		

		StringBuilder sb1 = new StringBuilder("Hello Java");
		System.out.println(sb1.compareTo(sb));
		System.out.println(sb.equals(sb1));
		System.out.println(sb.charAt(4));
		System.out.println(sb.lastIndexOf("a"));
		System.out.println(sb.length());;
		
		System.out.println(sb.insert(0, "C"));
		System.out.println(sb.reverse());
	}

}
