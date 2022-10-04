package course39;

import java.util.Scanner;

class Reidai0502 {

	public static void div(int x, int d) throws Exception {
		try {
			System.out.println(x + "を" + d + "で割った商:" + x / d);
			System.out.println(x + "を" + d + "で割った余り:" + x % d);
		} catch (ArithmeticException e) {
			throw new Exception("例外発生!!");
		}
	}

	public static void main(String[] args) {
		System.out.print("数値1を入力:");
		Scanner stdIn = new Scanner(System.in);
		int x = stdIn.nextInt();
		System.out.print("数値2を入力:");
		int d = stdIn.nextInt();
		try {
			div(x, d);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}