package org.tnsif.capgemini.c2tc.oops;

class Vehicles
{
	void move()
	{
		System.out.println("The vehicle moves");
	}
}
class Car extends Vehicles
{
	void move()
	{
		System.out.println("The car drives");
	}
}
class Bicycle extends Vehicles
{
	void move()
	{
		System.out.println("The bicycle pedals");
	}
}
class Aeroplane extends Vehicles
{
	void move()
	{
		System.out.println("The aeroplane flies");
	}
}
public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicles obj = new Vehicles();
		obj = new Car();
		obj.move();
		obj = new Bicycle();
		obj.move();
		obj = new Aeroplane();
		obj.move();

	}

}
