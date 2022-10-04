package course35;

public class Player {

	public int hp;
	public int atk;

	public Player(int hp, int atk) {
		super();
		this.hp = hp;
		this.atk = atk;
	}

	public int atk() {
		System.out.println("攻撃");
		return atk;
	}

	public int action() {
		return atk();
	}

}

class SwordFighter extends Player {

	public SwordFighter(int hp, int atk) {
		super(hp, atk);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public int strongAttack() {
		System.out.println("クリティカルヒット!!");
		return atk * 3;
	}

	public int action() {
		super.atk();
		if (hp >= 10) {
			hp -= 5;
			return strongAttack();
		} else {
			return atk();
		}
	}
}

class Mage extends Player {
	public int mat;
	public int mp;

	public Mage(int hp, int atk, int mat, int mp) {
		super(hp, atk);
		this.mat = mat;
		this.mp = mp;
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public int cast() {
		System.out.println("魔法攻撃");
		return mat * 3;
	}

	public int action() {

		if (hp >= 20) {
			mp -= 20;
			return cast();
		} else {
			return atk();
		}
	}
}