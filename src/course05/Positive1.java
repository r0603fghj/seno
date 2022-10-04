package course05;

// 読み込んだ整数値は正の値か？

import java.util.Scanner;

class Positive1 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("ｘ：");
		int ｘ = stdIn.nextInt();
		System.out.print("ｙ：");
		int y = stdIn.nextInt();

		if (ｘ > y) {
			System.out.println("ｘがｙより大きいです。");
		}
	}
}
