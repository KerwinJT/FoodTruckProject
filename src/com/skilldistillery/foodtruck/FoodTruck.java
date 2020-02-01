package com.skilldistillery.foodtruck;

// This class has no methods other than getters, setters, constructors, and an override of toString().
// It is designed as a blueprint for individual objects of type FoodTruck
// All interactions will be controlled through the main class - FoodTruckApp
//

public class FoodTruck {
	private String name;
	private String foodType;
	private double rating;
	private static int staticID;
	private int assignedID;
	
	public FoodTruck() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public int getAssignedID() {
		return assignedID;
	}

	public void setAssignedID(int assignedID) {
		this.assignedID = assignedID;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("FoodTruck [name = ");
		builder.append(name);
		builder.append(", foodType = " );
		builder.append(foodType);
		builder.append(", rating = ");
		builder.append(rating);
		builder.append(", assignedID = ");
		builder.append(assignedID);
		builder.append("]");
		return builder.toString();
	}

	public FoodTruck(String name, String foodType, double rating) {
		this.foodType = foodType;
		this.name = name;
		this.rating = rating;
		this.assignedID = staticID;
		staticID++;
	}
}
