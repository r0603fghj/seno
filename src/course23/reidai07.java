package course23;

class Teacher {
	String name;
	String gender;
	String subjects;
	long age;
	long salary;
}

public class reidai07 {
	public static void main(String[] args) {

		Teacher sennsei = new Teacher();
		Teacher sennsei2 = new Teacher();

		sennsei.name = "石濱友裕";
		sennsei.gender = "男";
		sennsei.subjects = "java";
		sennsei.age = 34;
		sennsei.salary = 300000000;

		sennsei2.name = "末原";
		sennsei2.gender = "男";
		sennsei2.subjects = "担任";
		sennsei2.age = 29;
		sennsei2.salary = 3500000;

		System.out.println("■ステイタス");
		System.out.println("　名前：" + sennsei.name);
		System.out.println("　性別：" + sennsei.gender);
		System.out.println("　担当教科：" + sennsei.subjects);
		System.out.println("　年齢：" + sennsei.age);
		System.out.println("　時給：" + sennsei.salary);

		System.out.println("■ステイタス");
		System.out.println("　名前：" + sennsei2.name);
		System.out.println("　性別：" + sennsei2.gender);
		System.out.println("　担当教科：" + sennsei2.subjects);
		System.out.println("　年齢：" + sennsei2.age);
		System.out.println("　年収：" + sennsei2.salary);
	}
}