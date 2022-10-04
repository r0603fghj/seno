package course32;

class Animal {
	protected String name;
	protected int age;

	public Animal() {
		this.name = "名無し";
		this.age = 0;
	}

	//--- コンストラクタ ---//
	public Animal(String name, int age) {
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

class Cat extends Animal {

	public Cat(String name, int age, String nakigoe) {
		super(name, age);
		this.nakigoe = nakigoe;
	}

	public String nakigoe;

	public void bark() {
		System.out.println("鳴き声：" + this.nakigoe);

	}

	public void show() {
		super.show();
		this.bark();
	}
}

class AnimalTester {
	public static void main(String[] args) {

		Cat cat = new Cat("a", 9, "a");
		cat.show();
		cat.nakigoe = "ああああぁぁぁぁぁ";
		cat.bark();
	}
}
