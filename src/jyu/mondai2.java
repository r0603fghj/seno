package jyu;

import java.util.Scanner;

public class mondai2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x;
		int y;
		int money = 1000;

		int[][] a = { { 0, 140, 170 }, { 140, 0, 140 }, { 170, 140, 0 } };
		while (true) {
			System.out.println("現在の残高" + money);
			System.out.println("現在の駅名を入力してください");
			System.out.println("稲毛なら０，西千葉なら1、千葉なら２");
			x = sc.nextInt();
			System.out.println("降りる駅を入力してください");
			System.out.println("稲毛なら０，西千葉なら１，千葉なら２");
			y = sc.nextInt();
			money -= a[0][2];
			money += 1000;
			System.out.println("運賃は170円です。残高は" + money + "です");
			System.out.println("続けるなら０を、やめる場合は99を入力");
			if (99 == sc.nextInt())
				break;
		}
	}
}