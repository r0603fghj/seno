package course20;

import java.util.Scanner;

class Reidai01 {

	//ここにaddメソッドを定義する
	static double sample(int a, int b) {
		int sample = a + b;
		return sample;

	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("xの値：");
		int x = stdIn.nextInt();
		System.out.print("yの値：");
		int y = stdIn.nextInt();

		int result = sample(x, y);

		System.out.println("x + y = " + result);
	}
}
