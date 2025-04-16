package codechallenges;

import java.util.*;
public class Quadruples {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the string: ");
		int n = sc.nextInt();
		System.out.println("Enter the string: ");
		String s = sc.next();
		
		long count = 0;
		for(int a=0; a<n-3; a++) {
			for(int b=a+1; b<n-2; b++) {
				for(int c=b+1; c<n-1; c++) {
					if(s.charAt(a) == s.charAt(c)) {
						for(int d=c+1; d<n; d++) {
							if(s.charAt(b) == s.charAt(d)) {
								count++;
							}
						}
					}
				}
			}
		}
		System.out.println("This String has "+count+" quadrules");
		sc.close();
	}

}
