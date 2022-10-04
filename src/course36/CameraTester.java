package course36;

public class CameraTester {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Camera[] a = new Camera[2];
		a[0] = new InstantCamera();
		a[1] = new DigitalCamera();

		for (Camera p : a) {
			p.shot();
			p.printpicture();
			System.out.println();
		}
	}

}
