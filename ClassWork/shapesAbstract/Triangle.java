package shapesAbstract;

public class Triangle extends Shape {

	private double side1;
	private double side2;
	private double side3;
	
	public Triangle() {
		setSide1(1.0);
		setSide2(1.0);
		setSide3(1.0);
	}
	
	public Triangle(double side1, double side2, double side3) {
		setSide1(side1);
		setSide2(side2);
		setSide3(side3);
	}
	
	public double getArea() {
		// Heron's formula
		double p = getPerimeter()/2;
		return Math.sqrt(p * (p-getSide1()) * (p-getSide2()) * (p-getSide3()));
	}
	
	public double getPerimeter() {
		return getSide1() + getSide2() + getSide3();
	}
	
	public String toString() {
		return String.format("I'm a Triangle with sides: %.2f, %.2f, %.2f", getSide1(), getSide2(), getSide3());
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
