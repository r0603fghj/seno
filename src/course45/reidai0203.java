package course45;

import java.util.HashMap;
import java.util.Scanner;

class reidai0203 {

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

		Scanner stdIn = new Scanner(System.in);
		System.out.println("文字列を入力");
		String s1 = stdIn.nextLine();
		System.out.println("文字列を入力");
		String s2 = stdIn.nextLine();

		if (map.containsKey(s1)) {
			System.out.println("キー重複エラー");
		} else {
			map.put(s1, s2);
		}
		System.out.println(map.size());
	}
}
