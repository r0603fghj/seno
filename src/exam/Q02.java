package exam;

import java.util.Scanner;

public class Q02 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("数値を入力:");
		int x = stdIn.nextInt();
		if (x % 2 == 0) {
			System.out.println("NO");
		} else {
			System.out.println("YES");
		}
	}
}
