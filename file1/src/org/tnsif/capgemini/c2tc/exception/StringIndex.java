package org.tnsif.capgemini.c2tc.exception;

public class StringIndex {

	public static void main(String[] args) {
		String str = "hello"; //0-4
	try {
		char ch = str.charAt(6);
		System.out.println(ch);
	}
	catch(StringIndexOutOfBoundsException e)
	{
		System.out.println(e);
	}
	finally
	{
		System.out.println("This block will get executed regardless of exception");
	}

	}

}
