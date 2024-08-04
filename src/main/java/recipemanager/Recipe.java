package recipemanager;

import java.util.ArrayList;
import java.util.List;

/* 
 * Madison Zenni
 * Implementation file for the Recipe Class
 */

public class Recipe {
	// field initialization
	private String recipeName;
	private int servings;
	private List<Ingredient> recipeIngredients;
	private double totalRecipeCalories;
	
	/**
	 * Constructor to initialize a recipe with its details
	 * @param name
	 * @param serving
	 * @param ingredients
	 * @param calories
	 */
	public Recipe(String name, int serving, List<Ingredient> ingredients, double calories) {
		this.recipeName = name;
		this.servings = serving;
		this.recipeIngredients = new ArrayList<>(ingredients);
		//this.recipeIngredients = ingredients; 
		this.totalRecipeCalories = calories;
	}
	
	/**
	 * Gets recipe name
	 * @return string
	 */
	public String getRecipeName() {
		return recipeName;
	}
	/**
	 * Sets recipe name to given parameter
	 * @param name
	 */
	public void setRecipeName(String name) {
		this.recipeName = name;
	}
	/**
	 * Gets number of servings
	 * @return int
	 */
	public int getServings() {
		return servings;
	}
	/**
	 * Sets serving to given parameter
	 * @param servings
	 */
	public void setServings(int servings) {
		this.servings = servings; 
	}
	/**
	 * @return ArrayList of type Ingredient
	 */
	public List<Ingredient> getRecipeIngredients() {
		return new ArrayList<>(recipeIngredients);
	}
	/**
	 * Sets recipe ingredients to the given parameter
	 * @param recipeIngredients
	 */
	public void setRecipeIngredients(List<Ingredient> recipeIngredients) {
		this.recipeIngredients = new ArrayList<>(recipeIngredients);
	}
	/**
	 * Gets total calories in recipe
	 * @return double
	 */
	public double getTotalRecipeCalories() {
		return totalRecipeCalories;
	}
	/**
	 * Sets the total recipe calories to the given parameter
	 * @param totalRecipeCalories
	 */
	public void setTotalRecipeCalories(double totalRecipeCalories) {
		this.totalRecipeCalories = totalRecipeCalories;
	}
	/**
	 * Creates a new ingredient using given parameters
	 * 
	 * @param name
	 * @param numberOfCups
	 * @param caloriesPerCup
	 * @param calories
	 * @return Ingredient
	 */
	public Ingredient createNewIngredient(String name, float numberOfCups, int caloriesPerCup, double calories) {
		Ingredient newIngredient = new Ingredient(name, numberOfCups, caloriesPerCup);
		return newIngredient; 
	}
	/**
	 * Calls createFromUserInput from Ingredient class
	 * @return Ingredient
	 */
	public Ingredient addNewIngredient() {
		Ingredient ingredient = Ingredient.createFromUserInput();
		return ingredient; 
		
	}
	/**
	 * Prints recipe information to console
	 */
	public void printRecipe() {
		System.out.printf("%s%n%n", getRecipeName());
		System.out.printf("\tServing Size: %d%n", getServings());
		System.out.printf("\tTotal Calories: %.2f%n", getTotalRecipeCalories());
		System.out.println("\tIngredient List:");
		List<Ingredient> ingredients = getRecipeIngredients();
		for(Ingredient ingredient : ingredients) {
			System.out.printf("\t\t-%s%n", ingredient.toString());
			}
		}
}
