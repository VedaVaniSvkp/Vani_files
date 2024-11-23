package org.tnsif.capgemini.c2tc.Static;

public class StaticVariable {
	String name;
	double price;
	public static String category = "Smart Phone";
	
	public StaticVariable(String name, double price)
	{
		this.name = name;
		this.price = price;
	}
	public void displayDetails()
	{
		System.out.println("Name "+name);
		System.out.println("Price "+price);
		System.out.println("Category "+category);
		System.out.println();
	}

	public static void main(String[] args) {
		StaticVariable mobile1 = new StaticVariable("Redmi", 15000);
		StaticVariable mobile2 = new StaticVariable("Oppo", 16000);
		
		System.out.println("Mobile 1 Information");
		mobile1.displayDetails();
		System.out.println("Mobile 2 Information");
		mobile2.displayDetails();
	}

}
