package course14;

import java.util.Random;

// 文字と文字リテラル

class Enshu02 {

	public static void main(String[] args) {
		Random r = new Random();
		char x = (char)(r.nextInt(26) + 0x61);
		System.out.println(x);
	}
}
