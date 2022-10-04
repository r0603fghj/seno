package course45;

import java.util.HashMap;
import java.util.Map;

class Sample04 {

	public static void main(String[] args) {

		HashMap<String, Integer> score = new HashMap<String, Integer>();

		score.put("英語", 83);
		score.put("数学", 92);
		score.put("国語", 76);

		for (Map.Entry<String, Integer> entry : score.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}
}
