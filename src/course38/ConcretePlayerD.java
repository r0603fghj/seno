package course38;

public class ConcretePlayerD extends Player{

    public ConcretePlayerD(int hp, int mp) {
        super(hp, mp);
        this.name = "いしはま";
    }

    @Override
    public int action() {
    	if(this.getMp() > 29) {
    		return this.magic();
    	}else if(this.getMp() >= 25) {
        	return this.fullPowerMagic();
        }else if(this.getHp() * 0.3 > 5) {
        	return this.strongAttack();
        }else {
        	return this.weakAttack();
        }
    }
}
