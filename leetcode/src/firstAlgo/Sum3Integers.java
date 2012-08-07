/*
 *Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.
 *
 *Note:
 *Elements in a triplet (a,b,c) must be in non-descending order. (ie, a ¡Ü b ¡Ü c)
 *The solution set must not contain duplicate triplets.
 *
 *For example, given array S = {-1 0 1 2 -1 -4},
 *
 *A solution set is:
 *(-1, -1, 2)
 *(-1, 0, 1)
 */


package firstAlgo;

import java.util.ArrayList;

public class Sum3Integers {
	public ArrayList<ArrayList<Integer>> threeSum(int[] S) {
		// Assuming the array has already been sorted in a non-descending order
		int n = S.length; 
		ArrayList Triplets = new ArrayList();
		int[] triplet = new int[3];
		
		for (int i = 0; i < n; i++) {
			int j = i + 1;
			int k = n - 1;
			
			while (j < k) {
				if (S[i] + S[j] + S[k] < 0) j++;
				else if (S[i] + S[j] + S[k] < 0) k--;
				else {
					triplet[0] = S[i];
					triplet[1] = S[j];
					triplet[2] = S[k];
					Triplets.add(triplet);
					j++;
					k--;
				}
			}
		}
		
		return Triplets;
	}
}
