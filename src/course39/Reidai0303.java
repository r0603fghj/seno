package course39;

import java.util.InputMismatchException;
import java.util.Scanner;

class Reidai0303 {

	public static void main(String[] args) {
		try {
			Scanner stdIn = new Scanner(System.in);
			System.out.print("配列のサイズを入力:");
			int num = stdIn.nextInt();

			String[] array = new String[num];
			int num2 = num;
			if (num % 2 == 0) {
				num2++;
			}

			for (int i = 0; i < num2; i++) {
				if (i < 10) {
					array[i] = "abc";
				}

				System.out.println("文字:" + array[i] + " ,サイズ:" + array[i].length());
			}

		} catch (NegativeArraySizeException e) {
			throw new RuntimeException("添え字がマイナスです");
		} catch (ArrayIndexOutOfBoundsException e) {
			throw new RuntimeException("偶数です");
		} catch (NullPointerException e) {
			throw new RuntimeException("添え字がマイナス");
		} catch (InputMismatchException e) {
			throw new RuntimeException("不正な入力");
		}
	}
}