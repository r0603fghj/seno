package course29;

public class CoordinateTester {
	public static void main(String[] args) {
		//①  Coordinateクラスのインスタンスの作成
		Coordinate cor = new Coordinate();

		//② インスタンスのメンバ変数xに3.0, yに4.0を代入
		cor.setX(3.0);
		cor.setX(4.0);

		//③代入した内容を画面に表示
		System.out.println(cor.getX());
		System.out.println(cor.getX());
	}
}
