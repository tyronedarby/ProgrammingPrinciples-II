/**
* File: WaterBottleTest.java
* Class: CSCI 1302 - Lab03
* Description: Water bottle lab problems
*/

public class WaterBottleTest {
	public static void main(String[] args) {
		// TODO: Prob 01 - Create the LunchBag class using a WaterBottle instance as a composed data member
		// TODO: Prob 02 - Create the LunchBox class using a WaterBottle instance as a composed data member
		WaterBottle w1 = new WaterBottle();
		WaterBottle w2 = new WaterBottle(9.5, 1.5);
		WaterBottle w3 = new WaterBottle(10, 2.5);
		w3.setColor("blue");
		
		// Output information about each WaterBotttle
		System.out.println(w1.getInfo());
		System.out.println(w2.getInfo());
		System.out.println(w3.getInfo());
	}
}
