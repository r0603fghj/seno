package course05;

// 二つの整数値の小さいほうの値と大きいほうの値を求めて表示

import java.util.Scanner;

class MinMax {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("整数a：");
		int a = stdIn.nextInt();
		System.out.print("整数b：");
		int b = stdIn.nextInt();

		int min, max; // 小さいほうの値／大きいほうの値

		if (a % b == 0) { // aがbより小さければ
			min = a / b;
			max = a % b;

		} else { // そうでなければ
			min = a / b;
			max = a % b;
		}

		System.out.println("aをbで割ったときの値は" + min + "です。");
		System.out.println("aをbで割ったときの余りは" + max + "です。");
	}
}
