package org.tnsif.capgemini.c2tc.exception;

public class ThrowDemo {
	
	void validate(int age) {
		
		if(age<18)
		{
			throw new ArithmeticException("They are not eligible for C2TC");
		}
		else
		{
			System.out.println("You are eligible");
		}
		
	}

	public static void main(String[] args) {
		ThrowDemo obj = new ThrowDemo();
		obj.validate(14);
		System.out.println("Welcome C2TC");
	}

}
