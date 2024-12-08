package org.tnsif.capgemini.c2tc.StringDemo;

public class StringDemo1 {
	
	public static void main(String[] args) {
		String s1 = "Hello World";
		String s2 = "Hello World";
		String s3 = "Greetings";
		String s4 = new String("Greetings");
		String s5 = "Hello World";
		if(s1==s2) //== compare the address or reference
		{
			System.out.println("Reference pointing to the same object");
		}
		else
		{
			System.out.println("Reference pointing to the different object");
		}
		System.out.println("String3 "+s3);
		System.out.println("String4 "+s4);
		System.out.println("String5 "+s5);
		
	}

}
