package shapesAbstract;

public abstract class Shape {
	
	private static int numShapes;
	
	protected Shape() {
		Shape.increaseNumShapes();
	}
	
	public String toString() {
		return "I'm a Shape";
	}
	
	public abstract double getArea();
	public abstract double getPerimeter();
	
	/** --------------------------------Getters/Setters---------------------------------*/
	private static void increaseNumShapes() {
		Shape.numShapes++;
	}
	public static int getNumShapes() {
		return Shape.numShapes;
	}

}