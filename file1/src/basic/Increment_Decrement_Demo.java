package basic;

public class Increment_Decrement_Demo {

	public static void main(String[] args) {
		int a = 10, b, c, d, e;
		
		//post increment
		b= a++;
		System.out.println("b=a++ = "+b);//print first then increment
		System.out.println("after post-increment a = "+a);//11
		
		//pre increment 
		c = ++a;
		System.out.println("c=++a = "+ c);//increment first, then prints
		System.out.println("after pre-increment a = "+a);
		
		//post decrement
		d = a--;
		System.out.println("d=a-- = "+d);//prints first then decrement //12
		System.out.println("After post decrement a = "+a);//11
		
		//pre decrement
		e = --a;
		System.out.println("e=--a = "+ e);
		System.out.println("after pre decrement a = "+a);
	}

}
