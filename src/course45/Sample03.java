package course45;

import java.util.HashMap;

class Sample03 {

	public static void main(String[] args) {

		HashMap<String, Integer> score = new HashMap<String, Integer>();

		//score.put("英語", 83);
		score.put("数学", 92);
		score.put("国語", 76);
		score.put("英語", 87);

		int sum = 0;
		for (String key : score.keySet()) {
			sum += score.get(key);

			System.out.println(sum);
			System.out.println(key + ": " + score.get(key));
		}
	}
}
