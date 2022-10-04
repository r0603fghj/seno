package course14;

import java.util.Scanner;

class reidai5 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("整数a：");
		int a = stdIn.nextInt();

		System.out.println(a % 3 == 0);

	}
}
