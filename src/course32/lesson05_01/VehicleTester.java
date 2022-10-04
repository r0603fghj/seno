package course32.lesson05_01;

class Vehicle{
	// メンバ変数
	private String driverName;
	private double gasoline;
	private int position;

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
	//getter,setter
	public String getDriverName() {
		return driverName;
	}
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	public double getGasoline() {
		return gasoline;
	}
	public void setGasoline(double gasoline) {
		this.gasoline = gasoline;
	}
	public int getPosition() {
		return position;
	}
	public void setPosition(int position) {
		this.position = position;
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
		this.setGasoline(this.getGasoline()-5.0);
		this.setPosition(this.getPosition()+60);
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
