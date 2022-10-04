package course05;

// 読み込んだ整数値の符号（正／負／０）を判定して表示

import java.util.Scanner;

class reidai5 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("X：");
		int x = stdIn.nextInt();
		System.out.print("Y：");
		int y = stdIn.nextInt();

		if (x > y) {
			System.out.println("x > y");
		} else if (x == y) {
			System.out.println("x == y");
		} else {
			System.out.println("x < y");
		}
	}
}
