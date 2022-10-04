package pre_exam;

class Monster {
	String name = "モンスター";

	// 攻撃
	public void attack() {
		System.out.println(name + "の攻撃");
		System.out.println(name + "は20のダメージを与えた");
	}

	// 逃亡
	public void escape() {
		System.out.println(name + "は逃げ出した");
	}
}

class Slime extends Monster {
	String name = "スライム";

	// ジャンプ
	public void jump() {
		System.out.println(this.name + "は飛び跳ねた");
	}
}

public class Q14 {
	public static void main(String[] args) {
		Monster monster = new Monster();
		monster.attack();
		monster.escape();

		Slime slime = new Slime();
		slime.attack();
		slime.jump();
		slime.escape();
	}
}
