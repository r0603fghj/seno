package course25.lesson08.sub;

public class Account {
	private String name;		// 口座名義
	private String no;			// 口座番号
	private long balance;		// 預金残高

	public Account(){
		name = "";
		no = "";
		balance = 0;
	}
	public Account(String name, String no, long balance) {
		this.name = name;				// 口座名義
		this.no = no;				// 口座番号
		this.balance = balance;		// 預金残高
	}
	public String getName() {
		return name;
	}
	public String getNo() {
		return no;
	}
	public long getBalance() {
		return balance;
	}
	//--- k円預ける ---//
	public void deposit(long k) {
		balance += k;
	}
	//--- k円おろす ---//
	public void withdraw(long k) {
		balance -= k;
		if(balance < 0) {
			balance = 0;
		}
	}
}

