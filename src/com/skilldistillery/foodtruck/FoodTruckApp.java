package com.skilldistillery.foodtruck;

import java.util.Scanner;

public class FoodTruckApp {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		FoodTruck[] foodTruckArray; 
		foodTruckArray = new FoodTruck[5];
		foodTruckArray = generateFoodTrucks(keyboard, foodTruckArray);
		printAllFoodTrucks(foodTruckArray);
		// TODO Auto-generated method stub
		keyboard.close();

	}
	public static FoodTruck[] generateFoodTrucks(Scanner keyboard, FoodTruck[] foodTruckArray) {
		
		for (int i = 0; i < foodTruckArray.length; i++) {
			System.out.print("Please provide the name of the Food Truck: ");
			String name = keyboard.nextLine();
			System.out.print("Please provide the type of food for this truck: ");
			String food = keyboard.nextLine();
			System.out.print("Please provide the rating of this truck: ");
			double rating = keyboard.nextDouble();
			keyboard.nextLine();
			foodTruckArray[i] = new FoodTruck(name, food, rating);
		}
		return foodTruckArray;
		
	}
	
	public static void printAllFoodTrucks(FoodTruck[] foodTruckArray) {
		for (FoodTruck foodTruck : foodTruckArray) {
			System.out.println(foodTruck.toString());
		}
	}
	
	public static void appMenu(Scanner keyboard) {
		//Menus
		//List food trucks
		//Average rating display -- Complete method
		//Display highest rating --  complete the method
		//Quit program --- This can be completed in this method
		
		//Make sure to loop this menu until "Quit" is inputed.
	}
	
	public static void averageRating(FoodTruck[] foodTruckArray) {
		//Average rating of the array
	}
	
	public static void highestRatedTrucl(FoodTruck[] foodTruckArray) {
		//highest rating of the food trucks
	}
	
	

}
