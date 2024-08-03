package recipemanager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Recipe {
	// data members
	private String recipeName;
	private int servings;
	private List<Ingredient> recipeIngredients;
	private double totalRecipeCalories;
	
	// Constructor
	public Recipe(String name, int serving, List<Ingredient> ingredients, double calories) {
		this.recipeName = name;
		this.servings = serving;
		//this.recipeIngredients = new ArrayList<String>();
		this.recipeIngredients = ingredients; 
		this.totalRecipeCalories = calories;
	}
	Scanner scanner = new Scanner(System.in);
	MyMethods myMethods = new MyMethods();
	// Getters and Setters
	public String getRecipeName() {
		return recipeName;
	}
	public void setRecipeName(String name) {
		this.recipeName = name;
	}
	public int getServings() {
		return servings;
	}
	public void setServings(int servings) {
		this.servings = servings; 
	}
	public List<Ingredient> getRecipeIngredients() {
		return new ArrayList<>(recipeIngredients);
		//return recipeIngredients;
	}
	public void setRecipeIngredients(List<Ingredient> recipeIngredients) {
		this.recipeIngredients = new ArrayList<>(recipeIngredients);
	}
	public double getTotalRecipeCalories() {
		return totalRecipeCalories;
	}
	public void setTotalRecipeCalories(double totalRecipeCalories) {
		this.totalRecipeCalories = totalRecipeCalories;
	}
	public Ingredient createNewIngredient(String name, float numberOfCups, int caloriesPerCup, double calories) {
		Ingredient newIngredient = new Ingredient(name, numberOfCups, caloriesPerCup);
		return newIngredient; 
	}
	public Ingredient addNewIngredient() {
		Ingredient ingredient = Ingredient.createFromUserInput();
		return ingredient; 
		
	}
	public void printRecipe() {
		//System.out.println("Here is your recipe details:\n");
		//int i = 1; 
		//for(Recipe recipe : listOfRecipes) {
		System.out.printf("%s%n%n", getRecipeName());
		System.out.printf("\tServing Size: %d%n", getServings());
		System.out.printf("\tTotal Calories: %.2f%n", getTotalRecipeCalories());
		System.out.println("\tIngredient List:");
		List<Ingredient> ingredients = getRecipeIngredients();
		for(Ingredient ingredient : ingredients) {
			System.out.printf("\t\t-%s%n", ingredient.toString());
			}
		//System.out.println(getRecipeIngredients());
		}
		
}
