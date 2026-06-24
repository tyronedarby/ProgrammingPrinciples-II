/**
* Author: Tyrone Darby
* File: LunchBag.java
* Class: CSCI 1302 - Lab03
* Description: Water bottle lab problem
*/

public class LunchBag {
	private double length, width, height;
	private WaterBottle waterBottle;
	
	/** Default/no-arg constructor */
	public LunchBag() {
		setLength(11.2);
		setWidth(6.1);
		setHeight(7.9);
		setWaterBottle(new WaterBottle());
	}
	
	/** Convenience constructor */
	public LunchBag(double length, double width, double height, WaterBottle waterBottle) {
		setLength(length);
		setWidth(width);
		setHeight(height);
		setWaterBottle(waterBottle);
	}
	
	// Implement getter/setter for all data member
	public WaterBottle getWaterBottle() {
		return waterBottle;
	}

	public void setWaterBottle(WaterBottle waterBottle) {
		if(waterBottle.getDiameter() > 0 && waterBottle.getDiameter() <= 4) {
			this.waterBottle = waterBottle;
		} else {
			System.out.println("WaterBottle cannot be stored");
			setWaterBottle(new WaterBottle());
		}
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		if(length > 0) {
			this.length = length;
		} else {
			this.length = 11.2;
		}
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		if(width > 0) {
			this.width = width;
		} else {
			this.width = 6.1;
		}
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		if(height > 0) {
			this.height = height;
		} else {
			this.height = 7.9;
		}
		
	}	
}