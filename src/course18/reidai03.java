package course18;

import java.util.Random;

class reidai03 {

	public static void main(String[] args) {
		Random rand = new Random();

		int[][] x = new int[3][4];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				x[i][j] = rand.nextInt(100);
				System.out.println("x[" + i + "][" + j + "] = " + x[i][j]);
			}
		}
	}
}
