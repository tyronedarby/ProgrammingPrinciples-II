public class StackOfIntegersTest {
	public static void main(String[] args) {
		// create a stack
		StackOfIntegers stack = new StackOfIntegers();

		// push 10 elements onto stack in order
		for (int i = 0; i < 10; i++) {
			stack.push(i);
		}

		// pop elements off from top-down until empty 
		while (!stack.empty()) {
			System.out.print(stack.pop() + " ");
		}
	}
}