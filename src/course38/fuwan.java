package course38;

public class fuwan extends Player {

	public fuwan(int hp, int mp) {
		super(hp, mp);
		this.name = "ふわんだりぃず";
	}

	@Override
	public int action() {
		if (this.getHp() >= 90) {
			return this.strongAttack();
		} else if (this.getMp() >= 25) {
			return this.fullPowerMagic();
		} else {
			return this.weakAttack();
		}
	}
}