public class PolymorphismDemo {
	public static void main(String[] args) {
		printObject(new GraduateStudent());
		printObject(new Student());
		printObject(new Person());
		printObject(new Object());
	}
	
	public static void printObject(Object x) {
		System.out.println(x.toString());
	}
}

class GraduateStudent extends Student {
}

class Student extends Person {
	@Override
	public String toString() {
		return "Student";
	}
}

class Person extends Object {
	@Override
	public String toString() {
		return "Person";
	}
}