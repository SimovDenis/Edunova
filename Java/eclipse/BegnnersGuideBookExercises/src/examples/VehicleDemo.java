package examples;

public class VehicleDemo {

	public static void main(String[] args) {

		Vehicle minivan = new Vehicle(7, 16, 21);
		Vehicle sportscar = new Vehicle(2, 14, 12);
		
		System.out.println("Minivan can carry " + minivan.getPassengers() + 
				" passengers with a range of " + minivan.range());
		
		System.out.println("Sportscar can carry " + sportscar.getPassengers() + 
				" passengers with a range of " + sportscar.range());

	}
}
