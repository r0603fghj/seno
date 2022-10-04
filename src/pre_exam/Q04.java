package pre_exam;

import java.util.Scanner;

public class Q04 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("数値を入力:");
		int n = stdIn.nextInt();
		int i = 1;
		while (i <= n) {
			System.out.println(i);
			i++;
		}

	}
}
