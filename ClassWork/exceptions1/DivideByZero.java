package exceptions1;

public class DivideByZero {
	public static void main(String[] args) {
		int num1 = 1;
		int num2 = 0;
		try {
			int result = quot(num1, num2);
			System.out.println(num1 + " / " + num2 
					+ " is " + result);
		} catch (ArithmeticException ex) {
			System.out.println("Error: " + 
					"an integer cannot be " + 
					"divided by zero ");
		}

	}

	public static int quot(int n1, int n2) {
		if (n2 == 0) {
			throw new ArithmeticException("Cannot divide by zero");
		}
		return n1 / n2;
	}


}
