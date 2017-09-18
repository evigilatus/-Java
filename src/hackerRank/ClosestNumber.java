/* You are given 3 numbers a, b and x. 
 * You need to output the multiple of x which is closest to a^b. 
 * If more than one answer exists , display the smallest one.*/

package hackerRank;

import java.util.Scanner;

public class ClosestNumber {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.close();

		for (int i = 0; i < T; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int x = sc.nextInt();
			double aB = Math.pow((double) a, (double) b);
			int multiple = (int) Math.round(aB / (double) x);

			System.out.println(multiple * x);

		}
	}
}
