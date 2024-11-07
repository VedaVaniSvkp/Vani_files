package org.tnsif.capgemini.c2tc.oops;

class Animal{
	String name = "Animal";
	void eat()
	{
		System.out.println(name+" is Eating");
	}
}
class Dog extends Animal{
	void bark()
	{
		System.out.println("Dog is barking");
	}
}

public class Single_Inheritance {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.eat();
		dog.bark();

	}

}
