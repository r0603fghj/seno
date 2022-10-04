package course14;

import java.util.Scanner;

// 文字と文字リテラル

class Reidai07 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("整数a：");
		int a = stdIn.nextInt();

		boolean mainasu = (a < 0);
		if (mainasu) {
			System.out.println("aはマイナスです。");
		} else {
			System.out.println("aはプラスかゼロです。");
		}
	}
}
