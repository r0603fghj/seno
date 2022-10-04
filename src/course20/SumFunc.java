package course20;

import java.util.Scanner;

public class SumFunc {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("整数n：");  int n = stdIn.nextInt();

		int sum = 0;

		for(int i=1; i<=n; i++) {
			sum += i;
		}

		System.out.println("合計は"+ sum + "です");

	}

}
