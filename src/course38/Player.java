package course38;

public abstract class Player {
	protected String name;
	private int hp;
	private int mp;

	public String getName() {
		return name;
	}

	public int weakAttack() {
		System.out.println(this.name + "の弱攻撃!!相手に5のダメージ");
		return 5;
	}

	public int strongAttack() {
		this.hp -= 10;
		int c = (int) (this.hp * 0.3);
		System.out.println(this.name + "の強攻撃!!相手に" + c + "のダメージ");
		System.out.println("反動で自身に10ダメージ");
		return c;
	}

	public int magic() {
		if (mp < 5) {
			System.out.println(this.name + "の呪文攻撃!!しかしMPが足りない!!");
			return 0;
		} else {
			System.out.println(this.name + "の呪文攻撃!!相手に40のダメージ");
			this.setMp(this.getMp() - 5);
			return 40;
		}
	}

	public int fullPowerMagic() {
		if (mp < 25) {
			System.out.println(this.name + "の全力呪文攻撃!!しかしMPが足りない!!");
			return 0;
		} else {
			System.out.println(this.name + "の全力呪文攻撃!!相手に150のダメージ");
			this.setMp(0);
			return 150;
		}
	}

	public int c() {
		System.out.println(this.name + "&%$#%&&$");
		return 5000000;
	}

	abstract int action();

	public Player(int hp, int mp) {
		super();
		this.hp = hp;
		this.mp = mp;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}
}
