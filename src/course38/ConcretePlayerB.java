package course38;

import java.util.Random;

public class ConcretePlayerB extends Player{

    public ConcretePlayerB(int hp, int mp) {
        super(hp, mp);
        this.name = "hoge";
    }

    @Override
    public int action() {
        Random r = new Random();
        int x = r.nextInt(3);
        switch(x) {
        case 0:
            return this.weakAttack();
        case 1:
            return this.strongAttack();
        case 2:
            return this.magic();
        default:
            return this.weakAttack();
        }
    }
}
