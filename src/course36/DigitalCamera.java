package course36;

public class DigitalCamera implements Camera {
	public void shot() {
		System.out.println("デジカメで撮影します");
	}

	public void printpicture() {
		System.out.println("プリンターで印刷します");
	}
}
