package course37;

public class Enshu01 {
	public static void main(String[] args) {
		Human nanashi = new Human();
		nanashi.speedCorrection(0);
		nanashi.printStatus();

		Human suzuki = new Human();
		suzuki.setName("鈴木さん");
		suzuki.setJob("陸上選手");
		suzuki.speedCorrection(8);
		suzuki.printStatus();
	}
}
