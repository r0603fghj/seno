package course45;

import java.util.HashMap;

class reidai1 {

	public static void main(String[] args) {

		HashMap<String, Double> score = new HashMap<String, Double>();

		score.put("リンゴ", 53.2);
		score.put("ごりら", 204.1);
		score.put("らっこ", 180.0);
		score.put("こおろぎ", 11.4);

		System.out.println(score.get("リンゴ"));
		System.out.println(score.get("ごりら"));
		System.out.println(score.get("らっこ"));
		System.out.println(score.get("こおろぎ"));
	}
}
