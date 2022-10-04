package course23;

class Car {
	String vehicleType;
	double maxSpeed;
	int weight;
}

class CarTester {

	public static void main(String[] args) {
		Car kuruma = new Car();
		Car kuruma2 = new Car();

		kuruma.vehicleType = "スイフト";
		kuruma.maxSpeed = 135.0;
		kuruma.weight = 870;

		kuruma2.vehicleType = "ヴェゼル";
		kuruma2.maxSpeed = 160.0;
		kuruma2.weight = 1280;

		System.out.println("■kuruma");
		System.out.println("スイフト" + kuruma.vehicleType);
		System.out.println("最高速度" + kuruma.maxSpeed);
		System.out.println("車体重量" + kuruma.weight);

		System.out.println("■kuruma2");
		System.out.println("スイフト" + kuruma2.vehicleType);
		System.out.println("最高速度" + kuruma2.maxSpeed);
		System.out.println("車体重量" + kuruma2.weight);

	}
}
