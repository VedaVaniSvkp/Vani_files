package org.tnsif.capgemini.c2tc.StringDemo;

public class StringImmutable {

	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = s1;
		
		s1 = "World";
		
		System.out.println("s1: "+s1);
		System.out.println("s2: "+s2);
		

	}

}