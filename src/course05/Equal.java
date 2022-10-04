package course05;

// 読み込んだ二つの整数値は等しいか

import java.util.Scanner;

class Equal {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("整数x：");
		int x = stdIn.nextInt();

		System.out.print("整数y：");
		int y = stdIn.nextInt();

		if (x == y) {
			System.out.println("x == y");
		} else {
			System.out.println("x != y");
		}
	}
}
