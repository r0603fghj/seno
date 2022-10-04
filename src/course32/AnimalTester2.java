package course32;

class Animal2 {
	public String name;
	public int age;

	public Animal2() {
		this.name = "名無し";
		this.age = 0;
	}

	//--- コンストラクタ ---//
	public Animal2(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void eat() {
		System.out.println("食事をします。");
	}

	public void show() {
		System.out.println("■" + this.getClass().getSimpleName());
		System.out.println("名前:" + this.name);
		System.out.println("年齢:" + this.age);
		this.eat();
	}
}

class Cat2 extends Animal2 {
	public String nakigoe;

	public Cat2(String name, int age, String nakigoe) {
		super(name, age);
		this.nakigoe = nakigoe;
	}

	public Cat2() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public void bark() {
		System.out.println("鳴き声:" + this.nakigoe);
	}

	public void show() {
		super.show();
		this.bark();
	}
}

class Dog2 extends Animal2 {
	public String nakigoe;

	public Dog2(String name, int age, String nakigoe) {
		super(name, age);
		this.nakigoe = nakigoe;
	}

	public void bark() {
		System.out.println("鳴き声:" + this.nakigoe);
	}

	public void run() {
		System.out.println("家じゅうを走ります。");
	}

	public void show() {
		super.show();
		this.bark();
		this.run();
	}
}

class AnimalTester2 {
	public static void main(String[] args) {
		Animal2 animal = new Animal2();
		Cat2 cat = new Cat2("たま", 5, "a");

		Dog2 dog = new Dog2("いぬ", 3, "a");

		Animal2[] animalArray = { animal, cat, dog };

		for (int i = 0; i < animalArray.length; i++) {
			animalArray[i].show();
		}
	}
}
