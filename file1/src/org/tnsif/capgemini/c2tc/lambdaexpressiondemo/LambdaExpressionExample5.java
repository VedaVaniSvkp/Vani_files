package org.tnsif.capgemini.c2tc.lambdaexpressiondemo;

interface Addable1{
	int add(int a, int b);
}

public class LambdaExpressionExample5 {

	public static void main(String[] args) {
		//Lambda expression without return keyword
		Addable1 ad1 = (a, b)->(a+b);
		System.out.println(ad1.add(10, 20));
		//Lambda expression with the return keyword
		Addable ad2 = (int a, int b)->{
			return(a+b);
		};
		System.out.println(ad2.add(100, 200));
	}

}