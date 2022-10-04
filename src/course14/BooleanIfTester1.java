package course14;

// 関係演算子・等価演算子・論理否定演算子が生成する値を表示

import java.util.Scanner;

class BooleanIfTester1 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("整数a：");  int a = stdIn.nextInt();
		System.out.print("整数b：");  int b = stdIn.nextInt();

		boolean bool = (a < b);
		if(bool) {
		    System.out.println("a < b");
		}else {
		    System.out.println("a >= b");
		}
	}
}
