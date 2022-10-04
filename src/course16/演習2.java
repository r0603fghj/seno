package course16;

import java.util.Scanner;

public class 演習2 {
	public static void main(String[] args) {
		int[] a = { 3, 6, 9, 1, 4, 7, 2, 5, 8 };

		for (int i = 0; i < a.length; i++)
			System.out.println("a[" + i + "] = " + a[i]);

		Scanner stdIn = new Scanner(System.in);
		int sum = 0; // 合計
		final int NUMBER = 5; // 人数
		int[] tensu = new int[NUMBER]; // 点数

		for (int i = 0; i < NUMBER; i++) {

			tensu[i] = stdIn.nextInt(); // tensu[i]を読み込んで
			sum += tensu[i]; // sumにtensu[i]を加える
		}

		System.out.println("合計は" + sum + "点です。");
		System.out.println("平均は" + (double) sum / NUMBER + "点です。");
	}
}
