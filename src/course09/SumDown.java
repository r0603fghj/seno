package course09;

import java.util.Scanner;

class SumDown {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("1からnまでの総和を求めます。");

		//説明の都合上、以下3行を教科書から変更しています。
		int n;
		System.out.print("nの値：");
		n = stdIn.nextInt();

		int sum = 0; // 合計
		int i = 1;

		while (i <= n) {
			sum += i; // sumにiを加える
			i++; // iをインクリメント
		}
		System.out.println("1から" + n + "までの総和は" + sum + "です。");
	}
}
