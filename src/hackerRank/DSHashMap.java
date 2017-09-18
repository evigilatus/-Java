/*Given  names and phone numbers, 
 * assemble a phone book that maps friends' names to their respective phone numbers. 
 * You will then be given an unknown number of names to query your phone book for. 
 * For each  queried, print the associated entry from your phone book on a new line in the form name=phoneNumber; 
 * if an entry for  is not found, print Not found instead. */

package hackerRank;

import java.util.*;

class DSHashMap {
	public static void main(String[] argh) {
		Scanner in = new Scanner(System.in);
		Map<String, Integer> phoneBook = new HashMap<String, Integer>();
		int n = in.nextInt();
		for (int i = 0; i < n; i++) {
			String name = in.next();
			int phone = in.nextInt();
			phoneBook.put(name, phone);

		}
		while (in.hasNext()) {
			String s = in.next();

			if (phoneBook.get(s) == null) {
				System.out.println("Not found");
			} else
				System.out.println(s + "=" + phoneBook.get(s));
		}
		in.close();
	}
}