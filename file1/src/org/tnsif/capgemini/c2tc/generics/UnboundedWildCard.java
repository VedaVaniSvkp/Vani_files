package org.tnsif.capgemini.c2tc.generics;

import java.util.List;

public class UnboundedWildCard {
	
	public static void printList(List<?> list) 
	{
		for(Object element:list)
		{
			System.out.println(element+" ");
		}
		
	}

	public static void main(String[] args) {
		// list of integer
		List<Integer> inList = List.of(1, 2, 3, 4, 5);
		System.out.println("Integer List: ");
		printList(inList);
		
		//list of string
		List<String> strList = List.of("Apple", "Orange", "Mango");
		System.out.println("String List: ");
		printList(strList);
	}

}
