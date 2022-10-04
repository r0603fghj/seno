package course23;

class Student {
	int score_1;
	int score_2;
	int score_3;
}

public class 演習３ {
	public static void main(String[] args) {
		Student seiseki = new Student();

		seiseki.score_1 = 67;
		seiseki.score_2 = 68;
		seiseki.score_3 = 69;

		System.out.println("■詳細");
		System.out.println("　Java基礎の点数：" + seiseki.score_1);
		System.out.println("　企業と法務の点数：" + seiseki.score_2);
		System.out.println("　情報システムの点数：" + seiseki.score_3);
	}
}