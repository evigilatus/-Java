/*Given integers b and a, find the smallest integer h, 
 * such that there exists a triangle of height h, base b, having an area of at least a. */

package hackerRank;

import java.util.Scanner;

public class MinimumHeightTriangle {
	static int lowestTriangle(int base, int area) {
		double minHeight = (double) area * 2 / (double) base;
		int result;

		if (minHeight > Math.round(minHeight))
			result = (int) Math.round(minHeight) + 1;
		else
			result = (int) Math.round(minHeight);

		return result;

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int base = in.nextInt();
		int area = in.nextInt();
		int height = lowestTriangle(base, area);
		System.out.println(height);
	}
}
