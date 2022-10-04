package course11;

import java.util.Scanner;

class Reidai1 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("何個*を表示しますか：");
		int n = stdIn.nextInt();

		for (int i = 0; i < n - 1; i++) {
			System.out.println('*');
		}
		System.out.println();
	}
}
