
/**
* File: WaterBottle.java
* Class: CSCI 1302
* Author: Carson Buie, Tyrone Darby, Xavier Morales
* Created on: Jan 23, 2026
* Last Modified: Jan 23, 2026
* Description: Make water bottle objects and get methods for its variables
*/

// TODO:  Update all data members, constructors, and methods to have the correct visibility
public class WaterBottle {
	// TODO: Prob 01 - create accessor (get) and mutators (set) methods for all data members
	private double height, radius;
	private String color;
	private static double largestInitialVolume;
	// TODO:  Prob 02 - add static data member with correct visibility
	
	
	// TODO: Prob 01 - update to use mutators (set) methods
	public WaterBottle() {
		setHeight(12.0);
		setRadius(2.0);
		setColor("green");
		checkInitialVolume(getVolume());
		// TODO: Prob 02 - make sure static method is called after height/radius are set
	}
	
	// TODO: Prob 01 - update to use mutators (set) methods
	public WaterBottle(double newHeight, double newRadius, String newColor) {
		setHeight(newHeight);
		setRadius(newRadius);
		setColor(newColor);
		checkInitialVolume(getVolume());
		// TODO: Prob 02 - make sure static method is called after height/radius are set
	}
	
	public WaterBottle(double newHeight, double newRadius) {
		setHeight(newHeight);
		setRadius(newRadius);
		setColor("green");
		checkInitialVolume(getVolume());
	}
	
	public void setRadius(double radius) {
		if (radius > 0.0) {
			this.radius = radius;
		} else {
			this.radius = 2.0;
		}
	}
	
	public void setHeight(double height) {
		if (height > 0.0) {
			this.height = height;
		} else {
			this.height = 12.0;
		}
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	public double getVolume() {
		return Math.PI * radius * radius * height;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double getHeight() {
		return height;
	}
	
	public String getColor() {
		return color;
	}
	
	public static double getLargestInitialVolume() {
		return WaterBottle.largestInitialVolume;
	}
	
	public static void checkInitialVolume(double newVolume) {
		if (newVolume > largestInitialVolume) {
			WaterBottle.largestInitialVolume = newVolume;
		}
	}
	
	public String getInfo() {
		return String.format("A %s water bottle with height %.2f, radius %.2f, and volume %.2f", getColor(), getHeight(), getRadius(), getVolume());
	}
	
	// TODO:  Prob 02 - add static method with correct visibility
}
