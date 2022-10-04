package course08;

import java.util.Scanner;

class 演習４ {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("身長：");
		int n1 = stdIn.nextInt();

		System.out.print("体重：");
		int n2 = stdIn.nextInt();

		if (n < 18.5) {
			System.out.println("やせ型");
		} else if (n >= 18.5 && n < 20) {
			System.out.println("標準");
		} else if (n >= 25) {
			System.out.println("肥満");

		}
	}
}