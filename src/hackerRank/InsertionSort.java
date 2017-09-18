package hackerRank;

import java.util.Scanner;

public class InsertionSort {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();

	}

	public static void insert(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int k = arr[i];
			int j = i - 1;
			while ((j > -1) && (arr[j] > k)) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[i + 1] = k;
		}
	}

}
