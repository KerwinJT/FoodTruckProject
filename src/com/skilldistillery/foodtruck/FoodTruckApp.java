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
		initializeApp.appMenu(keyboard, foodTruckArray);
		
		// TODO Auto-generated method stub
		keyboard.close();

	}
	public FoodTruck[] generateFoodTrucks(Scanner keyboard, FoodTruck[] foodTruckArray) {
		FoodTruck[] customFoodTruck;
		int arrayCounter = 0;
		for (int i = 0; i < foodTruckArray.length; i++) {
			System.out.print("Please provide the name of the Food Truck or enter \"quit\": ");
			String name = keyboard.nextLine();
			if (name.contains("quit")) {
				break;
			}
			System.out.print("Please provide the type of food for this truck: ");
			String food = keyboard.nextLine();
			System.out.print("Please provide the rating of this truck: ");
			double rating = keyboard.nextDouble();
			keyboard.nextLine();
			foodTruckArray[i] = new FoodTruck(name, food, rating);
			arrayCounter++;
		}
		customFoodTruck = new FoodTruck[arrayCounter];
		for (int j = 0; j < foodTruckArray.length; j++) {
			if (foodTruckArray[j] != null)
				for (int y = 0; y < customFoodTruck.length; y++) {
					if (customFoodTruck[y] == null) {
						customFoodTruck[y] = foodTruckArray[j];
						break;

					}
				}

		}

		return foodTruckArray = customFoodTruck;
		
	}
	
	public void printAllFoodTrucks(FoodTruck[] foodTruckArray) {
		for (FoodTruck foodTruck : foodTruckArray) {
			System.out.println(foodTruck.toString());
		}
	}
	
	public void appMenu(Scanner keyboard, FoodTruck[] foodTruckArray) {
		int menuSelection = 0;
		
		while (menuSelection != 4) {
			System.out.println("Plese choose from the following menu (1 - 4):");
			System.out.println("1. List Food Trucks.");
			System.out.println("2. Diplay Average Rating.");
			System.out.println("3. Display Highest Rated Food Truck(s).");
			System.out.println("4. Quit.");
			System.out.print("Selection: ");
			menuSelection = keyboard.nextInt();
			
			switch (menuSelection){
				case 1: {
					printAllFoodTrucks(foodTruckArray);
					break;
				}
				case 2: {
					averageRating(foodTruckArray);
					break;
				}
				case 3: {
					highestRatedTrucl(foodTruckArray);
					break;
				}
				case 4: {
					
					break;
				}
				default:
					System.out.println("That was not a valid selection.");
			}
		}
		//Menus -- finished
		//List food trucks  -- finished
		//Average rating display -- Complete method  -- Finished
		//Display highest rating --  complete the method --Finished
		//Quit program --- This can be completed in this method --- finished
		
		//Make sure to loop this menu until "Quit" is inputed.  --- finished
	}
	
	public void averageRating(FoodTruck[] foodTruckArray) {
		double average = 0;
		for (FoodTruck foodTruck : foodTruckArray) {
			average += foodTruck.getRating();
		}
		System.out.println("The average rating of the trucks is: " + ( average/ foodTruckArray.length));
		//Average rating of the array
	}

	public void highestRatedTrucl(FoodTruck[] foodTruckArray) {
		double highest = Double.MIN_VALUE;
		FoodTruck bestFoodTruck = new FoodTruck();
		if (foodTruckArray[0] != null) {
			for (FoodTruck foodTruck : foodTruckArray) {
				if (highest < foodTruck.getRating()) {
					highest = foodTruck.getRating();
					bestFoodTruck = foodTruck;
				}
			}
		}
		System.out.println("The highest rated FoodTruck is:");
		System.out.println(bestFoodTruck.toString());
		//highest rating of the food trucks
	}
	
	

}
