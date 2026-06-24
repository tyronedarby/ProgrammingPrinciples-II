/**
 * File: WaterBottle.java
 * Class: CSCI 1302 - Lab07
 * Description: Interfaces lab
 */

// TODO:  Prob01 - Create the Drinkable interface as described
// TODO:  Prob01 - Modify this class so it implements Drinkable
// TODO:  Prob02 - Modify this class so it implements Comparable<E> and Cloneable
public class WaterBottle implements Drinkable, Comparable<WaterBottle>, Cloneable {
	private double height, radius;
	private String color;
	private static double largestInitialVolume;
	
	// default constructor
	public WaterBottle() {
		this(12, 2);
	}
	
	// convenience constructor
	public WaterBottle(double height, double radius) {
		setHeight(height);
		setRadius(radius);
		setColor("green");
		checkInitialVolume(); 
	}
	
	// TODO: Prob01 - Implement the drink() method
	
	// TODO: Prob02 - Implement the compareTo() method, larger volumes are "bigger"
	// TODO: Prob02 - Implement the clone() method, remember to manually copy the color
	
	@Override
	public String toString() {
		return String.format("A %s water bottle with height %.2f, radius %.2f, and volume %.2f", getColor(), getHeight(), getRadius(), getVolume());
	}
	
	@Override
	public boolean equals(Object o) {
		if (o instanceof WaterBottle && ((WaterBottle) o).getRadius() == this.getRadius() && ((WaterBottle)o).getHeight() == this.getHeight()) {
			return true;
		} else {
			return false;
		}
	}
	
	public double getVolume() {
		return Math.PI * getRadius() * getRadius() * getHeight();
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		// Height must be greater than zero
		this.height = height > 0 ? height : 12;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		// Radius must be greater than zero
		this.radius = radius > 0 ? radius : 2;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public static double getLargestInitialVolume() {
		return largestInitialVolume;
	}
	
	private void checkInitialVolume() {
		if (this.getVolume() > WaterBottle.getLargestInitialVolume()) {
			largestInitialVolume = this.getVolume();
		}
	}

	@Override
	public String drink() {
		return "";
	}
	
	@Override
	public int compareTo(WaterBottle waterBottle) {
		if (this.getVolume() > waterBottle.getVolume()) {
			return 1;
		} else if (this.getVolume() < waterBottle.getVolume()) {
			return -1;
		} else {
			return 0;
		}
	}
	
	@Override
	public WaterBottle clone() {
		
		String colorClone = new String(this.getColor());
		WaterBottle b = new WaterBottle(this.getHeight(), this.getRadius());
		b.setColor(colorClone);
		return b;
		
	}
}