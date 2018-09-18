/*Two strings,  and , are called anagrams if they contain all the same characters in the same frequencies.
 * If  and  are case-insensitive anagrams, print "Anagrams"; 
 * otherwise, print "Not Anagrams" instead. */

package hackerRank;

import java.util.Arrays;
import java.util.Scanner;

public class StringAnagrams {

	static boolean isAnagram(String a, String b) {
		a = a.toLowerCase();
		b = b.toLowerCase();

		boolean isAnagram = true;

		if (a.length() != b.length()) {
			isAnagram = false;
			return isAnagram;
		} else {
			char[] stringA = a.toCharArray();
			Arrays.sort(stringA);
			char[] stringB = b.toCharArray();
			Arrays.sort(stringB);

			for (int i = 0; i < stringA.length; i++) {
				if (stringA[i] != stringB[i]) {
					isAnagram = false;
					break;
				}
			}
			return isAnagram;
		}

	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		scan.close();
		boolean ret = isAnagram(a, b);
		System.out.println((ret) ? "Anagrams" : "Not Anagrams");
	}
}
