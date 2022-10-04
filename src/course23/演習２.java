package course23;

class Dog {
	String breed;
	String name;
	double weight;
}

public class 演習２ {
	public static void main(String[] args) {
		Dog inu = new Dog();

		inu.breed = "ゴールデンレトリーバー";
		inu.name = "とり";
		inu.weight = 7.0;

		System.out.println("■詳細");
		System.out.println("　学籍番号：" + inu.breed);
		System.out.println("　名前：" + inu.name);
		System.out.println("　年齢：" + inu.weight);

	}
}