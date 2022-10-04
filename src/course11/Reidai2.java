package course11;

import java.util.Scanner;

class Reidai2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("何個*を表示しますか：");
		String s = stdIn.nextLine();

		System.out.print("何個*を表示しますか：");
		int n = stdIn.nextInt();

		for (int i = 0; i < n; i++) {

			System.out.println(s);
		}
	}
}
