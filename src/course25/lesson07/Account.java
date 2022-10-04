package course25.lesson07;

class Account {
	private String name;		// 口座名義
	private String no;			// 口座番号
	private long balance;		// 預金残高

	Account(){
		name = "";
		no = "";
		balance = 0;
	}
	Account(String name, String no, long balance) {
		this.name = name;				// 口座名義
		this.no = no;				// 口座番号
		this.balance = balance;		// 預金残高
	}
	String getName() {
		return name;
	}
	String getNo() {
		return no;
	}
	long getBalance() {
		return balance;
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

