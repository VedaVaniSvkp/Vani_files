package org.tnsif.capgemini.c2tc.interfacedemo;

interface Vehicle1
{
	void start();
	void stop();
	
	int max_speed = 120;
	
	default void repair()
	{
		System.out.println("Vehicle is being repaired");
	}
	static void CheckMaintainance()
	{
		System.out.println("Vehicle maintainance check completed");
	}
}

class Car5 implements Vehicle1
{
	private String model;
	
	Car5(String model)
	{
		this.model = model;
	}

	@Override
	public void start() {
		System.out.println("Car "+model+" is starting");
		
	}

	@Override
	public void stop() {
		System.out.println("Car "+model+" is stopped");
	}
	static void Demo()
	{
		System.out.println("Welcome");
	}
	
}

public class Default_Static {

	public static void main(String[] args) {
		Vehicle1 obj = new Car5("BMW");
		obj.start();
		obj.stop();
		
		System.out.println("The Speed of the vehicle "+Vehicle1.max_speed);
		
		obj.repair();
		
		Vehicle1.CheckMaintainance();
		
		Car5.Demo();
	}

}


