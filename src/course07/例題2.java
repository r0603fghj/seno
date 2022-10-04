package course07;

// 読み込んだ整数値の桁数（ゼロ／１桁／２桁以上）を判定

import java.util.Scanner;

class 例題2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("xの値：");
		int x = stdIn.nextInt();

		System.out.print("yの値：");
		int y = stdIn.nextInt();

		if (x >= 0 || y >= 0) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
