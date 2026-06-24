/**
* File: PAssign.java
* Class: CSCI 1302
* Author: Tyrone Darby
* Created on: Jan 24, 2026
* Last Modified: Jan 24, 2026
* Description: Make Desk objects and get methods for its variables
*/

public class PAssign01 {
	public static void main(String[] args) {
		// Create objects for desk
		Desk desk1 = new Desk(5, 43.50, true, "Birch", "Tennessee");
		Desk desk2 = new Desk(8, 29.20, false, "Mahogany", "California");
		Desk desk3 = new Desk(4, 40.10, true, "Pine", "Florida");
		Desk desk4 = new Desk(0, 27.0, false, "Maple", "New York");
		Desk desk5 = new Desk(2, 28.10, false, "Oak", "Washington");
		
		//Store all desk objects in an array
		Desk[] allDesk = {desk1, desk2, desk3, desk4, desk5}; 
		
		//Print all desk information
		printDesks(allDesk);
	}
	
	public static void printDesks(Desk[] array) {
		for(int i = 0; i < array.length; i++) {
			 System.out.println("Desk " + (i + 1));
			System.out.println(array[i].getInfo());
		}
	}
}
