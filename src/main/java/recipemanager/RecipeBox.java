package recipemanager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
 * Madison Zenni
 * Implementation file for the RecipeBox Class, contains the main method
 */

public class RecipeBox {
	
	private ArrayList<Recipe> listOfRecipes;  // Create the list of recipes
	
	/**
	 * Main method is the program's entry point
	 * @param args
	 */
	public static void main(String[] args) {
		// Create an instance of the recipe box
		RecipeBox recipeBox = new RecipeBox();
		Scanner scanner = new Scanner(System.in);
		
		// Declare ingredient list
	    List<Ingredient> meatloafIngredient = new ArrayList<>();

	    // Add ingredient to the list
	    // public Ingredient(String nameOfIngredient, float numberOfCups, int numberOfCaloriesPerCup, double totalCalories){
	    meatloafIngredient.add(new Ingredient("ground beef", 5.0f, 450));
		meatloafIngredient.add(new Ingredient("tomato sauce", 8.0f, 120));
		meatloafIngredient.add(new Ingredient("garlic", 0.10f, 85));
		meatloafIngredient.add(new Ingredient("onion", 2.0f, 55));
		
		// Recipe instance
		Recipe momsMeatloaf = new Recipe("Mom's Meatloaf", 4, meatloafIngredient, 672.3); 
		// Add recipe to recipeBox
		recipeBox.addRecipe(momsMeatloaf); 
		
		// Declare ingredient list
	    List<Ingredient> pancakeIngredient = new ArrayList<>();

	    // Add ingredient to the list
	    pancakeIngredient.add(new Ingredient("milk", 3.0f, 120));
	    pancakeIngredient.add(new Ingredient("butter", 0.50f, 250));
	    pancakeIngredient.add(new Ingredient("egg", 1.0f, 90));
	    pancakeIngredient.add(new Ingredient("flour", 2.0f, 190));
	    pancakeIngredient.add(new Ingredient("sugar", 1.5f, 350));
	    pancakeIngredient.add(new Ingredient("maple syrup", 0.25f, 450));
		
		// Recipe instance
		Recipe pancakeRecipe = new Recipe("Pancakes", 2, pancakeIngredient, 854.3); 
		// Add recipe to recipeBox
		recipeBox.addRecipe(pancakeRecipe);
		
		// Declare ingredient list
	    List<Ingredient> pbjIngredient = new ArrayList<>();

	    // Add ingredient to the list
	    pbjIngredient.add(new Ingredient("bread", 2.0f, 120));
	    pbjIngredient.add(new Ingredient("strawberry jam", 0.75f, 90));
	    pbjIngredient.add(new Ingredient("peanut butter", 0.75f, 140));
		
		// Recipe instance
		Recipe pbjRecipe = new Recipe("Peanut Butter and Jelly", 1, pbjIngredient, 250); 
		// Add recipe to recipeBox
		recipeBox.addRecipe(pbjRecipe);
		
		// Welcome message
		System.out.println("Welcome to our recipe box");
		
		// initialize option for print menu 
		int option = 0;
		
		MyMethods myMethods = new MyMethods();
		//Recipe recipe = new Recipe(); 
		while(option != 5) {
			option = printMenu(myMethods);
			if(option == 1) {
				recipeBox.printRecipeNames(recipeBox);
			}
			else if(option == 2) {
				//System.out.println("Print all recipe details called.");
				recipeBox.printRecipeDetails(recipeBox); 
			}
			else if(option == 3) {
				//System.out.println("Add recipe called.");
				recipeBox.createRecipe(myMethods, scanner);
			}
			else if(option == 4) {
				System.out.println("Remove recipe called.");
				recipeBox.removeRecipe(recipeBox, myMethods);
			}
		}
		System.out.println("\nClosing the recipe box. See you again soon!");
		scanner.close(); 
	}
	
	/**
	 * Removes recipe from list
	 * @param recipeBox
	 * @param myMethods
	 */
	private void removeRecipe(RecipeBox recipeBox, MyMethods myMethods) {
		// Check the list contains recipes to prevent errors 
		if(recipeBox.listOfRecipes.size() < 1) {
			System.out.println("Oops. You don't have any recipes. Enter a recipe to continue.");
			return;
		}
		// Print recipe list, prompt user for selection, remove from list
		printRecipeNames(recipeBox);
		int count = recipeBox.listOfRecipes.size(); 	// number of recipes
		int selection = myMethods.readInteger("Enter the recipe to remove", 1, count);
		listOfRecipes.remove(selection - 1); 
		System.out.println("The recipe has been removed from the recipe box.");
		
	}

	/**
	 * Prompts user for information to create new recipe
	 * @param myMethods
	 * @param scanner
	 */
	public void createRecipe(MyMethods myMethods, Scanner scanner) {
		System.out.print("Enter Recipe Name: ");
		String name = scanner.nextLine();
		int servings = myMethods.readInteger("Enter serving size");
		double calories = myMethods.readDouble("Enter total calories");
		int numberOfIngredients = myMethods.readInteger("Enter the total number of ingredients");
		List<Ingredient> ingredientList = new ArrayList<Ingredient>(); 
		for (int i = 0; i < numberOfIngredients; i++) {
			System.out.printf("\nINGREDIENT %d", i+1);
			Ingredient ingredient = Ingredient.createFromUserInput();
			ingredientList.add(ingredient); 
		}
		Recipe recipe = new Recipe(name, servings, ingredientList, calories); 
		addRecipe(recipe); 
		System.out.printf("\n%s has been successfully added to the recipe box.\n", name); 
	}
	/**
	 * Adds recipe to list of recipe
	 * @param recipe
	 */
	public void addRecipe(Recipe recipe) {
		listOfRecipes.add(recipe); 	
	}

	
	/**
	 * Constructors
	 * RecipeBox() takes no arguments and will initialize the list of recipes
	 */
	public RecipeBox() {
		this.listOfRecipes = new ArrayList<>(); 
	}
	
	
	/**
	 * RecipeBox(ArrayList) takes the existing list of recipes as a parameter and initializes the list of recipes with it
	 * @param listOfRecipes
	 */
	public RecipeBox(ArrayList<Recipe> listOfRecipes) {
		this.listOfRecipes = listOfRecipes; 
	}
	
	// Getters and Setters
	/**
	 * gets List of Recipes
	 * @return List<Recipe>
	 */
	public List<Recipe> getListOfRecipes(){
				return listOfRecipes;
			}
	/**
	 * Sets recipe list to array list
	 * @param listOfRecipes
	 */
	public void setListOfRecipes(List<Recipe> listOfRecipes) {
				this.listOfRecipes = new ArrayList<>(listOfRecipes);
			}

	public static int printMenu(MyMethods myMethods) {
		System.out.println("Please choose from the following options:\n");
		System.out.println("\t1. Print all recipe names");
		System.out.println("\t2. Print all recipe details");
		System.out.println("\t3. Add a new recipe");
		System.out.println("\t4. Remove a recipe");
		System.out.println("\t5. Exit program\n");	
		return myMethods.readInteger("Enter your selection", 1, 5);
	}
	
	/**
	 * Prints recipe names
	 * @param recipeBox
	 */
	public void printRecipeNames(RecipeBox recipeBox) {
		if(recipeBox.listOfRecipes.size() < 1) {
			System.out.println("Oops. You don't have any recipes. Enter a recipe to continue.");
			return;
		}
		System.out.println("Here is your recipe list:\n");
		int i = 1; 
		for(Recipe recipe : listOfRecipes) {
			System.out.printf("\t%d.) %s%n", i++, recipe.getRecipeName());
		}
		System.out.println(); 
	}
	
	/**
	 * Prints recipe information
	 * @param recipeBox
	 */
	public void printRecipeDetails(RecipeBox recipeBox) {
		if(recipeBox.listOfRecipes.size() < 1) {
			System.out.println("Oops. You don't have any recipes. Enter a recipe to continue.");
			return;
		}
		System.out.println("Here is your recipe details:");
		int i = 1; 
		
		for(Recipe recipe : listOfRecipes) {
			System.out.println(); 

			System.out.printf("Recipe %d: ", i++);
			
			recipe.printRecipe(); 
			
		}
		System.out.println(); 
	}
		

}
