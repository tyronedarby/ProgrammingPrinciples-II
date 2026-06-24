package shapesAbstract;

public class Rectangle extends Shape {
	
	private double width;
	private double height;

	public Rectangle() {
		setWidth(1.0);
		setHeight(1.0);
	}

	public String toString() {
		return String.format("I'm a Rectangle with width %.2f and height %.2f", getWidth(), getHeight());
	}
	
	protected String getInfo() {
		return String.format("%.2f, %.2f", getWidth(), getHeight());
	}
	
	public double getArea() {
		return width * height;
	}
	
	public double getPerimeter() {
		return 2 * (width + height);
	}
	
	/** --------------------------------Getters/Setters---------------------------------*/
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = (width >= 0) ? width : 0;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = (height >= 0) ? height : 0;
	}
	
	
}
