package Ch10Classes;

public class CourseTest {
	public static void main(String[] args) {
		// create two courses
		Course course1 = new Course("Data Structures");
		Course course2 = new Course("Database Systems");

		// add some students to each course
		course1.addStudent("Peter Jones");
		course1.addStudent("Brian Smith");
		course1.addStudent("Anne Kennedy");

		course2.addStudent("Peter Jones");
		course2.addStudent("Steve Smith");

		// get count and list of students in course 1
		System.out.printf("Number of students in course1: %d\n", course1.getNumberOfStudents());
		String[] students = course1.getStudents();
		for (int i = 0; i < course1.getNumberOfStudents(); i++)
			System.out.print(students[i] + ", ");
		System.out.println();
		
		// get count of students in course 2
		System.out.println();
		System.out.printf("Number of students in course2: %d\n", course2.getNumberOfStudents());
	}
}
