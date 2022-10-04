package course04;

import java.util.Random;

class LuckyNo {

	public static void main(String[] args) {
		Random rand = new Random();

		int lucky = rand.nextInt(41); // 0～9の乱数
		int x = rand.nextInt(41); // 0～9の乱数

		System.out.println("widthは" + lucky + "です。");
		System.out.println("heightは" + x + "です。");
		System.out.println(lucky * x / 2);
	}
}
