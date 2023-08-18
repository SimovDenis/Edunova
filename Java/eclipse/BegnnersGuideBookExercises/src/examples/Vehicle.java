package examples;

public class Vehicle {
	
	int passengers;
	int fuelcap;
	int mpg;
	
	public Vehicle(int p, int f, int m) {
		this.passengers = p;
		this.fuelcap = f;
		mpg = m;
	}
	
	public int getPassengers() {
		return passengers;
	}
	public void setPassengers(int passengers) {
		this.passengers = passengers;
	}
	public int getFuelcap() {
		return fuelcap;
	}
	public void setFuelcap(int fuelcap) {
		this.fuelcap = fuelcap;
	}
	public int getMpg() {
		return mpg;
	}
	public void setMpg(int mpg) {
		this.mpg = mpg;
	}
	
	int range() {
		return fuelcap * mpg;
	}
	
	double fuelNeeded(int miles) {
		return (double) miles/mpg;
	}

}

