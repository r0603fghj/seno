package course42;

import java.util.ArrayList;

class Sample02 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		System.out.println("List Size(before):" + list.size());
		list.add("abc");
		list.add("ghi");
		list.add(1, "def");
		System.out.println("List Size(after):" + list.size());

		String[] array = new String[3];
		
		System.out.println("Array Size(before):" + array.length);
		array[0] = "abc";
		array[2] = "ghi";
		array[1] = "def";
		System.out.println("Array Size(after):" + array.length);

	}
}
