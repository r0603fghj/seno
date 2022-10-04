package coures06;

import java.util.Scanner;

public class 演習１ {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("整数値：");
		int n = stdIn.nextInt();

		if (n > 0) {
			if (n % 3 == 0) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		} else {
			System.out.println("正でない値が入力されました。");
		}
	}
}
