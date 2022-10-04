package course39;

import java.util.Scanner;

class Reidai0401 {

	public static int parse(String str) {
		int result = -1;

		try {
			result = Integer.parseInt(str);
		} catch (NumberFormatException e) {
			System.out.println();
		}

		return result;
	}

	public static void main(String[] args) {
		System.out.print("数値を入力:");
		Scanner stdIn = new Scanner(System.in);

		String str = stdIn.nextLine();

		System.out.println(parse(str));
	}
}
