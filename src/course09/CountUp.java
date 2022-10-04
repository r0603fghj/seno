package course09;

import java.util.Scanner;

class CountUp {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("カウントアップします。");

		int n = stdIn.nextInt();

		int x = 0;
		while (x <= n) { //条件には、「xがn以下の場合」という条件が入る
			System.out.println(x); // ここにxの値を表示する処理
			x++; // ここにxの値を1増やす処理
		}
	}
}
