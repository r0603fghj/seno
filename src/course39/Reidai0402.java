package course39;

import java.util.Scanner;

class Reidai0402 {

	public static void div(int x, int d) {
		try {
			System.out.println(x + "を" + d + "で割った商:" + x / d);
			System.out.println(x + "を" + d + "で割った余り:" + x % d);
		} catch (ArithmeticException e) {
			System.out.println("例外を補足しました");
		}
	}

	public static void main(String[] args) {

		System.out.print("数値1を入力:");
		Scanner stdIn = new Scanner(System.in);
		int x = stdIn.nextInt();
		System.out.print("数値2を入力:");
		int d = stdIn.nextInt();

		div(x, d);
	}
}
