package course25.sub2;

public class Car {
	private String vehicleType; //車種
	private double maxSpeed; //最高時速
	private int weight; //車体重量
	private double gasoline; //ガソリン残量

	public Car(String vehicleType, double maxSpeed, int weight, double gasoline) {
		super();
		this.vehicleType = vehicleType;
		this.maxSpeed = maxSpeed;
		this.weight = weight;
		this.gasoline = gasoline;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public double getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(double maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public double getGasoline() {
		return gasoline;
	}

	public void setGasoline(double gasoline) {
		this.gasoline = gasoline;
	}

}