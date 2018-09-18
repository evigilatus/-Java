/*Given a string, , matching the regular expression [A-Za-z !,?._'@]+, split the string into tokens. 
 * We define a token to be one or more consecutive English alphabetic letters. 
 * Then, print the number of tokens, followed by each token on a new line. */

package hackerRank;

import java.util.Scanner;

public class StringTokens {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		String[] sTokens = s.split("[ !,?._'@​+]");
		int counter = 0;
		for (String token : sTokens) {
			if (!token.equals("")) {
				counter++;
			}
		}

		System.out.println(counter);
		for (String token : sTokens) {
			if (!token.equals("")) {
				System.out.println(token);
			}
		}

		scan.close();
	}
}
