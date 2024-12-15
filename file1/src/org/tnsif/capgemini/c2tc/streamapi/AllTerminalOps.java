package org.tnsif.capgemini.c2tc.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


public class AllTerminalOps {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(3, 6, 7, 5, 6, 7);
		
		//for each
		
		System.out.println("Numbers printed using foreach");
		numbers.stream().forEach(n->System.out.print(n+" "));
		System.out.println();
		
		//toArray
		
		Integer[] array = numbers.stream().toArray(Integer[]::new);
		System.out.println("Array "+Arrays.toString(array));
		
		//reduce
		int sum1 = numbers.stream().reduce(0, Integer::sum);
		System.out.println("Sum of numbers "+sum1);
		
		//collect 
		
		List<Integer> unique = numbers.stream().distinct().collect(Collectors.toList());
		System.out.println("Unique number "+unique);
		
		//min
		Optional<Integer> min1 = numbers.stream().min(Integer::compareTo);
		min1.ifPresent(value->System.out.println("Minimum number "+value));
		
		//min
		Optional<Integer> max1 = numbers.stream().max(Integer::compareTo);
		max1.ifPresent(value->System.out.println("Maximum number "+value));
		
		//count
		long count = numbers.stream().count();
		System.out.println("Count of numbers: "+count);
		
		//anymatch - check if any number is greater than 5
		boolean anyGreaterthan5 = numbers.stream().anyMatch(n->n>5);
		System.out.println("Any number greater than 5 ?"+anyGreaterthan5);
		
		//allmatch - check if all numbers are positive
		boolean allpositive = numbers.stream().allMatch(n->n>0);
		System.out.println("All numbers positive ? "+allpositive);
		
		//none match	
		boolean nonnegative = numbers.stream().noneMatch(n->n<0);
		System.out.println("No numbers are negative ? "+nonnegative);
		
		Optional<Integer> first = numbers.stream().findFirst();
		first.ifPresent(value->System.out.println("First number "+value));				

	}

}