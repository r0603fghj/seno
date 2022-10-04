package course09;

//正の整数値を０までカウントダウン（その１）

import java.util.Scanner;

class CountDown1 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("カウントダウンします。");

		//説明の都合上、以下2行を教科書と変えています。
		int x;
		x = stdIn.nextInt();

		while (x >= 0) {
			System.out.println(x);	// xの値を表示
			x--;					// xの値をデクリメント（値を１減らす）
		}
	}
}
