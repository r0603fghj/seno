package course38;

public class CplayerA extends Player {

	public CplayerA(int hp, int mp) {
		super(hp, mp);
		this.name = "とり";
	}

	@Override
	public int action() {
		if (this.getHp() * 0.3 > 40) {
			return this.strongAttack();
		} else if (this.getMp() == 25) {
			return this.fullPowerMagic();
		} else if (this.getMp() >= 5) {
			return this.magic();
		} else {
			return this.weakAttack();
		}
	}
}
