package demos;

public class Modulus {
	static void separate(){
		System.out.println("--------------------------------------------");
	}
	public static void main(String args[]){
		int x = 17, y = 3,//Edit these if you want
			z, rem;
		
		z = (x / y);
		rem = x - (z * y);
		separate();
		System.out.println("How modulus works:\n"
							+ "x / y = z  -> " + x + " / " + y + " = " + z
							+ "\nx - (z * y) = remainder -> "
							+ x + " - (" + z + " * " + y + ") = " + rem);
		separate();
		System.out.println("Example: " + x + " % " + y + " = " + rem);
	}
}
