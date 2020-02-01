package com.skilldistillery.foodtruck;

public class FoodTruck {
	private String name;
	private String foodType;
	private double rating;
	private static int staticID;
	private int assignedID;

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
