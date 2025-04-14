package org.tnsif.capgemini.c2tc.practicalquestions;

import java.util.Scanner;

public class Temperature {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the temperature: ");
		double celsius = scan.nextDouble();
		int d = (int)celsius;
		System.out.println("Temperature in double: "+celsius);
		System.out.println("Temperature in int: "+d);
		scan.close();
	}

}
