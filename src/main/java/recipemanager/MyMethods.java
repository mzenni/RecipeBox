package recipemanager;

import java.util.Scanner;

/* 
 * Madison Zenni
 * MyMethods class handles user input
 */

public class MyMethods {
	// Initialize the scanner
	Scanner scanner = new Scanner(System.in);

	/**
	 * Validates user input as string
	 * @param prompt
	 * @return int
	 */
	public int readInteger(String prompt) {
		// boolean controls while loop
		boolean done = false;
		int number = 0;
		while (!done) {
			done = true;
			System.out.print(String.format("%s: ", prompt));
			String input = scanner.nextLine();
			
			// try to parse integer, if not print error message
			try {
				number = Integer.parseInt(input);
			} catch (NumberFormatException e) {
				System.out.println("Invalid entry. Please enter a number.");
				done = false;
			}
		}

		return number;
	}


	/**
	 * Reads an integer from the user, validate integer within range
	 * @param prompt
	 * @param low
	 * @param high
	 * @return int
	 */
	@SuppressWarnings("unused")
	public int readInteger(String prompt, int low, int high) {
		// boolean controls the while loop
		boolean done = false;
		int number = 0;
		while (!done) {
			System.out.print(String.format("%s between %d and %d: ", prompt, low, high));
			String input = scanner.nextLine();
			// try to parse integer, confirm it is between low and high values
			// If integer, but outside of range loop through again
			try {
				number = Integer.parseInt(input);
				if (number < low) {
					System.out.println("Invalid entry. Please enter a number between " + low + " and " + high + ".");
				} else if (number > high) {
					System.out.println("Invalid entry. Please enter a number between " + low + " and " + high + ".");
				} else {
					done = true;
				}
			} catch (NumberFormatException e) {
				System.out.println("Invalid entry. Please enter a number.");

			}
		}

		return number;
	}

	/**
	 * Reads an double from the user. Validate double
	 * @param prompt
	 * @return double
	 */
	@SuppressWarnings("unused")
	public double readDouble(String prompt) {
		// boolean controls while loop
		boolean done = false;
		double number = 0.0;
		while (!done) {
			done = true;
			System.out.print(String.format("%s: ", prompt));
			String input = scanner.nextLine();
			try {
				number = Double.parseDouble(input);

			} catch (NumberFormatException e) {
				// TODO: handle exception
				System.out.println("Invalid entry. Please enter a number.");
				done = false;

			}
		}

		return number;
	}

	/**
	 * Reads double from user, validates the double is within range
	 * @param prompt
	 * @param low
	 * @param high
	 * @return double
	 */
	@SuppressWarnings("unused")
	public double readDouble(String prompt, double low, double high) {
		// boolean controls while loop
		boolean done = false;
		double number = 0.0;
		while (!done) {
			System.out.print(String.format("%s between %d and %d:", prompt, low, high));
			String input = scanner.nextLine();
			// try to parse double, confirm it is between low and high values
			// If double, but outside of range loop through again
			try {
				number = Double.parseDouble(input);
				if (number < low) {
					System.out.println("Invalid entry. Please enter a number between " + low + " and " + high + ".");
				} else if (number > high) {
					System.out.println("Invalid entry. Please enter a number between " + low + " and " + high + ".");
				} else {
					done = true;
				}
			} catch (NumberFormatException e) {
				// TODO: handle exception
				System.out.println("Invalid entry. Please enter a number.");

			}
		}

		return number;
	}

	/**
	 * Reads a input from user and validates that it is a float 
	 * @param prompt
	 * @return float
	 */
	public float readFloat(String prompt) {
		// boolean controls while loop
		boolean done = false;
		float number = 0;
		while (!done) {
			done = true;
			System.out.print(String.format("%s: ", prompt));
			String input = scanner.nextLine();
			try {
				number = Float.parseFloat(input);

			} catch (NumberFormatException e) {
				// TODO: handle exception
				System.out.println("Invalid entry. Please enter a number.");
				done = false;

			}
		}

		return number;
	}

	
	/**
	 * Reads user input and validates that its a float within certain range
	 * @param prompt
	 * @param low
	 * @param high
	 * @return float
	 */
	public float readFloat(String prompt, float low, float high) {
		// boolean controls while loop
		boolean done = false;
		float number = 0;
		while (!done) {
			System.out.print(String.format("%s between %d and %d:", prompt, low, high));
			String input = scanner.nextLine();
			try {
				number = Float.parseFloat(input);
				if (number < low) {
					System.out.println("Invalid entry. Please enter a number between " + low + " and " + high + ".");
				} else if (number > high) {
					System.out.println("Invalid entry. Please enter a number between " + low + " and " + high + ".");
				} else {
					done = true;
				}
			} catch (NumberFormatException e) {
				// TODO: handle exception
				System.out.println("Invalid entry. Please enter a number.");

			}
		}

		return number;
	}
}
