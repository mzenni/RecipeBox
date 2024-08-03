package recipemanager;

import java.io.Console;
import java.util.Scanner;

public class MyMethods {
	Scanner scanner = new Scanner(System.in);

	// read integer prompts the user to enter an integer
	@SuppressWarnings("unused")
	public int readInteger(String prompt) {
		boolean done = false;
		int number = 0;
		while (!done) {
			done = true;
			System.out.print(String.format("%s: ", prompt));
			String input = scanner.nextLine();
			try {
				number = Integer.parseInt(input);
			} catch (NumberFormatException e) {
				// TODO: handle exception
				System.out.println("Invalid entry. Please enter a number.");
				done = false;
			}
		}

		return number;
	}

	// read integer prompts the user to enter an integer between a low and high
	// value
	@SuppressWarnings("unused")
	public int readInteger(String prompt, int low, int high) {
		boolean done = false;
		int number = 0;
		while (!done) {
			System.out.print(String.format("%s between %d and %d: ", prompt, low, high));
			String input = scanner.nextLine();
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
				// TODO: handle exception
				System.out.println("Invalid entry. Please enter a number.");

			}
		}

		return number;
	}

	// read double prompts the user to enter a double between a low and high value
	@SuppressWarnings("unused")
	public double readDouble(String prompt) {
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

	// read double prompts the user to enter a double between a low and high value
	@SuppressWarnings("unused")
	public double readDouble(String prompt, double low, double high) {
		boolean done = false;
		double number = 0.0;
		while (!done) {
			System.out.print(String.format("%s between %d and %d:", prompt, low, high));
			String input = scanner.nextLine();
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
	
	// read double prompts the user to enter a double between a low and high value
	@SuppressWarnings("unused")
	public float readFloat(String prompt) {
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

	// read double prompts the user to enter a double between a low and high value
	@SuppressWarnings("unused")
	public float readFloat(String prompt, float low, float high) {
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
