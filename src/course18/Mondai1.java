package course18;

public class Mondai1 {

	public static void main(String[] args) {
		int[][] x = {
				{ 1, 2, 3 },
				{ 4, 8, 10 },

		};

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				int sum = 0;
				sum += i;
				System.out.println("x[" + i + "][" + j + "] = " + x[i][j]);
				System.out.println(sum);
			}
		}
	}
}
