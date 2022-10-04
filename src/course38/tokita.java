package course38;

public class tokita extends Player {

	public tokita(int hp, int mp) {
		super(hp, mp);
		this.name = "勇者ヨシヒコ";
	}

	@Override
	public int action() {
		if (this.getHp() >= 150) {
			return this.strongAttack();
		} else if (this.getMp() >= 26) {
			return this.magic();
		} else if (this.getMp() >= 25) {
			return this.fullPowerMagic();
		} else if (this.getHp() >= 40) {
			return this.strongAttack();
		} else {
			return this.weakAttack();
		}
	}
}
