/**
 * File: csci1302/Circle.java
 * @author Christopher Williams
 * Created on: Feb 7, 2016
 * Description:  Circle - subclass of Shape
 */

public class Circle extends Shape {

	private double radius;

	public Circle() {
		this(5.0);
	}

	public Circle(double radius) {
		setRadius(radius);
	}

	public double getArea() {
		return 2 * Math.PI * radius;
	}
	
	public String toString() {
		return String.format("%s: I'm a Circle", super.toString());
	}

	/** --------------------------------Getters/Setters---------------------------------*/
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = (radius >= 0) ? radius : 0;
	}

}
