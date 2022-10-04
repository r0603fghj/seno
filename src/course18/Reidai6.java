package course18;

class reidai6 {

	public static void main(String[] args) {
		String[][] x = {
				{ "〇", "×", "△", "△" },
				{ "×", "△", "〇", "×" },
				{ "×", "〇", "×", "〇" },

		};

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (x[i][j].equals("〇")) {

					System.out.println("x[" + i + "][" + j + "] = " + x[i][j]);

				}
			}
		}
	}
}