package hackerRank;

import java.math.BigInteger;
import java.util.Scanner;

public class PrimaltyTest {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		BigInteger n = in.nextBigInteger();
		in.close();

		Boolean res = n.isProbablePrime(1);
		if (res == false)
			System.out.println("Not prime");
		else
			System.out.println("Prime");
	}
}
