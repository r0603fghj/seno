package course20;

class Reidai07 {

	static int sumOf(int[] list) {
		int sum = 0;
		for (int i = 1; i < list.length; i++)
			sum += list[i];
		return sum;
	}

	public static void main(String[] args) {
		int[] array = { 5, 7, 3, 2, 5, 9, 6 };

		int total = sumOf(array);

		System.out.println("arrayの合計値：" + total);
	}
}
