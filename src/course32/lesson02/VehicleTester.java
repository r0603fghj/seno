package course32.lesson02;

class Vehicle{
	// メンバ変数
	public String driverName;
	public double gasoline;
	public int position;

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

}

class VehicleTester {
	public static void main(String[] args) {
		Vehicle ve = new Vehicle("AAA", 30.0);
		ve.display();

		Car car = new Car();
		car.display();
	}
}
