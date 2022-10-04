package course08;

import java.util.Scanner;

class 演習１ {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("整数値：");
		int n = stdIn.nextInt();

		if (n >= 80) { // ゼロ
			System.out.println("A判定");
		} else if (n >= 60 && n < 80) { // １桁
			System.out.println("B判定");
		} else if (n >= 50 && n < 60) { // ２桁以上
			System.out.println("C判定");
		} else if (n >= 0 && n < 50) { // ２桁以上
			System.out.println("D判定");
		}
	}
}