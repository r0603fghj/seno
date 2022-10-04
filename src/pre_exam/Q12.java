package pre_exam;

class Game {
	String title; //タイトル
	String genre; //ジャンル
	int price; //値段
	int score; //メタスコア
}

public class Q12 {
	public static void main(String[] args) {
		Game game = new Game();
		game.title = "Borderlands3";
		game.genre = "FPS";
		game.price = 7980;
		game.score = 75;

		System.out.println("タイトル: " + game.title);
		System.out.println("ジャンル: " + game.genre);
		System.out.println("値段: " + game.price);
		System.out.println("メタスコア: " + game.score);

	}
}
