package course16;

public class reidai6 {

	public static void main(String[] args) {
		int[] a = { 3, 6, 9, 1, 4, 7, 2, 5, 8 };
		int max = a[0];
		for (int i = 0; i < a.length; i++)
			if (max < a[i]) {
				max += a[i];
				System.out.println(max);

			}
	}
}
