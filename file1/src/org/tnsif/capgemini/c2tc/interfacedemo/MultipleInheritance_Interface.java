package org.tnsif.capgemini.c2tc.interfacedemo;

interface Printer
{
	void print(String message);
}
interface Scanner
{
	void scan(String document);
}
class MultiFunctionDevice implements Printer, Scanner
{

	@Override
	public void scan(String document) {
		System.out.println("Scanning "+document);
		
	}

	@Override
	public void print(String message) {
		System.out.println("Printing "+message);
		
	}
	
}

public class MultipleInheritance_Interface {

	public static void main(String[] args) {
		MultiFunctionDevice obj = new MultiFunctionDevice();
		obj.print("Hello world!");
		obj.scan("Vani.pdf");
		

	}

}
