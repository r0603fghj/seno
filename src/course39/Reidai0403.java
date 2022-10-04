package course39;

import java.util.Scanner;

class Reidai0403 {

	public static void rank(int x) {
		String str = null;
		if(x >= 80) {
			str = "*****";
		}else if(x >= 60) {
			str = "***";
		}else if(x >= 50) {
			str = "*";
		}

		System.out.println(str.length());
	}

	public static void main(String[] args) {
		System.out.print("数値1を入力:");
		Scanner stdIn = new Scanner(System.in);
		int x = stdIn.nextInt();

		rank(x);
	}
}
