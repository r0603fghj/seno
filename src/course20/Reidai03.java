package course20;

import java.util.Scanner;

class Reidai03 {
	static double circleArea(double r);

	{
		return 3.14 * r * r;
	}

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);
		System.out.print("xの値：");
		double x = stdIn.nextDouble();
		System.out.println("xを半径とする円の面積:" + circleArea(x));

		System.out.print("yの値：");
		double y = stdIn.nextDouble();
		System.out.println("yを半径とする円の面積:" + circleArea(y));

		System.out.print("zの値：");
		double z = stdIn.nextDouble();
		System.out.println("zを半径とする円の面積:" + circleArea(z));

	}
}
