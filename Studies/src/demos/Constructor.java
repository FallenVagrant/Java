package demos;

class MyClass{
	int x;
	
	//Constructor
	MyClass(int i){
		x = i;
	}
}

public class Constructor {
	public static void main(String args[]){
		MyClass class1 = new MyClass(10);
		MyClass class2 = new MyClass(88);
		
		System.out.println("Class 1: " + class1.x);
		System.out.println("Class 2: " + class2.x);
	}
}
