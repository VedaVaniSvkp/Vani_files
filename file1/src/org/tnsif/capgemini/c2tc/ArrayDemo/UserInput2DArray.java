package org.tnsif.capgemini.c2tc.ArrayDemo;
import java.util.Scanner;

public class UserInput2DArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of rows ");
		int rows = scan.nextInt();
		System.out.println("Enter number of columns ");
		int cols = scan.nextInt();
		
		int multidimensionalarray[][] = new int[rows][cols];
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				multidimensionalarray[i][j] = (i+1)*(j+1);
			}
		}
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				System.out.print(multidimensionalarray[i][j] + " ");
			}
			System.out.println();
		}
		scan.close();

	}

}
