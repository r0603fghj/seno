package course32.lesson05_02;

class Vehicle{
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

class Car extends Vehicle{
    private int runHour;

    public Car(String driverName, double gasoline, int runHour) {
        super(driverName, gasoline);
        this.runHour = runHour;
    }
	public void run() {
	    System.out.println("==" + this.runHour +"時間走りました==");
		this.gasoline -= 5.0;
		this.position += 60;
	}
}

class VehicleTester {
	public static void main(String[] args) {
		Vehicle ve = new Vehicle("AAA", 30.0);
		ve.display();

		Car car = new Car("BBB", 50.0, 1);
		car.display();
		car.run();
		car.display();
	}
}
