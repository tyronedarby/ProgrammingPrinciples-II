
/**
 * File: StandardWaterBottle.java 
 * Class: CSCI 1302 - Lab03 
 * Description: Thermos class
 */

public class Thermos extends WaterBottle {
	public Thermos() {
		super(4, 0.9);
	}
	
	public Thermos(double height, double radius) {
		super(height, radius);
	}
	
	// TODO:  Rename to toString(), Prob 02
	@Override
	public String toString() {
		return super.toString() + " and is appropriate for LunchBox instances";
	}
}
