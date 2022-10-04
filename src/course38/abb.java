package course38;

public class abb extends Player {

	public abb(int hp, int mp) {
		super(hp, mp);
		this.name = "abb";
	}

	public int action() {
		if (this.getMp() > 25) {
			return this.fullPowerMagic();
		}
		if (this.getHp() * 0.3 >= 11) {
			return this.strongAttack();
		} else if (this.getMp() > 25) {
			return this.magic();
		} else if (this.getMp() >= 25) {
			return this.fullPowerMagic();
		} else {
			return this.weakAttack();
		}

	}
}