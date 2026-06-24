package exceptions2;

public class TestCircleWithException {
	public static void main(String[] args) {
		try {
			Circle c1 = new Circle(5);
			Circle c2 = new Circle(-5);
			Circle c3 = new Circle(0);
			
			System.out.println(c1);
			System.out.println(c2);
			System.out.println(c3);
			
		} catch (IllegalArgumentException ex) {
			System.out.println(ex);
		}

		System.out.println("Number of objects created: " +
				Circle.getNumberOfCircles());
	}
}