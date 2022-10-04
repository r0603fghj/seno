package course14;

// 関係演算子・等価演算子・論理否定演算子が生成する値を表示

import java.util.Scanner;

class BooleanIfTester2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int left = 10;
		int top = 10;
		int width = 30;
		int height = 15;

		System.out.print("整数x：");  int x = stdIn.nextInt();
        System.out.print("整数y：");  int y = stdIn.nextInt();

        boolean isInsideRect = (left <= x) && (x <= left + width)
                && (top <= y) && (y <= top + height);

        if(isInsideRect) {
            System.out.println("(x,y)は四角形の内部です。");
        }else {
            System.out.println("(x,y)は四角形の外にあります。");
        }

	}
}
