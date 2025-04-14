package org.tnsif.capgemini.c2tc.practicalquestions;

public class Person {
	int age=20;
	public int vote() {
		if(age>=18) {
			System.out.println("vote");
			return 0;
		}
		else {
			System.out.println("Not vote");
			return -1;
		}
	}

	public static void main(String[] args) {
		Person per = new Person();
		per.vote();

	}

}
