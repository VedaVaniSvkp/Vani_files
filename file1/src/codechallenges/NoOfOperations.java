package codechallenges;

import java.util.Arrays;
import java.util.Scanner;

public class NoOfOperations {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of elements: ");
		int n = scanner.nextInt();
		int[] arr = new int[n];
		
		System.out.println("Enter elements: ");
		for(int i=0;i<n;i++) {
			arr[i]= scanner.nextInt();
		}
		
		Arrays.sort(arr);
		int median = arr[n/2];
		int operations = 0;
		
		for(int i=0;i<n;i++) {
			operations +=Math.abs(arr[i]-median);
		}
		
		if (operations == 0) {
			System.out.println("All numbers are already equal, no operations required");
		}else {
			System.out.println("Number of operations required= "+operations);
			scanner.close();
		}

	}

}
