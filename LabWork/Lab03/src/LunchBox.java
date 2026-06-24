/**
* Author: Tyrone Darby
* File: LunchBox.java
* Class: CSCI 1302 - Lab03
* Description: Water bottle lab problem
*/

public class LunchBox {
	private double length, width, height;
	private WaterBottle waterBottle;
	
	/** Default/no-arg constructor */
	public LunchBox() {
		setLength(10.6);
		setWidth(7.7);
		setHeight(6.33);
		setWaterBottle(new WaterBottle(4.0, 0.9));
	}
	
	/** Convenience constructor */
	public LunchBox(double length, double width, double height, WaterBottle waterBottle) {
		setLength(length);
		setWidth(width);
		setHeight(height);
		setWaterBottle(waterBottle);
	}
	
	// Implement getter/setter for all data member
	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		if(length > 0) {
			this.length = length;
		} else {
			this.length = 10.6;
		}
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		if(width > 0) {
			this.width = width;
		} else {
			this.width = 7.7;
		}
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		if(height > 0) {
			this.height = height;
		} else {
			this.height = 6.33;
		}
		
	}

	public WaterBottle getWaterBottle() {
		return waterBottle;
	}

	public void setWaterBottle(WaterBottle waterBottle) {
		if(waterBottle.getHeight() <= getHeight() - 2 && waterBottle.getDiameter() <= (0.25 * getWidth())) {
			this.waterBottle = waterBottle;
		} else {
			System.out.println("WaterBottle cannot be stored");
			 this.waterBottle = new WaterBottle(4.0, 0.9);
		}
	}
}