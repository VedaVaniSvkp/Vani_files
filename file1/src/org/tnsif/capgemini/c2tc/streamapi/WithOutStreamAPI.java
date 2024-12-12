package org.tnsif.capgemini.c2tc.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WithOutStreamAPI {

	public static void main(String[] args) {
		
		//original list of numbers
		List<Integer>  numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		//List to hold the result
		List<Integer> result = new ArrayList<>();
		
		for(Integer number : numbers)
		{
			//checks if the number is even(1,2,3,4,5,6);
			if(number%2 == 0)
			{
				int doubled = number*2; //4, 8, 12
				result.add(doubled);
			}
		}
		System.out.println("Doubled even number "+result);
	}

}