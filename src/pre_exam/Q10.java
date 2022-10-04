package pre_exam;

public class Q10 {
	public static void main(String[] args) {
		int[][] d = {
				{ 23, 56, 12 },
				{ 33, 24, 51 },
				{ 49, 13, 41 }
		};
		int sum = 0;
		for (int[] d1 : d) {
			for (int d2 : d1) {
				sum += d2;
			}
		}
		System.out.println(sum);
	}
}
