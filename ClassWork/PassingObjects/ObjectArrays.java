/**
 * File: csci1302/ObjectArrays.java
 * Package: 
 * @author Christopher Williams
 * Created on: Jan 22, 2020
 * Last Modified:  Jan 22, 2020
 * Description:  Demonstrate use of an array of objects
 */
public class ObjectArrays {

	public static void main(String[] args) {
		Circle[] circleArray = new Circle[10];

		// initialize objects in array, must instantiate to use
		for (int i = 0; i < circleArray.length; i++) {
			circleArray[i] = new Circle((int)(1 + Math.random() * 12)); // random whole-number radius
		} 
		
		// iterate over array and print circle info
		for (int i = 0; i < circleArray.length; i++) {
			System.out.printf("Radius:\t\t%.2f%nArea:\t\t%.2f%nCircumference:\t%.2f%n%n",
					circleArray[i].getRadius(), circleArray[i].getArea(), circleArray[i].getPerimeter());
		}

	}

}
