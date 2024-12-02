package org.tnsif.capgemini.c2tc.interfacedemo;

public class InterfaceDemo {

	public static void main(String[] args) {
		// you can't initialize the interface itself
		
		Vehicle car = new Car("Toyota corolla");
		Vehicle bike = new Bike("Mountain Bike");
		
		car.start();
		car.stop();
		
		bike.start();
		bike.stop();
		
		System.out.println("Maximum speed for vehicle "+Vehicle.max_speed);
		

	}

}
