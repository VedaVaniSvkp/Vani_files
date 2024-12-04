package org.tnsif.capgemini.c2tc.collections;
import java.util.List;
import java.util.Vector;

public class VectorDemo1 {

	public static void main(String[] args) {
        List<Integer> numbers = new Vector<>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		
		//access an element
		System.out.println("First element in vector "+numbers.get(0));
		
		//modify the element 
		numbers.set(3, 50);
		System.out.println("Vector after modifying "+numbers);
		
		//remove an element
		numbers.remove(3);
		System.out.println("Vector after removing "+numbers);
		
		
		//check if exits
		if(numbers.contains(10))
		{
			System.out.println("10 is present");
		}
		
		//print all elements
		for(Integer num: numbers)
		{
			System.out.println(num);
		}
		//size
		System.out.println("Size of vector data "+numbers.size());
		
		numbers.clear();
		System.out.println("List after clear operation "+numbers);

	}

}
