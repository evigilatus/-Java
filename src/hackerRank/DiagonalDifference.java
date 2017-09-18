/*Given a square matrix of size , 
 * calculate the absolute difference between the sums of its diagonals. */

package hackerRank;

import java.util.Scanner;

public class DiagonalDifference {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a[][] = new int[n][n];
		for (int a_i = 0; a_i < n; a_i++) {
			for (int a_j = 0; a_j < n; a_j++) {
				a[a_i][a_j] = in.nextInt();
			}
		}

		in.close();

		int sum1 = 0;
		int sum2 = 0;

		for (int i = 0; i < n; i++) {
			sum1 += a[i][i];
		}

		int column = n;
		for (int line = 0; line < n; line++) {
			column--;
			sum2 += a[line][column];

		}

		int diff = Math.abs(sum1 - sum2);
		System.out.println(diff);
	}
}
