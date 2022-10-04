package course16;

class reidai1 {

	public static void main(String[] args) {
		int[] a = new int[100];

		for (int i = 0; i < 100; i++) {
			a[i] = i + 1;
		}
		for (int i = 0; i < 100; i++) {
			a[i] = i + 1;
			System.out.println("a[" + i + "] = " + a[i]);
		}

	}
}