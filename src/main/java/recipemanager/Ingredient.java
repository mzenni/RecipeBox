package recipemanager;

import java.util.Scanner;
/* 
 * Madison Zenni
 * Ingredient class represents ingredient in a recipe
 */
public class Ingredient {
	// data members
	private String nameOfIngredient;
	private float numberOfCups; 
	private int numberOfCaloriesPerCup; 
	private double totalCalories;
	
	/**
	 * Constructor to initialize the ingredient
	 * @param nameOfIngredient the name of the ingredient
	 * @param numberOfCups the number of cups of the ingredient
	 * @param numberOfCaloriesPerCup the number of calories per cup of the ingredient
     */ 
     public Ingredient(String nameOfIngredient, float numberOfCups, int numberOfCaloriesPerCup){
		this.nameOfIngredient = nameOfIngredient;
		this.numberOfCups = numberOfCups;
		this.numberOfCaloriesPerCup = numberOfCaloriesPerCup;
		this.totalCalories = (double)numberOfCups * (double)numberOfCaloriesPerCup; 
		
	}
	// Getters and Setters
     /**
      * Gets the name of the ingredient
      * @return the name of the ingredient
      */ 
	public String getNameOfIngredient() {
		return nameOfIngredient; 
	}
	/**
	 * Sets the name of ingredient
	 * @param name of ingredient
	 */
	public void setNameOfIngredient(String name) {
		this.nameOfIngredient = name;
	}
	/**
     * Gets the number of cups
     * @return the number of cups
     */ 
	public float getNumberOfCups(){
		return numberOfCups;
	}
	/**
	 * Sets the number of cups for ingredient
	 * @param the number of cups
	 */
	public void setNumberOfCups(float number) {
		this.numberOfCups = number;
	}
	
	/**
     * Gets the number of calories per cup
     * @return the number of calories per cup
     */
	public int getNumberOfCaloriesPerCup() {
		return numberOfCaloriesPerCup;
	}
	/**
	 * Sets the number calories per cup
	 * @param number calories per cup
	 */
	public void setNumberOfCaloriesPerCup(int caloriesPerCup) {
		this.numberOfCaloriesPerCup = caloriesPerCup;
	}
	/**
     * Gets the total calories
     * @return the total calories
     */
	public double getTotalCalories() {
		return totalCalories; 
	}
	/**
	 * Sets the total calories
	 * @param total calories 
	 */
	public void setTotalCalories(double totalCalories) {
		this.totalCalories = totalCalories; 
	}
	
	/**
	 * Creates an Ingredient object based on user input.
	 * @return Ingredient
	 */
	public static Ingredient createFromUserInput() {
        Scanner scanner = new Scanner(System.in);
        MyMethods myMethods = new MyMethods(); 
        System.out.print("\nEnter Ingredient Name: ");
        String name = scanner.nextLine();
        float numberOfCups = myMethods.readFloat("Enter Number of Cups");
        int caloriesPerCup = myMethods.readInteger("Enter the Calories Per Cup");
        return new Ingredient(name, numberOfCups, caloriesPerCup);
    }
	
	/**
     * Returns a string representation of the ingredient.
     * @return a string describing the ingredient.
     */
    @Override
	public String toString() {
		String msg = String.format("%.2f cups of %s (%d cals/cup, %.2f calories total)",
				getNumberOfCups(),
				getNameOfIngredient(),
                getNumberOfCaloriesPerCup(),
                getTotalCalories());
		return msg; 
	}
}
