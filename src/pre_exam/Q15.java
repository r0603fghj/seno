package pre_exam;

import java.util.ArrayList;

public class Q15 {
	public static void main(String[] args) {
		int[] array = { 5, 4, 3, 2, 1 };

		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int a : array) {
			list.add(a);
		}
		for (Integer i : list) {
			System.out.println(i);
		}

	}
}
