package course05;

// 読み込んだ整数値が正であれば偶数／奇数を判定して表示

import java.util.Scanner;

class reidai6 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("X：");
		int x = stdIn.nextInt();
		System.out.print("Y：");
		int y = stdIn.nextInt();

		if (x * y > 0) {
			if (x > 0) {
				System.out.println("xもyも正です。");
			} else {
				System.out.println("xもyも負です。");
			}
		} else {
			System.out.println("xかyのどちらかが０以下です。");
		}
	}
}
