package org.tnsif.capgemini.c2tc.oops;

class Human
{
	int age;
	String name;
	
}

public class BeforeEncapsulation {

	public static void main(String[] args) {
		Human obj = new Human();
		obj.age = 21;
		obj.name = "Veda Vani";
		obj.age = 18;
		obj.name = "Vani";
		System.out.println("Her name is "+obj.name);
		System.out.println("Her age is "+obj.age);

	}

}
