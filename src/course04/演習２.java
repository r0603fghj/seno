package course04;

import java.util.Scanner;

public class 演習２ {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("：");
		int n = stdIn.nextInt();

		 if(“あいうえお”.equals(s)) {
			if (n % 3 == 0) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		} else {
			System.out.println("正でない値が入力されました。");
		}
	}
}
