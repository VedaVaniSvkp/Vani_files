package org.tnsif.capgemini.c2tc.collections;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		Set<String> set = new TreeSet<>();
		set.add("Apple");
		set.add("Banana");
		set.add("Cherry");
		set.add("Pomogranate");
		set.add("Mango");
		
		System.out.println("Treeset: "+set);
		

	}

}