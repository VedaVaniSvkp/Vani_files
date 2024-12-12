package org.tnsif.capgemini.c2tc.collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedSetDemo {

	public static void main(String[] args) {
		Set<String> set = new LinkedHashSet<>();
		set.add("Apple");
		set.add("Banana");
		set.add("Cherry");
		set.add(null);
		System.out.println("LinkedhashSet: "+set);

	}

}