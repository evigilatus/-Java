/* Alice and Bob each created one problem for HackerRank. A reviewer rates the two challenges, 
 * awarding points on a scale from  to  for three categories: problem clarity, originality, and difficulty.
 * 
 * We define the rating for Alice's challenge to be the triplet (a0, a1, a2) , 
 * and the rating for Bob's challenge to be the triplet  (b0, b1, b2).
 * 
 * Your task is to find their comparison points by comparing  a0 with b2 , a1 with b2 , and a2 with b2 .
			
			If aI > bI, then Alice is awarded 1 point.
			If aI < bI, then Bob is awarded 1 point.
			If aI = bI, then neither person receives a point.
 * Comparison points is the total points a person earned. */

package hackerRank;

import java.util.Scanner;

public class CompareTriplets {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] a = new int[3];
		for (int i = 0; i < 3; i++)
			a[i] = in.nextInt();
		int[] b = new int[3];
		for (int i = 0; i < 3; i++)
			b[i] = in.nextInt();
		
		in.close();

		int pointsA = 0;
		int pointsB = 0;

		for (int i = 0; i < 3; i++) {
			if (a[i] > b[i]) {
				pointsA++;
			} else if (a[i] < b[i]) {
				pointsB++;
			} else
				continue;
		}
		System.out.println(pointsA + " " + pointsB);
	}
}
