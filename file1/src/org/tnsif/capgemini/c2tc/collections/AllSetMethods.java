package org.tnsif.capgemini.c2tc.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class AllSetMethods {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		
		//add elements to the set
		 
		set.add("Apple");
		set.add("Banana");
		set.add("Cherry");
		set.add("Straw berry");
		set.add("Mango");
		
		//display the set
		
		System.out.println("Initial set: "+set);
		
		//removing the element
		set.remove("Banana");
		System.out.println("Set after removing banana: "+set);
		
		//checking if element present 
		
		boolean containscherry = set.contains("Cherry");
		System.out.println("Set contains cherry "+containscherry);
		
		//get the size of the set 
		int size = set.size();
		System.out.println("Size of set "+size);
		
		//check if the set is empty
		boolean isEmpty = set.isEmpty();
		System.out.println("Set is empty? "+isEmpty);
		
		//iterating over the element of the set
		System.out.println("Iterating over the element");
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
		//clearing the set
		set.clear();
		System.out.println("After clear operation "+set);
		
	}

}