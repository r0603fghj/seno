package course45;

import java.util.HashMap;

class reidai0202 {

	public static void main(String[] args) {

		HashMap<String, String> map = new HashMap<String, String>();

		map.put("はくさい", "やさい");
		map.put("にんじん", "やさい");
		map.put("りんご", "くだもの");
		map.put("みかん", "くだもの");

		System.out.println(map.get("はくさい"));
		System.out.println(map.get("にんじん"));
		System.out.println(map.get("りんご"));
		System.out.println(map.get("みかん"));
		if (map.remove("りんご") != null) {
			System.out.println(map.get("りんご"));
		}

	}
}
