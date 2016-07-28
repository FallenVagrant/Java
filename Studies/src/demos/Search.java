package demos;

import java.util.concurrent.TimeUnit;

class Search{
	public static void main(String args[]) throws InterruptedException{
		int nums[] = {1, 34, 56, 7, 342, 345, 25, 67, 4, 6, 8, 73};
		int value = 25;
		boolean found = false;
		
		System.out.println("Looking for the number " + value + "...");
		
		for(int x : nums){
			System.out.println("Value: " + x);
			if(x == value){
				found = true;
				break;
			}
			TimeUnit.SECONDS.sleep(1);
		}
		if(found){
			System.out.println("Value Found!");
		}
	}
}
