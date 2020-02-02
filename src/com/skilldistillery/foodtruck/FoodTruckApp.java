package com.skilldistillery.foodtruck;

import java.util.Scanner;

public class FoodTruckApp {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		FoodTruck[] foodTruckArray;
		foodTruckArray = new FoodTruck[5];
		FoodTruckApp initializeApp = new FoodTruckApp();

		System.out.println("This is the automated FoodTruck App.");
		System.out.println("After input is complete, you will be able to display the stats of all trucks.");
		foodTruckArray = initializeApp.generateFoodTrucks(keyboard, foodTruckArray);
		initializeApp.appMenu(keyboard, (initializeApp.copyReturnFoodTruck(foodTruckArray)));

		// TODO Auto-generated method stub
		keyboard.close();

	}

	public FoodTruck[] generateFoodTrucks(Scanner keyboard, FoodTruck[] foodTruckArray) {
		FoodTruck[] nonNullFoodTruck; // Will be used to filter out null elements.
		int arrayCounter = 0; // Counts amount of entries and provides a new length for array.
		for (int i = 0; i < foodTruckArray.length; i++) {
			System.out.print("Please provide the name of the Food Truck or enter \"quit\": ");
			String name = keyboard.nextLine();
			if (name.toLowerCase().contains("quit")) {
				break;
			}
			System.out.print("Please provide the type of food for this truck: ");
			String food = keyboard.nextLine();
			System.out.print("Please provide the rating of this truck (0-5): ");
			double rating = (Math.round(keyboard.nextDouble() * 100)) / 100.00; // Rounds to two decimal places
			if (rating > 5 || rating < 0) {
				rating = 0;
				System.out.println("\nOut of limits: Rating Defaulted to Zero.\n");
			}
			keyboard.nextLine();
			foodTruckArray[i] = new FoodTruck(name, food, rating);
			arrayCounter++;
		}
		nonNullFoodTruck = new FoodTruck[arrayCounter]; // Copies the array without null values
		for (int j = 0; j < foodTruckArray.length; j++) {
			if (foodTruckArray[j] != null)
				for (int y = 0; y < nonNullFoodTruck.length; y++) {
					if (nonNullFoodTruck[y] == null) {
						nonNullFoodTruck[y] = foodTruckArray[j];
						break;

					}
				}

		}

		return foodTruckArray = nonNullFoodTruck; // Returns null-less array.

	}

	public void printAllFoodTrucks(FoodTruck[] foodTruckArray) {
		for (FoodTruck foodTruck : foodTruckArray) {
			System.out.println(foodTruck); // uses the toString() method in FoodTruck to print information.
		}
	}

	public void appMenu(Scanner keyboard, FoodTruck[] foodTruckArray) {
		int menuSelection = 0;
		// Instantiates the integer so that it can be used in the while loop

		while (menuSelection != 4) {
			System.out.println("Please choose from the following menu (1 - 4):");
			System.out.println("1. List Food Trucks.");
			System.out.println("2. Display Average Rating.");
			System.out.println("3. Display Highest Rated Food Truck(s).");
			System.out.println("4. Quit.");
			System.out.print("Selection: ");

			menuSelection = Character.getNumericValue((keyboard.nextLine()).charAt(0)); // Helps to filter erroneous
																						// entries

			switch (menuSelection) {
			case 1: {
				printAllFoodTrucks(copyReturnFoodTruck(foodTruckArray));
				break;
			}
			case 2: {
				averageRating(copyReturnFoodTruck(foodTruckArray));
				break;
			}
			case 3: {
				highestRatedTruck(copyReturnFoodTruck(foodTruckArray));
				break;
			}
			case 4: {
				System.out.println("Thank you for using the automated Food Truck App");
				break;
			}
			default:
				System.out.println("That was not a valid selection.");
			}
		}
		// Menus -- finished
		// List food trucks -- finished
		// Average rating display -- Complete method -- Finished
		// Display highest rating -- complete the method --Finished
		// Quit program --- This can be completed in this method --- finished
		// Method to copy and return the main FoodTruck Array. --- Finished
		// Make sure to loop this menu until "Quit" is inputed. --- finished
	}

	public void averageRating(FoodTruck[] arrayOfFoodTrucks) {
		double average = 0;
		if ((arrayOfFoodTrucks.length > 0)) {

			for (FoodTruck foodTruck : arrayOfFoodTrucks) {
				average += foodTruck.getRating();
			}
			average = (Math.round(average * 100) / arrayOfFoodTrucks.length) / 100.00; // Rounds the number to two
																						// decimal places
			System.out.println("The average rating of the trucks is: " + (average));
		} else {
			System.out.println("There are no Food Trucks to Report.");
		}

		// Average rating of the array
	}

	public void highestRatedTruck(FoodTruck[] arrayOfFoodTrucks) {
		double highest = Double.MIN_VALUE;
		FoodTruck bestFoodTruck = new FoodTruck();
		if ((arrayOfFoodTrucks.length > 0)) {
			for (FoodTruck foodTruck : arrayOfFoodTrucks) {
				if (highest < foodTruck.getRating()) {
					highest = foodTruck.getRating();
					bestFoodTruck = foodTruck;
				}
			}
			System.out.println("The highest rated FoodTruck is:");
			System.out.println(bestFoodTruck);
		} else {
			System.out.println("There are no food trucks to report.");
		}

		// highest rating of the food trucks
	}

	public FoodTruck[] copyReturnFoodTruck(FoodTruck[] foodTruck) {
		FoodTruck[] foodTruckCopy = new FoodTruck[foodTruck.length];

		for (int i = 0; i < foodTruck.length; i++)
			foodTruckCopy[i] = foodTruck[i];
		// Attempted example of encapsulation.
		return foodTruckCopy; // Copies main FoodTruck[] and isolates it from direct access.

	}

}
