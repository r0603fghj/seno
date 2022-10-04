package course39;

import java.util.Scanner;

class Reidai08Error extends RuntimeException{
	Reidai08Error(String s){
		super(s);
	}
}
class Reidai08 {
	public static void func() {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("配列のサイズを入力:");
		int num = stdIn.nextInt();

		String[] array = new String[num];
		int num2 = num;
		if(num%2 == 0) {
			num2++;
		}

		for(int i=0; i<num2; i++) {
			if(i < 10) {
				array[i] = "abc";
			}
			System.out.println("文字:" + array[i] + " ,サイズ:" + array[i].length());
		}
	}

	public static void main(String[] args) {
		func();
	}
}
