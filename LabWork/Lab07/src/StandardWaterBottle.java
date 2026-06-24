
public class StandardWaterBottle extends WaterBottle {
	// From previous labs
	public StandardWaterBottle() {
		super();
	}
	
	public StandardWaterBottle(double height, double radius) {
		super(height, radius);
	}
	
	// Prob01
	@Override
	public String toString() {
		return super.toString() + " and is appropriate for LunchBag instances";
	}
	
	@Override
	public String drink() {
		return "Unscrew top, tilt body";
	}
}