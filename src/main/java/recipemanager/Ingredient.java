package recipemanager;

import java.util.Scanner;

public class Ingredient {
	// data members
	private String nameOfIngredient;
	private float numberOfCups; 
	private int numberOfCaloriesPerCup; 
	private double totalCalories;
	
	// Constructor
	public Ingredient(String nameOfIngredient, float numberOfCups, int numberOfCaloriesPerCup){
		this.nameOfIngredient = nameOfIngredient;
		this.numberOfCups = numberOfCups;
		this.numberOfCaloriesPerCup = numberOfCaloriesPerCup;
		this.totalCalories = (double)numberOfCups * (double)numberOfCaloriesPerCup; 
		
	}
	// Getters and Setters
	public String getNameOfIngredient() {
		return nameOfIngredient; 
	}
	public void setNameOfIngredient(String name) {
		this.nameOfIngredient = name;
	}
	
	public float getNumberOfCups(){
		return numberOfCups;
	}
	public void setNumberOfCups(float number) {
		this.numberOfCups = number;
	}
	
	
	public int getNumberOfCaloriesPerCup() {
		return numberOfCaloriesPerCup;
	}
	public void setNumberOfCaloriesPerCup(int caloriesPerCup) {
		this.numberOfCaloriesPerCup = caloriesPerCup;
	}
	public double getTotalCalories() {
		return totalCalories; 
	}
	public void setTotalCalories(double totalCalories) {
		this.totalCalories = totalCalories; 
	}
	public static Ingredient createFromUserInput() {
        Scanner scanner = new Scanner(System.in);
        MyMethods myMethods = new MyMethods(); 
        System.out.print("\nEnter Ingredient Name: ");
        String name = scanner.nextLine();
        float numberOfCups = myMethods.readFloat("Enter Number of Cups");
        int caloriesPerCup = myMethods.readInteger("Enter the Calories Per Cup");
        return new Ingredient(name, numberOfCups, caloriesPerCup);
    }
	
	public String toString() {
		String msg = String.format("%.2f cups of %s (%d cals/cup, %.2f calories total)",
				getNumberOfCups(),
				getNameOfIngredient(),
                getNumberOfCaloriesPerCup(),
                getTotalCalories());
		return msg; 
	}
}
