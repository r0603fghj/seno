package course32;

// ペットクラスの利用例（メソッドの引数で多相性を検証）

class PetTester2 {

	public static void main(String[] args) {
		Pet[] a = {
			new Pet("Kurt", "アイ"),
			new RobotPet("R2D2", "ルーク"),
			new Pet("マイケル", "英男"),
		};

		for (Pet p : a) {
			//説明のため、プログラムを一部修正
			p.introduce();					// pが参照するインスタンスに自己紹介させる
			System.out.println();
		}
	}
}
