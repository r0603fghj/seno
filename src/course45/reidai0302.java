package course45;

import java.util.HashMap;

class reidai0302 {

	public static void main(String[] args) {

		HashMap<String, String> map = new HashMap<String, String>();

		map.put("はくさい", "やさい");
		map.put("にんじん", "やさい");
		map.put("りんご  ", "くだもの");
		map.put("みかん  ", "くだもの");

		int sum = 0;
		for (String key : map.keySet()) {
			sum++;

			System.out.println(sum);
			System.out.println(key + ": " + map.get(key));
		}

	}
}
