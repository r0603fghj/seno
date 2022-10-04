package course05;

// 読み込んだ整数値は正の値か／そうでないか？

import java.util.Scanner;

class StringComp {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("文字列：");
		String s1 = stdIn.nextLine();
		System.out.print("文字列：");
		String s2 = stdIn.nextLine();

		if (s1.equals(s2)) {
			System.out.println("同じ文字列です。");
		} else {
			System.out.println("異なる文字列です。");
		}
	}
}
