package course30;

class MathTester {

	public static void main(String[] args) {
		//自然対数eの表示
		System.out.println("自然対数e: " + Math.E);
		//円周率の表示
		System.out.println("円周率π: " + Math.PI);

		//絶対値の計算
		System.out.println("-5の絶対値: " + Math.abs(-5));

		System.out.println(Math.max(5.3, 6.2));
		System.out.println(Math.pow(4, 3));
		System.out.println(Math.sqrt(1.44));
		System.out.println(-5 + Math.random() * 10);
	}
}
