package exceptions2;

/**
 * 
 * Custom Exception class for Circle radius exceptions
 *
 */

public class InvalidRadiusException extends Exception {
	private double radius;

	/** Construct an exception */
	public InvalidRadiusException(double radius) {
		super("Invalid radius");
		setRadius(radius);
	}
	
	@Override
	public String getMessage() {
		return String.format("%s - %.2f%n", super.getMessage(), getRadius());
	}
	
	/** Return the radius */
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}

	
}