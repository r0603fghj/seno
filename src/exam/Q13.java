package exam;

class Student{
	String name;		//名前
	String className;	//クラス名
	String birthday;		//生年月日

	void introduce() {
		System.out.println("自己紹介をします");
		System.out.println("名前: " + this.name);
		System.out.println("クラス名: " + this.className);
		System.out.println("生年月日: " + this.birthday);
	}
}

public class Q13 {
	public static void main(String[] args) {
		Student stu = new Student();
		stu.name = "石濱 友裕";
		stu.className = "2A";
		stu.birthday = "1988/07/03";
		stu.introduce();
	}
}
