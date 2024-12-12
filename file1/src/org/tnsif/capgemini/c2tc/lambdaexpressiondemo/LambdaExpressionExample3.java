package org.tnsif.capgemini.c2tc.lambdaexpressiondemo;

interface Sayable1
{
	public String Say(String name); 
}

public class LambdaExpressionExample3 {

	public static void main(String[] args) {
		// lambda expression with single parameter
		Sayable1 s1 = (name)->{
			return "Hello, "+name;
		};
		System.out.println(s1.Say("Keerthi"));
		//you can omit function parenthesis
		Sayable1 s2 = name ->{
			return "Hello, "+name;
		};
		System.out.println(s2.Say("Vani"));

	}

}