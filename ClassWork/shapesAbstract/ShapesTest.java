package shapesAbstract;

public class ShapesTest {

	public static void main(String[] args) {
		// create a bunch of shapes
		Circle myCircle = new Circle();
		Circle myCircle2 = new Circle(10.0);
		Rectangle myRectangle = new Rectangle();
		Triangle myTriangle = new Triangle(6.0, 4.0, 5.0);
		Triangle myTriangle2 = new Triangle(4.0, 5.0, 6.0);
		
		// dump them into an array
		Shape[] myShapes = {myCircle, myCircle2, myRectangle, myTriangle, myTriangle2};
		
		// iterate over array and call displayShape
		for (Shape s : myShapes) {
			displayShape(s);
		}

		// check for equality of areas
		System.out.println("The circles have the same area: " + equalArea(myCircle, myCircle2));
		System.out.println("The triangles have the same area: " + equalArea(myTriangle, myTriangle2));

	}

	// Determine if two generic Shapes have the same area
	public static boolean equalArea(Shape s1, Shape s2) {
		return s1.getArea() == s2.getArea();
	}

	/** A method for displaying a geometric object */
	public static void displayShape(Shape object) {
		System.out.printf("%s%nThe area is %.2f%n", object, object.getArea());
		System.out.printf("The perimeter is %.2f%n%n", object.getPerimeter());
	}

}
