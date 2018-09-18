/* Given a string, s , and two indices, start  and end, 
 * print a substring consisting of all characters in the inclusive range from start to end-1 .  */

package hackerRank;

import java.util.Scanner;

public class SubstingComparison {
	public static String getSmallestAndLargest(String s, int k) {
		String smallest = "";
		String largest = "";

		smallest = s.substring(0, k);
		largest = s.substring(0, k);

		for (int i = 0; i < s.length() - k + 1; i++) {
			String subs = s.substring(i, i + k);
			if (subs.compareTo(smallest) < 0) {
				smallest = subs;
			} else if (largest.compareTo(subs) < 0) {
				largest = subs;
			}
		}
		return smallest + "\n" + largest;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int k = scan.nextInt();
		scan.close();

		System.out.println(getSmallestAndLargest(s, k));
	}
}
