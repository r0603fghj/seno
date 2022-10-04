package course42;

import java.util.ArrayList;

class reidai02 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.println("00" + list.size());
		list.add(5);
		System.out.println("01" + list.size());
		list.add(0, 4);
		System.out.println("02" + list.size());
		list.add(0, 3);

		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));

	}
}
