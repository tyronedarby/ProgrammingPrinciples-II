/**
 * File: csci1302/TestPassObjectSimple.java
 * @author Christopher Williams
 * Created on: Jan 18, 2017
 * Modified on: Jan 18, 2018
 * Description:  
 */

public class TestPassObjectSimple {

	public static void main(String[] args) {
		// Create a Circle object with radius 1
		Circle myCircle = new Circle(1);
		System.out.println("Radius is " + myCircle.getRadius());

		// Print areas for radius and increase
		printArea(myCircle);

		// See myCircle.radius and times
		System.out.println("Radius is " + myCircle.getRadius());
	}

	/** Print a circle's radius and change the value */
	public static void printArea(Circle c) {
		System.out.println();
		System.out.println("Radius \t\tArea");
		System.out.println(c.getRadius() + "\t\t" + c.getArea());
		c.setRadius(c.getRadius() + 1);  // CAUTION:  THIS CHANGES ORIGINAL CIRCLE!!
		System.out.println();
	}
}
