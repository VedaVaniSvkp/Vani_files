package org.tnsif.capgemini.c2tc.generics;

public class GenercMethod {
	
	public static <T> void display(T[] array)
	{
		for(T element : array)
		{
			System.out.println(element+" ");
		}
		
	}

	public static void main(String[] args) {
		
		Integer[] intarray = {1, 2, 3, 4, 5};
		System.out.println("Integer array: ");
		display(intarray);
		
		String[] strArray = {"Apple", "Banana", "Cherry"};
		System.out.println("String array:    ");
		display(strArray);
		
		Double[] dbArray = {1.22, 2.33};
		System.out.println("Double array: ");
		display(dbArray);
	}

}