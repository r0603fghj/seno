package course09;

// 入力された月の季節を表示

import java.util.Scanner;

class CountDownDo {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("カウントダウンします。");

		//説明の都合上、以下3行を教科書と変えています。
		int x;
		x = stdIn.nextInt();

		do{
			System.out.println(x);	// xの値を表示
			x--;					// xの値をデクリメント（値を１減らす）
		}while (x >= 0);
	}
}
