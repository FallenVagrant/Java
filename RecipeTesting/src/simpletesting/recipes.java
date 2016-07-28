package simpletesting;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class recipes {
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		HashMap<String, ArrayList<String>> meals = new HashMap<String, ArrayList<String>>();
		ArrayList<String> ingredients = new ArrayList<String>();

		//Meal name
		System.out.print("Meal name: ");
		String meal = scan.nextLine();
		
		//Ingredient 1
		System.out.print("Ingredient 1 for " + meal + ": ");
		String ingredient = scan.nextLine();
		ingredients.add(ingredient);
		
		//More ingredients
		for(int i = 2; ;i++ ){
			System.out.print("More ingredients? (Y/N): ");
			String more = scan.nextLine();
			if(more.equals("Y") | more.equals("y")){
				System.out.print("Ingredient " + i + ": ");
				ingredient = scan.nextLine();
				ingredients.add(ingredient);
			}
			if(more.equals("N") | more.equals("n")){
				break;
			}
			if(!more.equals("Y") && !more.equals("y") && !more.equals("N") && !more.equals("n")){
				System.out.println("Please enter \"Y\" or \"N\"");
			}
		}
		
				
		//Meal name
		System.out.print("Meal name: ");
		meal = scan.nextLine();
		
		//Ingredient 1
		System.out.print("Ingredient 1 for " + meal + ": ");
		ingredient = scan.nextLine();
		ingredients.add(ingredient);
		
		//More ingredients
		for(int i = 2; ;i++ ){
			System.out.print("More ingredients? (Y/N): ");
			String more = scan.nextLine();
			if(more.equals("Y") | more.equals("y")){
				System.out.print("Ingredient " + i + ": ");
				ingredient = scan.nextLine();
				ingredients.add(ingredient);
			}
			if(more.equals("N") | more.equals("n")){
				break;
			}
			if(!more.equals("Y") && !more.equals("y") && !more.equals("N") && !more.equals("n")){
				System.out.println("Please enter \"Y\" or \"N\"");
			}
		}
		
		scan.close();
		
		//Commit ingredients
		meals.put(meal, ingredients);
		
		//Output
		System.out.println("Meal name: " + meals + "\nIngredients: ");
		String joined = String.join("\n", ingredients);
		System.out.println(joined);
	}
}