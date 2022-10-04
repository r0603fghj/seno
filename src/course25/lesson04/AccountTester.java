package course25.lesson04;

class Account {
	String name;		// 口座名義
	String no;			// 口座番号
	long balance;		// 預金残高

	Account(){
		name = "";
		no = "";
		balance = 0;
	}
	Account(String n, String num, long z) {
		name = n;				// 口座名義
		no = num;				// 口座番号
		balance = z;		// 預金残高
	}
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
		Account adachi = new Account("足立幸一", "123456", 1000);		// 足立君の口座
		Account nakata = new Account("仲田真二", "654321", 200);		// 仲田君の口座

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
