package course42;

import java.util.ArrayList;

class reidai0302 {

	public static void main(String[] args) {

		ArrayList<Double> list = new ArrayList<Double>();

		list.add(1.0);
		list.add(2.0);
		list.add(3.0);
		list.add(4.0);
		list.add(5.0);

		list.remove(3);
		System.out.println(list.size());

		if (list.contains(4.0))
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}