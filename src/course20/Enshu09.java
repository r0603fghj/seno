package course20;

// 左下側が直角の直角二等辺三角形を表示

import java.util.Scanner;

class Enshu09 {

	//--- 文字'*'をn個連続表示 ---//
	static void putStars(int n) {
		while (n > 0) {
			System.out.print('*');
			n--;
		}
	}
	static void putSquares(int n) {
		while (n > 0) {
			System.out.print('■');
			n--;
		}
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("左下直角の二等辺三角形を表示します。");
		System.out.print("段数は：");
		int n = stdIn.nextInt();
		System.out.println("== *で三角形を表示 ==");
		for (int i = 1; i <= n; i++) {
			putStars(i);
			System.out.println();
		}
		System.out.println("");
		System.out.println("== ■で三角形を表示 ==");
		for (int i = 1; i <= n; i++) {
			putSquares(i);
			System.out.println();
		}
	}
}
