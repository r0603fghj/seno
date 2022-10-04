package course18;

class reidai5 {

	public static void main(String[] args) {
		String[][] x = {
				{ "〇", "×", "〇" },
				{ "×", "×", "〇" },
				{ "×", "〇", "×" },

		};
		int count = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (x[i][j].equals("〇")) {
					count++;

				}
			}
		}
		System.out.println(count);
	}
}