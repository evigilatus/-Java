/* Given a 6x6  2D Array, 
 * we define an hourglass in A  to be a subset of values with indices 
 * falling in this pattern in A's graphical representation:
 * a b c
  	 d
 * e f g
 * There are 16 hourglasses in , and an hourglass sum is the sum of an hourglass' values.
 * Calculate the hourglass sum for every hourglass in A, 
 * then print the maximum hourglass sum.*/

package hackerRank;

import java.util.*;

public class DSArray2D {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int arr[][] = new int[6][6];
		for (int arr_i = 0; arr_i < 6; arr_i++) {
			for (int arr_j = 0; arr_j < 6; arr_j++) {
				arr[arr_i][arr_j] = in.nextInt();
			}
		}
		in.close();

		int sum = Integer.MIN_VALUE;
		int temp = Integer.MIN_VALUE;

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				temp = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1] + arr[i + 2][j] + arr[i + 2][j + 1]
						+ arr[i + 2][j + 2];

				if (temp >= sum) {
					sum = temp;

				}
			}
		}
		System.out.println(sum);

	}
}
