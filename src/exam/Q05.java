package exam;

import java.util.Scanner;

public class Q05 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("数値を入力:");
		int n = stdIn.nextInt();

		for (int i = 1; i <= n; i++)
			System.out.println(i);
	}
}
