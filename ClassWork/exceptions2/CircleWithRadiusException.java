package exceptions2;

public class CircleWithRadiusException {
	/** The radius of the circle */
	private double radius;

	/** The number of the objects created */
	private static int numberOfCircles;

	/** Construct a circle with radius 1 */
	public CircleWithRadiusException() throws InvalidRadiusException {
		this(1.0);
	}

	/** Construct a circle with a specified radius */
	public CircleWithRadiusException(double newRadius) throws InvalidRadiusException {
		setRadius(newRadius);
		CircleWithRadiusException.numberOfCircles++;
	}

	/** Return radius */
	public double getRadius() {
		return radius;
	}

	/** Set a new radius */
	public void setRadius(double radius) throws InvalidRadiusException {
		if (radius >= 0)
			this.radius = radius;
		else
			throw new InvalidRadiusException(radius);
	}

	/** Return the area of this circle */
	public double getArea() {
		return getRadius() * getRadius() * Math.PI;
	}
	
	/** Return total number of circles */
	public static int getNumberOfCircles() {
		return CircleWithRadiusException.numberOfCircles;
	}
	
	@Override
	public String toString() {
		return String.format("Radius: %.2f", getRadius());
	}
}