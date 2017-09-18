/*...
Verify this claim by writing a program Ramanujan.java that:
 - takes an integer command-line argument n
 - prints all integers less than or equal to n that can be expressed as the sum of two cubes in two different ways 
 - find distinct positive integers a, b, c, and d such that a3 + b3 = c3 + d3. 
*/

package princetonExamples;

import java.util.Scanner;

public class Ramanujan {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		for (int a = 1; a < (int) Math.cbrt((double) n); a++) {

			for (int b = 1; b < (int) Math.cbrt((double) n); b++) {

				for (int c = 1; c < (int) Math.cbrt((double) n); c++) {

					for (int d = 1; d < (int) Math.cbrt((double) n); d++) {
						if ((a * a * a + b * b * b == c * c * c + d * d * d) && (a * a * a + b * b * b <= n)
								&& (a != c && b != d && a != d && b != d)) {
							System.out.println(a * a * a + b * b * b);
						}
					}
				}
			}
		}
	}
}
