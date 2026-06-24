package exceptions2;

public class TestCircleWithCustomException {
	public static void main(String[] args) {
		try {
			new CircleWithRadiusException(5);
			new CircleWithRadiusException(-5);
			new CircleWithRadiusException(0);
			
		} catch (InvalidRadiusException ex) {
			System.out.println("Exception occurred: " + ex.getMessage());
		} 

		System.out.println("Number of objects created: " + CircleWithRadiusException.getNumberOfCircles());
	}
}
