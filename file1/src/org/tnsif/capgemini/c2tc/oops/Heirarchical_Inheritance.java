package org.tnsif.capgemini.c2tc.oops;

class Animal2
{
	void eat()
	{
		System.out.println("Animal is eating: Welcome");
	}
}
class Dog3 extends Animal2
{
	void bark()
	{
		System.out.println("Dog is Barking");
	}
}
class Cat3 extends Animal2
{
	void meow()
	{
		System.out.println("Cat is Meowing");
	}
}
class Elephant3 extends Animal2
{
	void trumpet()
	{
		System.out.println("Elephant is Trumpeting");
	}
}

public class Heirarchical_Inheritance {

	public static void main(String[] args) {
		Dog3 dog1 = new Dog3();
		Cat3 cat = new Cat3();
		Elephant3 ele = new Elephant3();
		dog1.eat();
		cat.eat();
		ele.eat();
		
		dog1.bark();
		cat.meow();
		ele.trumpet();
	}

}
