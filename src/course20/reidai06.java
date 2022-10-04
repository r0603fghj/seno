package course20;

public class reidai06 {
	static int get20() {
		return 20;
	}

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			sum += get20();
		}
		System.out.println(sum);
	}
}