package course23;

class StudentId {
	String studentId;
	String name;
	int age;
}

public class 演習1 {
	public static void main(String[] args) {
		StudentId seit = new StudentId();
		StudentId seit2 = new StudentId();

		seit.studentId = "0603";
		seit.name = "石橋竜馬";
		seit.age = 18;

		seit2.studentId = "9999999";
		seit2.name = "石濱友裕";
		seit2.age = 32;

		System.out.println("■詳細");
		System.out.println("　学籍番号：" + seit.studentId);
		System.out.println("　名前：" + seit.name);
		System.out.println("　年齢：" + seit.age);

		System.out.println("■詳細");
		System.out.println("　学籍番号：" + seit2.studentId);
		System.out.println("　名前：" + seit2.name);
		System.out.println("　年齢：" + seit2.age);
	}
}