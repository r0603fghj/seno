package course16;

import java.util.Scanner;

class reidai3 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("要素数：");
		int n = stdIn.nextInt();
		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = i + 10;
			System.out.println("a[" + i + "] = " + a[i]);
		}
	}
}
