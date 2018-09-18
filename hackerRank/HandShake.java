/* At the annual meeting of Board of Directors of Acme Inc, 
 * every one starts shaking hands with everyone else in the room. 
 * Given the fact that any two persons shake hand exactly once, 
 * Can you tell the total count of handshakes?*/

package hackerRank;

import java.util.Scanner;

public class HandShake {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		int result = 1;
		for (int a0 = 0; a0 < T; a0++) {
			int n = in.nextInt();
			result = n * (n - 1) / 2;

			System.out.println(result);
		}
	}
}
