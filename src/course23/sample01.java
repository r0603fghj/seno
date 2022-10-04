package course23;

class Chara {
	String name;
	String seibetu;
	String lever;
	long HP;
	long MP;
	long exp;
}

public class sample01 {

	public static void main(String[] args) {
		Chara risupoa = new Chara();

		risupoa.name = "りすぽあ";
		risupoa.seibetu = "男";
		risupoa.lever = "１２";
		risupoa.HP = 1000;
		risupoa.MP = 50000;
		risupoa.exp = 14222;

		System.out.println("■ステイタス");
		System.out.println("　名前：" + risupoa.name);
		System.out.println("　性別：" + risupoa.seibetu);
		System.out.println("　レベル：" + risupoa.lever);
		System.out.println("　HP：" + risupoa.HP);
		System.out.println("　MP：" + risupoa.MP);
		System.out.println("　EXP：" + risupoa.exp);

	}

}