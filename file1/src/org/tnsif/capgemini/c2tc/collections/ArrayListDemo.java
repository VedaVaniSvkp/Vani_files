package org.tnsif.capgemini.c2tc.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		List<String> fruits = new ArrayList<>();
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Cherry");
		fruits.add("Banana");
		
		System.out.println("All fruits: "+fruits);
		
		//access the element
		System.out.println("Third fruit: "+fruits.get(2));
		
		//modify the element
		fruits.set(3,  "grapes");
		
		System.out.println("After modification: "+fruits);
		
		//checks if element exits
		
		if(fruits.contains("Apple"))
		{
			System.out.println("Apple is in the list");
		}
		else
		{
			System.out.println("Apple is not in the list");
		}
		
		//prints all the elements using for-each loop
		for(String fruit : fruits)
		{
			System.out.println(fruit);
		}
		
		//clear all the element
		fruits.clear();
		System.out.println("List cleared number of fruits "+fruits.size());

	}

}
