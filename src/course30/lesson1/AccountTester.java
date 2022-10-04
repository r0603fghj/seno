package course30.lesson1;

// 銀行口座クラス【第３版】の利用例

class AccountTester {

	public static void main(String[] args) {

		Account adachi = new Account("足立幸一", "123456", 1000, 1);
		Account nakata = new Account("仲田真二", "654321",  200, 2);

		System.out.println("■足立君の口座");
		System.out.println("　口座名義：" + adachi.getName());
		System.out.println("　口座番号：" + adachi.getNo());
		System.out.println("　預金残高：" + adachi.getBalance());
		System.out.println("　識別番号：" + adachi.getId());

		System.out.println("■仲田君の口座");
		System.out.println("　口座名義：" + nakata.getName());
		System.out.println("　口座番号：" + nakata.getNo());
		System.out.println("　預金残高：" + nakata.getBalance());
		System.out.println("　識別番号：" + nakata.getId());

		//足立さんから中田さんへ送金
		adachi.withdraw(500);
		nakata.deposit(500);

		System.out.println();

		System.out.println("■足立君の口座");
		System.out.println("　預金残高：" + adachi.getBalance());

		System.out.println("■仲田君の口座");
		System.out.println("　預金残高：" + nakata.getBalance());

		System.out.println(Account.counter);
		Account.counter++;
		System.out.println(Account.counter);
	}
}
