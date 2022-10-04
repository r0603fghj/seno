package course20;

class Reidai08 {

	static int plus(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		int a = 5;
		int b = 10;

		String c = "5";
		String d = "10";

		System.out.println("int型 a + b の結果:" + plus(a, b));
		System.out.println("String型 c + d の結果:" + plus(c, d));
	}
}
