package course38;

public class Makemasita extends Player{

    public Makemasita(int hp, int mp) {
        super(hp, mp);
        this.name = "相手";
    }

    @Override
    public int action() {
    	 if(this.getHp() >= 150) {
         	return this.strongAttack();
         }else if(this.getMp() > 29) {
     		return this.magic();
     	}else if(this.getMp() >= 10) {
         	return this.fullPowerMagic();
     	}else {
         	return this.weakAttack();
    }
}
}