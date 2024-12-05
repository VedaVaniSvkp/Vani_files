package org.tnsif.capgemini.c2tc.ArrayDemo;

public class ArrayDemo1 {

	public static void main(String[] args) {
		int nums[] = {5, 6, 7, 8};
		System.out.println("The fourth element in the array of static initialization: ");
		System.out.println(nums[3]);
		nums[2] = 9;
		
		int nums1[] = new int[4];
		nums1[0] = 2;
		nums1[1] = 4;
		nums1[2] = 3;
		nums1[3] = 6;
		
		System.out.println("The element in the array of dynamic initialization: ");
		System.out.println(nums1[0]);
		System.out.println(nums1[1]);
		System.out.println(nums1[2]);
		System.out.println(nums1[3]);
		
	    System.out.println("Printing element using for loop: ");
	    for(int i=0;i<=3;i++)
	    {
	    	System.out.println(nums1[i]);
	    }

	}

}
