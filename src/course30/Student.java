package course30;

public class Student {
	int studentId;
	String name;
	int age;
	static int cut = 0;

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		this.studentId = cut;
		cut++;
	}

	static void printStudentNum() {
		System.out.println(Student.cut);

	}

	public int getStudentId() {
		return studentId;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
