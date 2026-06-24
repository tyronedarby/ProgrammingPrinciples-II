package exceptions1;
/**
 * File: csci1302/ch12/Circle.java
 * Package: ch12
 * @author Christopher Williams
 * Created on: Jan 11, 2017
 * Description:  Create a Circle class with an exception for negative radius
 */

public class Circle  {
	/** The radius of this circle */
	private double radius;
	private static int numberOfCircles;

	/** Default/no-arg constructor */
	public Circle() {
		setRadius(1.0);
		Circle.numberOfCircles++;
	}
	
	public Circle(double radius) {
		this();
		setRadius(radius);	
	}
	
	/** Set a new radius */
	public void setRadius(double radius) throws IllegalArgumentException {
	  if (radius >= 0) {
	    this.radius =  radius;
	  } else {
	    throw new IllegalArgumentException("Radius cannot be negative");
	  }
	}

	/** return the radius */
	public double getRadius() {
		return radius;
	}

	/** Return the diameter of this circle */
	public double getDiameter() {
		return 2 * getRadius();
	}

	/** Return the area of this circle */
	public double getArea() {
		return getRadius() * getRadius() * Math.PI;
	}

	/** Return the perimeter of this circle */
	public double getPerimeter() {
		return 2 * getRadius() * Math.PI;
	}
	
	/** Return total number of circles */
	public static int getNumberOfCircles() {
		return numberOfCircles;
	}
	
	@Override
	public String toString() {
		return String.format("Radius: %.2f", getRadius());
	}
}
