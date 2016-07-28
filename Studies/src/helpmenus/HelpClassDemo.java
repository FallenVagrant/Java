package helpmenus;

class Help{
	void helpOn(int what){
		switch(what){
		case '1':
			System.out.println("The if:\n");
			System.out.println("if(condition){\n\tstatement;\n}");
			System.out.println("else{\n\tstatement;\n}");
			break;
		case '2':
			System.out.println("The switch:\n;");
			System.out.println("switch(expression){");
			System.out.println("\tcase constant:");
			System.out.println("\t\tstatement sequence;");
			System.out.println("\t\tbreak;\n}");
			break;
		case '3':
			System.out.println("The for:\n");
			System.out.println("for(init; condition; iteration){");
			System.out.println("\tstatement;\n}");
			break;
		case '4':
			System.out.println("The while:\n");
			System.out.println("while(condition){");
			System.out.println("\nstatement;\n}");
			break;
		case '5':
			System.out.println("The do-while:\n");
			System.out.println("do{");
			System.out.println("\tstatement;");
			System.out.println("}while(condition);");
			break;
		case '6':
			System.out.println("The break:\n");
			System.out.println("break; or break label;");
			break;
		case '7':
			System.out.println("The continue:\n");
			System.out.println("continue; or continue label;");
			break;
		}
		System.out.println();
	}

	void showMenu(){
		System.out.println("Help on:");
		System.out.println(" 1. if");
		System.out.println(" 2. switch");
		System.out.println(" 3. for");
		System.out.println(" 4. while");
		System.out.println(" 5. do-while");
		System.out.println(" 6. break");
		System.out.println(" 7. continue\n");
		System.out.print("Choose one (q to quit): ");
	}
	
	boolean isValid(int ch){
		if(ch < '1' | ch > '7' & ch != 'q'){
			return false;
		}
		else{
			return true;
		}
	}
}

public class HelpClassDemo {
	public static void main(String args[]) throws java.io.IOException{
		char choice, ignore;
		Help hlpobj = new Help();
		
		for(;;){
			do{
				hlpobj.showMenu();
				choice = (char) System.in.read();
				
				do{
					//Clear buffer
					ignore = (char) System.in.read();
				}while(ignore != '\n');
				
			}while(!hlpobj.isValid(choice));

			if(choice == 'q') break;
			
			System.out.println("\n");
			
			hlpobj.helpOn(choice);
		}

	}
}
