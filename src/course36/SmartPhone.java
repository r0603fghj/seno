package course36;

public class SmartPhone extends phone implements Camera {

	public void call(String s) {
		System.out.println(s + "に電話をかけます");
	}

	public void recieve(String s) {
		System.out.println(s + "からの電話を取ります");
	}

	public void shot() {
		System.out.println("スマホで撮影します");
	}

	public void printpicture() {
		System.out.println("コンビニで印刷します");
	}

}
