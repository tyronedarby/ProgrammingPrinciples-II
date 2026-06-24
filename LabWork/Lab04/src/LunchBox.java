/**
 * File: LunchBag.java 
 * Class: CSCI 1302 - Lab03 
 * Description: Aggregation / Composition Lab 
 */

// thermos

public class LunchBox {
	private double length, width, height;
	private Thermos waterBottle; // add aggregated object
	
	// Default Constructor
	public LunchBox() {
		setLength(10.6);
		setWidth(7.7);
		setHeight(6.33);
		// TODO:  Update this instantiation to use correct class - Prob 03
		setWaterBottle(new Thermos(4.0, 0.9));
	}
	
	// Convenience Constructor
	public LunchBox(double length, double width, double height, WaterBottle waterBottle) {
		setLength(length);
		setWidth(width);
		setHeight(height);
		setWaterBottle((Thermos)waterBottle);
	}

	public boolean isValid(WaterBottle wb) {
		return  wb instanceof Thermos;
	}

	// Accessors and Mutators below
	public WaterBottle getWaterBottle() {
		return waterBottle;
	}

	// TODO: Create isValid() method as described, update this set method to use it - Prob 03
	public void setWaterBottle(WaterBottle waterBottle) {
		// WaterBottle height must be at least 2 shorter than LunchBox height and 
		// WaterBottle diameter must be less than or equal to 25% of LunchBox width
		if ((getHeight() - 2 > waterBottle.getHeight() && getWidth() * 0.25 >= waterBottle.getRadius() * 2) && isValid(waterBottle) && waterBottle instanceof Thermos) {
			this.waterBottle = (Thermos) waterBottle;
		} else {
			System.out.println("WaterBottle cannot be used");
			this.waterBottle = new Thermos(4, 0.9);
		}
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length > 0 ? length : 10.6;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width > 0 ? width : 7.7;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height > 0 ? height : 6.33;
	}
}