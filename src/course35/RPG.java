package course35;

public class RPG {

	public static void main(String[] args) {
		Player player = new Player(1000, 100);
		System.out.println(player.action());

		SwordFighter SwordFighter1 = new SwordFighter(1000, 200);
		System.out.println(SwordFighter1.action());

		Mage mage1 = new Mage(1000, 100, 300, 4000);
		System.out.println(mage1.action());

		System.out.println(player.action() + SwordFighter1.action() + mage1.action());

		int enemyHP = 10000;
		System.out.println(enemyHP - (player.action() + SwordFighter1.action() + mage1.action()));

		int n = (enemyHP - (player.action() + SwordFighter1.action() + mage1.action()));
		int sum = 0;

		for (int i = 0; i <= n; i++)
			System.out.println(i);
		if (sum + n <= 0) {
			System.out.println("戦闘終了");

		}
	}
}
