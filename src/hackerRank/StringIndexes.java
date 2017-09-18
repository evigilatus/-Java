/*Given a string, S , of length N that is indexed from 0  to N-1, 

 * print its even-indexed and odd-indexed characters as  
 
 * space-separated strings on a single line .*/

package hackerRank;

import java.util.Scanner;

public class StringIndexes {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < n; i++) {
			String S = sc.nextLine();
			for (int j = 0; j < S.length(); j++) {
				System.out.print(S.charAt(j++));
			}
			sc.close();

			System.out.print(" ");
			for (int k = 1; k < S.length(); k += 2) {
				System.out.print(S.charAt(k));
			}
			System.out.println(" ");
		}

	}
}
