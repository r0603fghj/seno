package exam;

import java.util.Scanner;

public class Q03 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("数値を入力:");
		int x = stdIn.nextInt();
		if (x <= 0 || x >= 10) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

	}
}
