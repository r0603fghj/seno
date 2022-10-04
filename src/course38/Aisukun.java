package course38;

public class Aisukun extends Player{

    public Aisukun(int hp, int mp) {
        super(hp, mp);
        this.name = "アイスクン";
    }

    @Override
    public int action() {

    	if(this.getHp() <= 20 && this.getMp() < 5) {
    		return this.strongAttack();
    	}

    	if(this.getMp() >= 10 && this.getHp() <= 150) {
    		if(this.getMp() >= 30 && this.getHp() <= 150) {
    			return this.fullPowerMagic();
    		}
    		else {
    		return this.magic();
    		}
    	}
    	else if(this.getHp() >= 150) {
    		return this.strongAttack();
    	}
    	else {

    		return this.weakAttack();
    	}



    }
}
