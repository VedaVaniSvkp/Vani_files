package org.tnsif.capgemini.c2tc.Scannerclass_BufferReader;
import java.util.Scanner;

public class ScannerClassDemo {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter your name");
		String name=scan.nextLine();
		System.out.println("enter your age");
		int age=scan.nextInt();
	
		System.out.println("name :"+ name +"  " +", age : "+ age);
		scan.close();

	}

}
