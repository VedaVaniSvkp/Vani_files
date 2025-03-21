package codechallenges;

import java.util.Scanner;

public class ArrayIndex {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n, tar, flag=0;
		System.out.println("Enter number of elements in array: ");
		n = scan.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elements in the array: ");
		for(int i=0;i<n;i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println("Enter target value: ");
		tar = scan.nextInt();
		for(int j=0; j<n-1; j++) {
			if(arr[j]+arr[j+1] == tar) {
				System.out.println("["+j+", "+(j+1)+"]");
				flag = 1;
				break;
			}
			else {
				continue;
			}
		}
		if(flag == 0) {
			System.out.println("There is no two number in this array so that their sum is equal to target value");
		}
		scan.close();

	}

}
