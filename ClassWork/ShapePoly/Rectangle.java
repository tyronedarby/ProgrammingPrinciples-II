/**
 * File: csci1302/Rectangle.java
 * Package: 
 * @author Christopher Williams
 * Created on: Feb 7, 2016
 * Description: Rectangle - subclass of Shape
 */

public class Rectangle extends Shape {	
	private double width;
	private double height;

	public Rectangle() {
		setWidth(1.0);
		setHeight(1.0);
	}

	public String toString() {
		return String.format("%s: I'm a Rectangle", super.toString());
	}
	
	protected String getInfo() {
		return String.format("%.2f, %.2f", getWidth(), getHeight());
	}
	
	public double getArea() {
		return width * height;
	}
	
	/** --------------------------------Getters/Setters---------------------------------*/
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	@Override
	public boolean equals(Object o) {
		if (o instanceof Rectangle) {
			// check if height and width
			if (((Rectangle) o).getHeight() == this.getHeight() &&
				((Rectangle) o).getWidth() == this.getWidth()) {
				return true;
			} else {
				return false;
			}
		} else { // not a Rectangle
			return false;
		}
	}
}
