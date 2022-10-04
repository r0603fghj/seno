package course42;

import java.util.ArrayList;

class Sample03 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();

		list.add("abc");
		list.add("ghi");
		list.add(1, "def");
		System.out.println("List Size:" + list.size());

		if(list.contains("abc")) {
			System.out.println("abcはリスト内に存在します");
		}

		ArrayList<String> list2 = (ArrayList<String>)list.clone();
		list2.remove(1);
		if(!list.contains("def")) {
			System.out.println("defはリストにありません");
		}

		list.clear();

		if(list.isEmpty()) {
			System.out.println("listは空です。");
		}

	}
}
