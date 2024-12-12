package org.tnsif.capgemini.c2tc.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AllIntermediateOps {

	public static void main(String[] args) {
		// Initialize list of numbers
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		//1.map : multiply each number by 2
		List<Integer> doubled = numbers.stream().map(n->n*2).collect(Collectors.toList());
		System.out.println("Doubled: "+doubled);
		
		//2. Filter : Keep only even number
		List<Integer> evens = numbers.stream().filter(n->n%2==0).collect(Collectors.toList());
		System.out.println("Even numbers in the list are "+evens);
		
		//3. distinct : remove the duplicates
		List<Integer> uniquenumbers = numbers.stream().distinct().collect(Collectors.toList());
		System.out.println("After distinct "+uniquenumbers);
		
		//4. limit(5) : Takes only first 5 numbers
		List<Integer> limitednumbers = numbers.stream().limit(5).collect(Collectors.toList());
		System.out.println("Limited numbers "+limitednumbers);
		
		//5. sorted : sorting the elements(ascending format)
		List<Integer> sorted = numbers.stream().sorted().collect(Collectors.toList());
		System.out.println("Sorted data "+sorted);
		
		//Skip: Skipping the elements
		List<Integer> skipped = numbers.stream().skip(2).collect(Collectors.toList());
		System.out.println("Remaining elements after skipping "+skipped);

	}

}