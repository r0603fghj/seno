package course07;

// 読み込んだ整数値はゼロであるかどうか

import java.util.Scanner;

class Reidai4 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("整数値：");
		int n = stdIn.nextInt();

		if (!(n < 0)) {
			System.out.println("その値はゼロより小さいです。");
		} else {
			System.out.println("その値はゼロ以上です。");
		}
	}
}
