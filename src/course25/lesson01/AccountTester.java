package course25.lesson01;

// 銀行口座クラス【第１版】とそれをテストするクラス

// 銀行口座クラス【第１版】
class Account {
	private String name; // 口座名義
	private String no; // 口座番号
	private long balance;

	Account() {
		name = "";
		no = "";
		balance = 0;

	}

	Account(String name, String no, long balance) {
		this.name = name;
		this.no = no;
		this.balance = balance;
	}

	void deposit(long k) {
		balance += k;
	} // 預金残高

	void withdraw(long k) {
		balance -= k;

		if (balance < 0) {
			balance = 0;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}

}

// 銀行口座クラスをテストするクラス
class AccountTester {

	public static void main(String[] args) {
		Account adachi = new Account("足立幸一", "123456", 1000); // 足立君の口座
		Account nakata = new Account("仲田真二", "654321", 200); // 仲田君の口座
		adachi.setNo("99999999");

		adachi.withdraw(200);// 足立君が200円おろす
		nakata.deposit(100);// 仲田君が100円預ける							

		System.out.println("■足立君の口座");
		System.out.println("　口座名義：" + adachi.getName());
		System.out.println("　口座番号：" + adachi.getNo());
		System.out.println("　預金残高：" + adachi.getBalance());

		System.out.println("■仲田君の口座");
		System.out.println("　口座名義：" + nakata.getName());
		System.out.println("　口座番号：" + nakata.getNo());
		System.out.println("　預金残高：" + nakata.getBalance());
	}
}
