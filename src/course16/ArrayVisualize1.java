package course16;

import java.util.Random;
import java.util.Scanner;

public class ArrayVisualize1 {

	public static void main(String[] args) {
		int[] array = new int[6];
		Random rand = new Random();
		int total = 0;
		for(int i=0; i<5; i++) {
			array[i] = rand.nextInt(10) + 1;
			total += array[i];
		}
		System.out.println("配列の中身");
		for(int i=0; i<5; i++) {
			System.out.print(array[i] + ",\t");
		}
		System.out.println();
		Scanner stdIn = new Scanner(System.in);
		System.out.println("配列の合計=");
		int ans = stdIn.nextInt();

		if(ans == total) {
			System.out.println("正解!!!");

		}else {
			System.out.println("不正解・・・");
		}
	}

}
