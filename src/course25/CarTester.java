package course25;

import course25.sub2.Car;

class CarTester {
	public static void main(String[] args) {
		Car car1 = new Car("スイフト", 135.0, 870, 30.0);
		Car car2 = new Car("ヴェゼル", 160.0, 1280, 35.0);

		System.out.println("■車1の情報");
		System.out.println("　車種:" + car1.getVehicleType());
		System.out.println("　最高時速:" + car1.getMaxSpeed());
		System.out.println("　車体重量:" + car1.getWeight());
		System.out.println("　ガソリン残量:" + car1.getGasoline());

		System.out.println("■車2の情報");
		System.out.println("　車種:" + car2.getVehicleType());
		System.out.println("　最高時速:" + car2.getMaxSpeed());
		System.out.println("　車体重量:" + car2.getWeight());
		System.out.println("　ガソリン残量:" + car2.getGasoline());

		//ガソリンの残量を変更
		car1.setGasoline(car1.getGasoline() + 30.0);
		car1.setGasoline(car2.getGasoline() - 40.0);
		//最高速度を変更
		car1.setMaxSpeed(120.0);
		car2.setMaxSpeed(180.0);

		System.out.println("■" + car1.getVehicleType());
		System.out.println("　ガソリン残量:" + car1.getGasoline());
		System.out.println("　最高速度:" + car1.getMaxSpeed());
		System.out.println("■" + car2.getVehicleType());
		System.out.println("　ガソリン残量:" + car2.getGasoline());
		System.out.println("　最高速度:" + car2.getMaxSpeed());
	}
}
