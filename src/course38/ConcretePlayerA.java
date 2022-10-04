package course38;

public class ConcretePlayerA extends Player{

    public ConcretePlayerA(int hp, int mp) {
        super(hp, mp);
        this.name = "はむはむ";
    }

    @Override
    public int action() {
        return this.weakAttack();
    }
}
