package org.tnsif.capgemini.c2tc.collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		List<String> cars = new LinkedList<>();
		cars.add("BMW");
		cars.add("Tesla");
		cars.add("Toyoto");
	    cars.add("Tata");
	    cars.add("Tesla");
	    
	    //access element
	    System.out.println("Car: "+cars.get(2));
	    
	    //modify an element
	    cars.set(3, "Audi");
	    
	    //remove an element
	    cars.remove("BMW");
	    
	    //check if an element exits
	    if(cars.contains("Toyoto"));
	    {
	    	System.out.println("Toyoto is present");
	    }
	    
	    //prints all the elements
	    for(String car:cars)
	    {
	    	System.out.println(car);
	    }
	    
	    //get the size of the linked list
	    System.out.println("No of cars= "+cars.size());
	    
	    //clear the list
	    cars.clear();
	    System.out.println("The remaining elements in list are "+cars.size());
		 

	}

}
