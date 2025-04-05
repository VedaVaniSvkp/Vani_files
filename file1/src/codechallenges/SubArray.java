package codechallenges;

import java.util.HashMap;
import java.util.Map;

public class SubArray {

	public static int maxSumSubarray (int[] A, int k) {
		int n = A.length;
		int maxSum=0;
		int windowStart = 0;
		int currentSum = 0;
		Map<Integer, Integer> freqMap = new HashMap<>();
		int maxStart = 0; 
		int maxEnd =0;
		
		for(int windowEnd=0; windowEnd<n; windowEnd++) {
			int rightNum = A[windowEnd];
			freqMap.put(rightNum, freqMap.getOrDefault(rightNum, 0)+1);
			currentSum += rightNum;
			
			while(freqMap.size()>k) {
				int leftNum = A[windowStart];
				freqMap.put(leftNum, freqMap.get(leftNum)-1);
				if(freqMap.get(leftNum)==0) {
					freqMap.remove(leftNum);
				}
				currentSum -= leftNum;
				windowStart++;
			}
			if(currentSum > maxSum) {
				maxSum = currentSum;
				maxStart = windowStart;
				maxEnd = windowEnd;
			}
		}
		System.out.println("Subarray: ");
		for(int i = maxStart; i<=maxEnd; i++) {
			System.out.println(A[i]+" ");
		}
		System.out.println();
		
		return maxSum;
	}
			public static void main(String[] args) {
				int[] A = {2, 1, 2, 2, 3, 2, 2, 3, 5, 1, 2};
				int k = 2;
				int result = maxSumSubarray(A, k);
				System.out.println("Final result: "+result);
			}
}
