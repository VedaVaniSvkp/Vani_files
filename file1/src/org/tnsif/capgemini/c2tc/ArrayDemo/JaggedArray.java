package org.tnsif.capgemini.c2tc.ArrayDemo;

public class JaggedArray {

	public static void main(String[] args) {
		
		//step1 : declare the jagged array
		 int[][] studentIntGrade = new int[3][];
		 
		 //step2 : assign values to the elements
		 studentIntGrade[0] = new int[2]; //grade 1 has 2 students
		 studentIntGrade[1] = new int[3]; //grade 2 has 3 students
		 studentIntGrade[2] = new int[1]; //grade 3 has 1 students
		 
		 //step3 : assign values to the element
		 studentIntGrade[0][0] = 10; //grade 1 student 1
		 studentIntGrade[0][1] = 20; //grade 1 student 2
		 
		 studentIntGrade[1][0] = 30; //grade 2 student 1
		 studentIntGrade[1][1] = 40; //grade 2 student 2
		 studentIntGrade[1][2] = 50; //grade 2 student 3
		 
		 studentIntGrade[2][0] = 60; //grade 3 student 1
		 
		 for(int i=0;i<studentIntGrade.length;i++) //iterate through each grade 3
		 {
			 for(int j=0;j<studentIntGrade[i].length;j++)
			 {
				 System.out.print("Grade "+(i+1)+" student "+(j+1)+" : "+studentIntGrade[i][j]+" ");
			 }
			 System.out.println();
		 }

	}

}
