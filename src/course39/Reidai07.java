package course39;

import java.util.Scanner;

class Reidai07 {
	public static int method1(int x) {
		return method2(x);
	}
	public static int method2(int x) {
		return method3(x);
	}
	public static int method3(int x) {
		return method4(x);
	}
	public static int method4(int x) {
		return 10/x;
	}

	public static void main(String[] args) {
		System.out.print("数値を入力:");
		Scanner stdIn = new Scanner(System.in);

		int x = stdIn.nextInt();

		System.out.println(method1(x));
	}
}
