package vehicles;

class Vehicle {
	int passengers, fuelcap, mpg;
	
	//Constructor
	Vehicle(int p,int f,int m){
		this.passengers = p;
		this.fuelcap = f;
		this.mpg = m;
	}
	
	private int range(){
		return this.mpg * this.fuelcap;
	}
	
	int getRange(){
		return range();
	}
	
	double fuelneeded(int miles){
		return (double) miles / mpg;
	}
	
}

class VehicleDemo{
	public static void main(String args[]){
		int dist = 252;
		double gallons;
		
		Vehicle minivan = new Vehicle(7, 16, 21);
		Vehicle sportscar = new Vehicle(2, 14, 12);
		
		gallons = minivan.fuelneeded(dist);
		System.out.println("Minivan:\nPassengers: " + minivan.passengers);
		System.out.println("Range: " + minivan.getRange());
		System.out.println("To go " + dist + " miles, minivan needs " + gallons + " gallons");
		
		gallons = sportscar.fuelneeded(dist);
		System.out.println("\nSportscar:\nPassengers: " + sportscar.passengers);
		System.out.println("Range: " + sportscar.getRange());
		System.out.println("To go " + dist + " miles, sportscar needs " + gallons + " gallons");
	}
}