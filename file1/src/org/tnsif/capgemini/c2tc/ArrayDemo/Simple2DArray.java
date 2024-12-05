package org.tnsif.capgemini.c2tc.ArrayDemo;

public class Simple2DArray {

	public static void main(String[] args) {
		int arr[][] = {{1,2,3},{1,4,5},{6,7,8}};
		for (int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
					System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
