package course25;

class Teacher {
	String name; //名前
	long salary; //給料
	String subject; //担当教科
	int age; //年齢
	String gender; //性別

	Teacher() {
		name = "石濱 友裕";
		salary = 16_000_000;
		subject = "Java基礎";
		age = 18;
		gender = "男";

	}

	void introduce() {
		System.out.println("自己紹介をします。");
		System.out.println("名前: " + name);
		System.out.println("給与: " + salary + "円");
		System.out.println("担当科目: " + subject);
		System.out.println("年齢: " + age + "歳");
		System.out.println("性別: " + gender);

		System.out.println("aaa");
	}

	void changeSalary(long k) {
		if (k >= 0) {
			salary = k;
		} else {
			System.out.println("[ERROR]");
		}

	}

	void changeGender(String m) {
		if ("男".equals(m) | "女".equals(m)) {
			gender = m;

		} else {
			System.out.println("男か女を設定してください。");
		}
	}
}

class Sample01 {
	public static void main(String[] args) {
		Teacher ishihama = new Teacher();

		ishihama.introduce();

		//給料を変更する
		ishihama.changeSalary(-10);

		//性別を変更する
		ishihama.changeGender("男");
		ishihama.introduce();
	}
}
