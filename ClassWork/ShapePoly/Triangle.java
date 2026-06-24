/**
 * File: csci1302/Triangle.java
 * @author Christopher Williams
 * Created on: Feb 8, 2016
 * Description:  Triangle - subclass of shape
 */

public class Triangle extends Shape {
	// side lengths
	private double side1;
	private double side2;
	private double side3;
	
	// default no-arg constructor
	public Triangle() {
		this(1.0, 1.0, 1.0);
	}
	
	// convenience constructor
	public Triangle(double side1, double side2, double side3) {
		setSide1(side1);
		setSide2(side2);
		setSide3(side3);
	}
	
	// calculate area from sidelengths
	public double getArea() {
		// Heron's formula
		double p = (getSide1() + getSide2() + getSide3())/2.0;
		double area = Math.sqrt(p * (p - getSide1()) * (p - getSide2()) * (p - getSide3())); 
		return area;
	}
	
	// textual description of a triangle
	public String toString() {
		return String.format("%s: I'm a Triangle", super.toString());
	}
	
	/** --------------------------------Getters/Setters---------------------------------*/
	public double getSide1() {
		return side1;
	}

	public void setSide1(double side1) {
		this.side1 = side1;
	}

	public double getSide2() {
		return side2;
	}

	public void setSide2(double side2) {
		this.side2 = side2;
	}

	public double getSide3() {
		return side3;
	}

	public void setSide3(double side3) {
		this.side3 = side3;
	}
	
}
