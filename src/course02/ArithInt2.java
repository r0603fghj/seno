package course02;

// 二つの整数値を読み込んで加減乗除した値を表示

import java.util.Scanner;

class ArithInt2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("xとyを加減乗除します。");

		System.out.print("xの値："); // xの値の入力を促す
		int x = stdIn.nextInt(); // xに整数値を読み込む

		System.out.println("x * x = " + (x * x)); // x + yの値を表示

	}
}
