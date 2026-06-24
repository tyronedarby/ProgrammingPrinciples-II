/**
 * File: csci1302/Circle.java
 * @author Christopher Williams
 * Created on: Jan 10, 2017
 * Modified: Aug 24, 2017
 * Description: Create a Circle class with radius.  Contains examples of 
 *              static data members and visibility.
 */


class Circle {
	/** The radius of this circle */
	private double radius = 1;
	private static int numberOfCircles;

	/** Default/no-arg constructor */
	public Circle() {
		Circle.numberOfCircles++;
	}
	
	/** Convenience constructor to create with specific radius */
	public Circle(double newRadius) {
		Circle.numberOfCircles++;
		radius = newRadius;
	}
	
	/** Set a new radius for this circle */
	public void setRadius(double newRadius) {
		radius = (newRadius > 0) ? newRadius : 0;
	}

	/** Eeturn the radius */
	public double getRadius() {
		return radius;
	}

	/** Return the diameter of this circle */
	public double getDiameter() {
		return 2 * radius;
	}

	/** Return the area of this circle */
	public double getArea() {
		return radius * radius * Math.PI;
	}

	/** Return the circumference of this circle */
	public double getCircumference() {
		return 2 * radius * Math.PI;
	}
	
	/** Return total number of circles */
	public static int getNumberOfCircles() {
		return numberOfCircles;
	}
}
