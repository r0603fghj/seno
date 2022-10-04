package course45;

import java.util.HashMap;

class Sample02 {

	public static void main(String[] args) {
		HashMap<String, Integer> score = new HashMap<String, Integer>();

		score.put("英語", 83);
		score.put("数学", 92);
		score.put("国語", 76);

		System.out.println("Map Size:" + score.size());

		if(score.containsKey("国語")) {
			System.out.println("国語はマップ内に存在します");
			System.out.println("値: " + score.get("国語"));
			System.out.println();
		}

		score.remove("英語");
		if(!score.containsKey("英語")) {
			System.out.println("英語はマップ内に存在しません");
		}

		score.clear();

		if(score.isEmpty()) {
			System.out.println("マップは空です。");
		}
	}
}
