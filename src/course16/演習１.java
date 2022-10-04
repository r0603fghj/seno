package course16;

public class 演習１ {

	public static void main(String[] args) {
		int[] a = { 4, 10, 16, 22 };

		for (int i = 0; i < a.length; i++)
			System.out.println("a[" + i + "] = " + a[i]);

		double sum = 0;
		for (double i : a)
			sum += i;
		System.out.println("全要素の和は" + sum + "です。");

	}
}
