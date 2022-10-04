package course09;

import java.util.Scanner;

class 例題２ {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("暗証番号をいれてください。。");

		String str = stdIn.nextLine();

		while (!"END".equals(str)) { //条件には、「xがn以下の場合」という条件が入る
			System.out.println("[受け取った文字]" + str); // ここにxの値を表示する処理
			System.out.println("文字を受け取ります"); // ここにxの値を1増やす処理
			str = stdIn.nextLine();
		}
	}
}