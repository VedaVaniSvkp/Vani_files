package org.tnsif.capgemini.c2tc.oops;

class Animal1
{
	void eat()
	{
		System.out.println("Animal is eating");
	}
}
class Mammal extends Animal
{
	void sleep()
	{
		System.out.println("Mammal is Sleeping");
	}
}
class Dog2 extends Mammal
{
	void bark()
	{
		System.out.println("Dog is barking");
	}
}

public class Multiple_Inheritance {

	public static void main(String[] args) {
		Dog2 dog = new Dog2();
		dog.eat();
		dog.sleep();
		dog.bark();

	}

}
