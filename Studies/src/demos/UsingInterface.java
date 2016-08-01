package demos;

class Series implements Interface {
	int start;
	int val;
	
	
	Series(){
		start = 0;
		val = 0;
	}
	
	public int getNext() {
		val += 2;
		return val;
	}

	public void reset() {
		val = start;
	}

	
	public void setStart(int x) {
		start = x;
		val = x;
	}
}

class UsingInterface{
	public static void main(String args[]){
		Series series = new Series();
		Interface ob;//Interface reference
		
		ob = series;//Access object via an interface reference 
		
		for(int i = 0; i < 5; i++){
			System.out.println("Next value is " + ob.getNext());
		}
		
		System.out.println("\nResetting...");
		ob.reset();
		
		for(int i = 0; i < 5; i++){
			System.out.println("Next value is " + ob.getNext());
		}
		
		System.out.println("\nStarting at 100");
		ob.setStart(100);
		for(int i = 0; i < 5; i++){
			System.out.println("Next value is " + ob.getNext());
		}
	}
}