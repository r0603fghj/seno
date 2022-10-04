package course20;

import java.util.Scanner;

public class reidai05 {

	//--- 文字'*'をn個連続表示 ---//
	static String s(int s) {
		while (s > 0) { //説明の都合上、ソースを一部修正しています。
			System.out.print('*');
			s--;
		}
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("左下直角の二等辺三角形を表示します。");
		System.out.print("段数は：");
		int n = stdIn.nextInt();

		for (int i = 1; i <= n; i++) {
			putStars(i);
			System.out.println();
		}
	}
}
