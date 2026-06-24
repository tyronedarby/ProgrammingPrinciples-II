/**
 * File: csci1302/Circle.java
 * @author Christopher Williams
 * Created on: Jan 12, 2016
 * Modified: Aug 14, 2018
 * Description:  Emulates a circle as an object (incomplete)
 */

class Circle {
	/** The radius of this circle */
	double radius = 1.0;

	/** Return the diameter of this circle */
	double getDiameter() {
		return 2.0 * radius;
	}

	/** Return the area of this circle */
	double getArea() {
		return radius * radius * Math.PI;
	}

	/** Return the perimeter (circumference) of this circle */
	double getPerimeter() {
		return 2.0 * radius * Math.PI;
	}
}