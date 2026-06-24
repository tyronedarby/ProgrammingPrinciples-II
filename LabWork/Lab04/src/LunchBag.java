/**
 * File: LunchBag.java 
 * Class: CSCI 1302 - Lab03 
 * Description: Aggregation / Composition Lab 
 */

// standard water bottle

public class LunchBag {
	private double length, width, height;
	private StandardWaterBottle waterBottle;

	// Default Constructor
	public LunchBag() {
		setLength(11.2);
		setWidth(6.1);
		setHeight(7.9);
		// TODO:  Update this instantiation to use correct class - Prob 03
		setWaterBottle(new StandardWaterBottle());
	}

	// Convenience Constructor
	public LunchBag(double length, double width, double height, WaterBottle waterBottle) {
		setLength(length);
		setWidth(width);
		setHeight(height);
		setWaterBottle((StandardWaterBottle) waterBottle);
	}

	public boolean isValid(WaterBottle wb) {
		return  wb instanceof StandardWaterBottle;
	}

	// Accessors and Mutators below
	public WaterBottle getWaterBottle() {
		return waterBottle;
	}

	// TODO: Create isValid() method as described, update this set method to use it - Prob 03
	public void setWaterBottle(WaterBottle waterBottle) {
		// WaterBottle diameter must be greater than 0 and less than or equal to 4
		if (waterBottle.getRadius() * 2 > 0 && waterBottle.getRadius() * 2 <= 4 && waterBottle instanceof StandardWaterBottle) {
			this.waterBottle = (StandardWaterBottle) waterBottle;
		} else {
			System.out.println("WaterBottle cannot be used");
			this.waterBottle = new StandardWaterBottle(4, 0.9);
		}
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length > 0 ? length : 11.2;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width > 0 ? width : 6.1;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height > 0 ? height : 7.9;
	}

}


