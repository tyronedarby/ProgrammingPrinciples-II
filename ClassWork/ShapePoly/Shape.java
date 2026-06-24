/**
 * File: csci1302/Shape.java
 * @author Christopher Williams
 * Created on: Feb 4, 2016
 * Description:  Create a Shape superclass 
 */

public class Shape {
	private static int numShapes;
	
	public Shape() {
		Shape.increaseNumShapes();
	}
	
	public String toString() {
		return "Shape";
	}
	
	public double getArea() {
		return 0.0;
	} 
	
	/** --------------------------------Getters/Setters---------------------------------*/
	private static void increaseNumShapes() {
		Shape.numShapes++;
	}
	public static int getNumShapes() {
		return Shape.numShapes;
	}

}