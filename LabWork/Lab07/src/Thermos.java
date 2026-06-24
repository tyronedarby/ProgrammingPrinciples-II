
public class Thermos extends WaterBottle {
	public Thermos() {
		super(4, 0.9);
	}
	
	public Thermos(double height, double radius) {
		super(height, radius);
	}
	
	// TODO: Prob01 - Implement the drink() method
	
	@Override
	public String toString() {
		return super.toString() + " and is appropriate for LunchBox instances";
	}
	
	@Override
	public String drink() {
		return "Open drink spout, tilt body";
	}
}