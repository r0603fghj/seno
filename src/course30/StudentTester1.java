package course30;

class StudentTester1 {

	public static void main(String[] args) {
		Student adachi = new Student("足立幸一", 1000);
		Student adachi2 = new Student("遇陀綱弐", 2000);
		System.out.println(Student.cut);

		System.out.println("　学籍番号：" + adachi.getStudentId());
		System.out.println("　名前：" + adachi.getName());
		System.out.println("　年齢：" + adachi.getAge());

		System.out.println("　学籍番号：" + adachi2.getStudentId());
		System.out.println("　名前：" + adachi2.getName());
		System.out.println("　年齢：" + adachi2.getAge());

		Student.printStudentNum();
	}
}
