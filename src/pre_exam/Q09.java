package pre_exam;

public class Q09 {
	public static void main(String[] args) {
		int[] c = { 23, 56, 12, 33, 24, 51, 49, 13 };
		int max = c[0];
		for (int i : c) {
			if (max < i) {
				max = i;
			}
		}
		System.out.println(max);
	}
}
