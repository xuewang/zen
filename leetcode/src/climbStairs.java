/*
 * You are climbing a stair case. It takes n steps to reach to the top.
 * Each time you can either climb 1 or 2 steps. 
 * In how many distinct ways can you climb to the top?
 * 
 * Solution:
 * 1. Take an array as the stair case, each element(step) holds the distinct ways to reach that element(step).
 * 2. For element(step) n, the number of ways to reach it should be the sum of ways to reach 1 step backward and 2 steps backward.
 * 3. In this special case, its result is a Fibonacci Sequence.
 */

public class climbStairs {
	static int solution(int stairs, int[] steps) {
		int stepways = steps.length;
		
		int L[] = new int[stairs+1];
		L[0] = 1;
				
		for (int i = 1; i <= stairs; i++) {
			for (int j = 0; j < stepways; j++) {
				if (steps[j] <= i)
					L[i] += L[i - steps[j]];
			}
		}
		
		return L[stairs];
	}
}

class run {
	public static void main(String args[]) {
		int S = 12;
		int[] s = {1, 2};
		
		System.out.println("The number of distinct ways to reach the " + S + "th step of the stair is " + climbStairs.solution(S, s));
	}
}
