package course38;

import java.util.Random;

public interface Battle {
	public static void main(String[] args) {
		Player p1 = new Makemasita(300, 30);
		Player p2 = new abc(300, 30);
		Random r = new Random();
		boolean b = r.nextBoolean();

		Player[] players;
		if (b) {
			players = new Player[] { p1, p2 };
		} else {
			players = new Player[] { p2, p1 };
		}

		int count = 0;
		while (true) {
			Player pa = players[0];
			Player pb = players[1];
			int damage1 = pa.action();
			pb.setHp(pb.getHp() - damage1);
			if (pb.getHp() <= 0) {
				System.out.println(pa.getName() + "の勝ちです!!");
				break;
			}
			int damage2 = pb.action();
			pa.setHp(pa.getHp() - damage2);
			if (pa.getHp() <= 0) {
				System.out.println(pb.getName() + "の勝ちです!!");
				break;
			}
			count++;
			System.out.println("==== " + count + "ターン目終了 ====");
			for (int i = 0; i < 2; i++) {
				System.out.println(players[i].getName() +
						" : HP(" + players[i].getHp() +
						"), MP(" + players[i].getMp() + ")");
			}
			System.out.println("========================");

		}
		System.out.println("==== 最終結果 ==========");
		for (int i = 0; i < 2; i++) {
			System.out.println(players[i].getName() +
					" : HP(" + players[i].getHp() +
					"), MP(" + players[i].getMp() + ")");
		}
	}
}
