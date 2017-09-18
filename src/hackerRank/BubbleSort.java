package hackerRank;
import java.util.Scanner;

public class BubbleSort {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
	}

	public static void swap(int i, int j, int[] arr) {
		arr[i] = arr[i] + arr[j];
		arr[j] = arr[i] - arr[j];
		arr[i] = arr[i] - arr[j];
	}

	public static void sort(int[] arr) {
		int k;
		for (int m = arr.length; m >= 0; m--) {
			for (int i = 0; i < arr.length - 1; i++) {
				k = i + 1;
				if (arr[i] > arr[k]) {
					swap(i, k, arr);
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}
}
