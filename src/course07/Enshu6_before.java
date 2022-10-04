package course07;

// 上のif文と下のif文で結果は常に同じです。

import java.util.Scanner;

class Enshu6_before {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("整数値：");
		int score = stdIn.nextInt();

		String result = "NG";

		if(score >= 0) {
			if(score <= 70) {
				if(score <= 30) {
					result = "OK";
				}
				if(score >= 50) {
					result = "OK";
				}
			}
		}
		System.out.println(result);
	}
}
