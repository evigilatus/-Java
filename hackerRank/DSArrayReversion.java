package hackerRank;

import java.util.Scanner;

public class DSArrayReversion {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		in.close();
		int arr2[] = new int[n];

		for (int start = 0, end = n - 1; end >= 0; start++, end--) {
			arr2[start] = arr[end];
		}
		for (int i = 0; i < n; i++) {
			System.out.print(arr2[i] + " ");
		}

	}
}
