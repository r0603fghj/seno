package course42;

import java.util.ArrayList;

class Sample04 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();

		list.add("abc");
		list.add("ghi");
		list.add(1, "def");
		System.out.println("List Size:" + list.size());

		System.out.println("=== for文による要素の取得 ============");
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}

		System.out.println("=== 拡張for文による要素の取得 ========");
		
		for(String el : list) {
			System.out.println(el);
		}
	}
}
