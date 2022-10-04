package exam;

class School {
	String schoolName; //学校名
	String address; //住所
	int studentNum; //学生数
	int teacherNum; //教員数
}

public class Q12 {
	public static void main(String[] args) {
		School sc = new School();
		sc.schoolName = "国際理工カレッジ";
		sc.address = "千葉県千葉市稲毛区穴川3-8-11";
		sc.studentNum = 700;
		sc.teacherNum = 40;

		System.out.println("学校名: " + sc.schoolName);
		System.out.println("住所: " + sc.address);
		System.out.println("学生数: " + sc.studentNum);
		System.out.println("教員数: " + sc.teacherNum);

	}
}
