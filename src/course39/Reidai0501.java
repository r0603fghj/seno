package course39;

import java.util.Scanner;

class Reidai0501 {

	public static int parse(String str) throws Error {
		int result = -1;
		try {
			result = Integer.parseInt(str);
		} catch (NumberFormatException e) {
			throw new Error("重大なエラー");

		}
		return result;
	}

	public static void main(String[] args) {
		System.out.print("数値を入力:");
		Scanner stdIn = new Scanner(System.in);

		String str = stdIn.nextLine();
		try {

			System.out.println(parse(str));
		} catch (Error e) {
			System.out.println(e.getMessage());
		}
	}
}