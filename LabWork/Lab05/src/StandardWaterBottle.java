
/**
 * File: StandardWaterBottle.java 
 * Class: CSCI 1302 - Lab03 
 * Description: StandardWaterBottle class
 */

public class StandardWaterBottle extends WaterBottle {
	public StandardWaterBottle() {
		super();
	}
	
	public StandardWaterBottle(double height, double radius) {
		super(height, radius);
	}
	
	// TODO:  Rename to toString(), Prob 02
	@Override
	public String toString() {
		return super.toString() + " and is appropriate for LunchBag instances";
	}
}
