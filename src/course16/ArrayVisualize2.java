package course16;

import java.util.Random;
import java.util.Scanner;

public class ArrayVisualize2 {

	public static void main(String[] args) {
		int[] array = new int[6];
		Random rand = new Random();
		int total = 0;
		for(int i=0; i<5; i++) {
			array[i] = rand.nextInt(10) + 1;
			total += array[i];
		}
		Scanner stdIn = new Scanner(System.in);
		int idx = 0;
		for(int i=0; i<20; i++) {
			System.out.println();
		}
		while(true) {
			System.out.println("配列の中身");
			for(int i=0; i<5; i++) {
				if(i == idx) {
					System.out.print(array[i] + ",\t");
				}else {
					System.out.print("■,\t");
				}
			}
			System.out.println();
			System.out.println("0:左隣を見る。 1:右隣りを見る。 2:合計を答える。");
			int input = stdIn.nextInt();
			for(int i=0; i<20; i++) {
				System.out.println();
			}
			if(input == 0) {
				if(idx != 0) {
					idx--;
				}else {
					System.out.println("これ以上左はありません。");
				}
			}else if(input == 1) {
				if(idx != 4) {
					idx++;
				}else {
					System.out.println("これ以上右はありません。");
				}
			}else if(input == 2) {
				break;
			}else {
				System.out.println("0 or 1 or 2を入力");
			}
		}


		System.out.println("配列の合計=");
		int ans = stdIn.nextInt();

		if(ans == total) {
			System.out.println("正解!!!");

		}else {
			System.out.println("不正解・・・");
		}
	}

}
