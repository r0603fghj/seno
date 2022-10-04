package course38;

public class abc2 extends Player {

	public abc2(int hp, int mp) {
		super(hp, mp);
		this.name = "ああああ";
	}

	@Override
	public int action() {
		if (this.getMp() >= 25) {
			return this.fullPowerMagic();

		} else {
			return this.strongAttack();
		}
	}
}
