package course42;

import java.util.ArrayList;

class Sample01 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();

		ArrayList<Character> list2 = new ArrayList<Character>();

		ArrayList<Integer> list3 = new ArrayList<Integer>();

		list.add("abc");
		list.add("ghi");
		list.add(1, "def");

		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));

	}
}
