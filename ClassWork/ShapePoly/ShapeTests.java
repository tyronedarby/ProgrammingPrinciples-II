/**
 * File: csci1302/ShapeTests.java
 * @author Christopher Williams
 * Created on: Feb 7, 2016
 * Description:  Test our Shape classes and polymorphic getTotalArea method
 */

public class ShapeTests {

	public static void main(String[] args) {
		// create some shapes, hold them in a single collection
		Circle myCircle = new Circle();
		System.out.println(myCircle);
		System.out.printf("Area: %.2f\n", myCircle.getArea());
		System.out.println();
		
		Circle myCircle2 = new Circle(7.0);
		System.out.println(myCircle2);
		System.out.printf("Area: %.2f\n", myCircle2.getArea());
		System.out.println();
			
		Rectangle myRectangle = new Rectangle();
		System.out.println(myRectangle);
		System.out.printf("Area: %.2f\n", myRectangle.getArea());
		System.out.println();

		Triangle myTriangle = new Triangle(3.0, 4.0, 5.0);
		System.out.println(myTriangle);
		System.out.printf("Area: %.2f\n", myTriangle.getArea());
		System.out.println();	
			
		Shape[] allShapes = {myCircle, myCircle2, myRectangle, myTriangle};
		System.out.printf("There are %d total shapes.\n", Shape.getNumShapes());
		System.out.printf("Total Area: %.2f\n", getTotalArea(allShapes));
	}
	
	public static double getTotalArea(Shape[] shapes) {
		double total = 0;
		for (Shape cs : shapes) {
			total += cs.getArea();
		}
		return total;
	}

}
