package course32.lesson01;

class Vehicle {
	// メンバ変数
	protected String driverName;
	protected double gasoline;
	protected int position;

	//コンストラクタ
	public Vehicle() {
		this.driverName = "XXX";
		this.gasoline = 50.0;
		this.position = 0;
	}

	public Vehicle(String driverName, double gasoline) {
		this.driverName = driverName;
		this.gasoline = gasoline;
		this.position = 0;
	}

	//メンバ関数
	public void display() {
		System.out.println("■" + this.getClass().getSimpleName());
		System.out.println("運転手:" + this.driverName);
		System.out.println("残り燃料:" + this.gasoline);
		System.out.println("現在地:" + this.position);
	}
}

class Car extends Vehicle {

	public Car(String driverName, double gasoline, int runHour) {
		super(driverName, gasoline);
		this.runHour = runHour;
	}

	public int runHour;

	public void run() {
		System.out.println(this.runHour + "時間走りました");

		this.gasoline -= 10;
		this.position += 30;
	}

	public void display() {
		super.display();
		System.out.println(this.runHour);
	}
}

class VehicleTester {
	public static void main(String[] args) {
		Vehicle ve = new Vehicle("AAA", 30.0);
		ve.display();

		Car car = new Car("BBB", 50.0, 0);

		Vehicle[] vList = { ve, car };
		for (int i = 0; i < vList.length; i++) {
			vList[i].display();
		}
		//多層性(ポリモーフィズム)
		//①型が親クラスであっても、実体が子クラスの場合、上書きされたメソッドが呼ばれる。
		//②型が親クラスの場合、子クラスで新たに定義した変数やメソッドは呼び出せない。

	}
}
