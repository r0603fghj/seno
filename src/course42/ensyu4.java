package course42;

import java.util.ArrayList;

class ensyu4 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();

		list.add("XXX");
		list.add("YYY");
		list.add("ZZZ");

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}