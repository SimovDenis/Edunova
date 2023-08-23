package examples;

public class CompFuel {
	
	public static void main(String[] args) {
		
		Vehicle minivan = new Vehicle(7, 16, 21);
		Vehicle sportscar = new Vehicle(2, 14, 12);
		
		int dist = 252;
		
		System.out.println("To go " + dist + " miles minivan needs " + minivan.fuelNeeded(dist) + 
				" gallons of fuel.");
		
		System.out.println("To go " + dist + " miles minivan needs " + sportscar.fuelNeeded(dist) + 
				" gallons of fuel.");
		
	}

}
