package course42;

import java.util.ArrayList;

class ensyu5 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();

		list.add("XXX");
		list.add("YYY");
		list.add("ZZZ");

		for (String el : list) {
			System.out.println(el);
		}
	}
}