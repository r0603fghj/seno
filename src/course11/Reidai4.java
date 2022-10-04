
package course11;

import java.util.Scanner;

class Reidai4 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("整数値：");
		int n = stdIn.nextInt();

		for (int i = 1; i <= n; i++) {
			if (n % i == 0) { // 割り切れたら
				System.out.println(i); // 表示
			}
		}
	}
}
