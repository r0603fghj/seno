package course38;

public class abbc extends Player {

	public abbc(int hp, int mp) {
		super(hp, mp);
		this.name = "abc";
	}

	public int action() {
		if (this.getMp() > 25) {
			return this.fullPowerMagic();
		} else if (this.getHp() * 0.3 >= 19) {
			return this.strongAttack();
		} else if (this.getMp() >= 30) {
			return this.magic();
		} else if (this.getHp() * 0.3 >= 18) {
			return this.strongAttack();
		} else {
			return this.weakAttack();
		}

	}
}