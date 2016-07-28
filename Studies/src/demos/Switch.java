package demos;

public class Switch {
	public static void main(String args[]){
		int i;
		
		for(i = 0; i < 10; i++){
			switch(i){
			case 0:
				System.out.println("i is zero: " + i);
				break;
			case 1:
				System.out.println("i is one: " + i);
				break;
			case 2:
				System.out.println("i is two: " + i);
				break;
			case 3:
				System.out.println("i is three: " + i);
				break;
			case 4:
				System.out.println("i is four: " + i);
				break;
			default:
				System.out.println("i is five or more: " + i);
			}
		}
	}

}
