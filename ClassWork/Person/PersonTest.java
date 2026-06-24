/**
 * File: csci1302/PersonTest.java
 * @author Christopher Williams
 * Created on: Jan 16, 2017
 * Modified on: Aug 22, 2022
 * Description:  Test the person class
 */
public class PersonTest {

	public static void main(String[] args) {
		Person pers1 = new Person("Joe Rawlings", "123 SW Main Street", 1992);
		Person pers2 = new Person("Mary Smith");
		Person pers3 = new Person("Jane Doe", "35 E. Gaston Street");

		// set and change address, birth year
		pers2.setBirthYear(1985);
		pers2.setAddress("145 Not Main Street");
		
		// trigger error checking on birth year
		pers3.setBirthYear(1892);
		
		// retrieve some of those things and make the people speak
		System.out.printf("%s%nBorn in %d, age: %d%n%n", pers1.getInfo(), pers1.getBirthYear(), pers1.getAge());
		System.out.printf("%s%nBorn in %d, age: %d%n%n", pers2.getInfo(), pers2.getBirthYear(), pers2.getAge());
		System.out.printf("%s%nBorn in %d, age: %d%n%n", pers3.getInfo(), pers3.getBirthYear(), pers3.getAge());
	}

}
