package course20;

import java.util.Scanner;

class Reidai02 {

	static int mul(int a, int b) {
		return a * b;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("xの値：");
		int x = stdIn.nextInt();
		System.out.print("yの値：");
		int y = stdIn.nextInt();

		int result = mul(x, y);
		System.out.println("x * y = " + result);
	}
}
