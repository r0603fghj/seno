package course38;

public class abc extends Player {

	public abc(int hp, int mp) {
		super(hp, mp);
		this.name = "ああああ";
	}

	@Override
	public int action() {
		if (this.getHp() >= 150) {
			return this.strongAttack();
		} else if (this.getMp() >= 29) {
			return this.magic();
		} else if (this.getMp() >= 25) {
			return this.fullPowerMagic();
		} else {
			return this.c();
		}
	}
}