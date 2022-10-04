package exam;

import java.util.Scanner;

public class Q04 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("数値を入力:");
		int n = stdIn.nextInt();
		int i = 0;
		while (i <= n - 1) {
			System.out.println(i);
			i++;
		}

	}
}
