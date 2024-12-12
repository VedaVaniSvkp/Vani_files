package org.tnsif.capgemini.c2tc.lambdaexpressiondemo;

import java.util.*;

public class LambdaExpressionExample6 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("Ankit");
		list.add("Mayank");
		list.add("Irfan");
		list.add("Jai");
		
		list.forEach(
				(n)->System.out.println(n)
				);
		

	}

}
