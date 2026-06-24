package shapesAbstract;

public class Circle extends Shape {
	
	private double radius;
	
	public Circle() {
		setRadius(5.0);
	}
	
	public Circle(double radius) {
		setRadius(radius);
	}
	
	public String toString() {
		return String.format("I'm a Circle with radius %.2f", this.getRadius());
	}
	
	public double getArea() {
		return Math.PI * getRadius() * getRadius();
		
	}
	
	public double getPerimeter() {
		return 2 * Math.PI * getRadius(); 
	}
	
	public boolean equals(Object o) {
		if (o instanceof Circle) {
			if (((Circle) o).getRadius() == this.getRadius()) {
				return true;
			} else {
				return false;
			}

		} else { // not a circle
			return false;
		}
	}
	

	/** --------------------------------Getters/Setters---------------------------------*/
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = (radius >= 0) ? radius : 0;
	}
}
