package course38;

public class watanabe extends Player {

	public watanabe(int hp, int mp) {
		super(hp, mp);
		this.name = "わたなべぇ";
	}

	@Override
	public int action() {
		if (this.getHp() > 200) {
			return this.strongAttack();
		} else if (this.getMp() > 25) {
			return this.magic();

		} else if (this.getMp() >= 25) {
			return this.fullPowerMagic();
		} else {
			return this.strongAttack();
		}
	}
}
