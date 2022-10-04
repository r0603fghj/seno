package course33;

public class Car {
	private double gas;
	private int speed;

	public Car() {
		this.gas = 40.0;
		this.speed = 30;
	}

	public double getGas() {
		return gas;
	}

	public int drive() {
		gas -= 1.0;
		return speed;
	}
}

class SuperCar extends Car {
	public int tarbospeed;

}
