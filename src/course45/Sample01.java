package course45;

import java.util.HashMap;

class Sample01 {

	public static void main(String[] args) {

		HashMap<String, Integer> score = new HashMap<String, Integer>();

		score.put("英語", 83);
		score.put("数学", 92);
		score.put("国語", 76);
		score.put("英語", 87);

		System.out.println(score.get("英語"));
		System.out.println(score.get("数学"));
		System.out.println(score.get("国語"));
		System.out.println(score.get("化学"));
	}
}
