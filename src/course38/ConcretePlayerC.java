package course38;

public class ConcretePlayerC extends Player{

    public ConcretePlayerC(int hp, int mp) {
        super(hp, mp);
        this.name = "いしはま";
    }

    @Override
    public int action() {
        if(this.getHp() >= 80) {
        	return this.strongAttack();
        }else if(this.getMp() >= 10) {
        	return this.magic();
        }else {
        	return this.weakAttack();
        }
    }
}
