package course07;

// ジャンケンの手を表示（switch文）

import java.util.Scanner;

class 例題５ {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("手を選べ（1…A／2…B／3…C）：");
		int hand = stdIn.nextInt();

		switch (hand) {
		case 1:
			System.out.println("A");
			break;
		case 2:
			System.out.println("B");
			break;
		case 3:
			System.out.println("C");
			break;
		}
	}
}
