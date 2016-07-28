package helpmenus;

public class Help1 {
	public static void main(String args[])throws java.io.IOException{
		char choice;
		
		System.out.println("Help on:");
		System.out.println(" 1. if");
		System.out.println(" 2. switch");
		
		choice = (char) System.in.read();
		
		System.out.println("\n");
		
		switch(choice){
		case '1':
			System.out.println("The if:\n");
			System.out.println("if(condition){\n\tstatement\n};");
			break;
		case '2':
			System.out.println("The switch:\n;");
			System.out.println("switch(expression){");
			System.out.println("\tcase constant:");
			System.out.println("\t\tstatement sequence;");
			System.out.println("\t\tbreak;\n}");
			break;
			default:
				System.out.println("Selection not found");
		}
	}
}
