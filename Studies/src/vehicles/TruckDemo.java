package vehicles;

class Truck extends Vehicle{
	private int cargocap;//New instance variable, specific to the Truck class
	Truck(int p, int f, int m, int c){
		super(p, f, m);//Referencing the super (Vehicle) variables
		
		this.cargocap = c;
	}
	
	int getCargo(){
		return this.cargocap;
	}
	
	void putCargo(int c){
		this.cargocap = c;
	}
}

class TruckDemo{
	public static void main(String args[]){
		Truck semi = new Truck(2, 200, 7, 4400);
		Truck pickup = new Truck(3, 28, 15, 2000);
		double gallons;
		int dist = 252;
		
		gallons = semi.fuelneeded(dist);
		System.out.println("Semi:");
		System.out.println("Passengers: " + semi.passengers);
		System.out.println("Range: " + semi.getRange());
		System.out.println("Cargo Capacity: " + semi.getCargo());
		System.out.println("To go " + dist + " miles, Semi needs " + gallons + " "
							+ "gallons of fuel.\n");

		gallons = pickup.fuelneeded(dist);
		System.out.println("Pickup:");
		System.out.println("Passengers: " + pickup.passengers);
		System.out.println("Range: " + pickup.getRange());
		System.out.println("Cargo Capacity: " + pickup.getCargo());
		System.out.println("To go " + dist + " miles, Semi needs " + gallons + " "
							+ "gallons of fuel.\n");
	}
}