package course08;

import java.util.Scanner;

class 演習３ {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("年齢：");
		int n = stdIn.nextInt();

		if (n >= 6 && n <= 12) {
			System.out.println("小学生");
		} else if (n >= 13 && n <= 15) {
			System.out.println("中学生");
		} else if (n >= 16 && n <= 18) {
			System.out.println("高校生");
		} else if (n >= 19) {
			System.out.println("国際理工学園生");
		} else if (n >= 0 && n <= 6) {
			System.out.println("幼稚園または保育園");
		} else if (n <= 0) {
			System.out.println("存在しない");
		}
	}
}