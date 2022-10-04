package course25.lesson02;

class Account {
	String name;		// 口座名義
	String no;			// 口座番号
	long balance;		// 預金残高
	//--- k円預ける ---//
	void deposit(long k) {
		balance += k;
	}
	//--- k円おろす ---//
	void withdraw(long k) {
		balance -= k;
		if(balance < 0) {
			balance = 0;
		}
	}
}

// 銀行口座クラスをテストするクラス
class AccountTester {

	public static void main(String[] args) {
		Account adachi = new Account();		// 足立君の口座
		Account nakata = new Account();		// 仲田君の口座

		adachi.name    = "足立幸一";			// 足立君の口座名義
		adachi.no      = "123456";				// 　〃　の口座番号
		adachi.balance = 1000;						// 　〃　の預金残高

		nakata.name    = "仲田真二";			// 仲田君の口座名義
		nakata.no      = "654321";				// 　〃　の口座番号
		nakata.balance = 200;							// 　〃　の預金残高

		adachi.withdraw(200);						// 足立君が200円おろす
		nakata.deposit(100);						// 仲田君が100円預ける

		System.out.println("■足立君の口座");
		System.out.println("　口座名義：" + adachi.name);
		System.out.println("　口座番号：" + adachi.no);
		System.out.println("　預金残高：" + adachi.balance);

		System.out.println("■仲田君の口座");
		System.out.println("　口座名義：" + nakata.name);
		System.out.println("　口座番号：" + nakata.no);
		System.out.println("　預金残高：" + nakata.balance);
	}
}
