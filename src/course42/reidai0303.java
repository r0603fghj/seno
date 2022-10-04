package course42;

import java.util.ArrayList;

class reidai0303 {

	public static void main(String[] args) {

		ArrayList<Double> list = new ArrayList<Double>();

		list.add(1.0);
		list.add(2.0);
		list.add(3.0);
		list.add(4.0);
		list.add(5.0);

		ArrayList<Double> list2 = list;
		ArrayList<Double> list3 = (ArrayList<Double>) list.clone();
		list.clear();

		System.out.println(list.size());
		System.out.println(list2.size());
		System.out.println(list3.size());
	}
}