/**
* File: WaterBottleTest.java
* Class: CSCI 1302 - Lab03
* Description: Test LunchBag and LunchBox
*/

public class WaterBottleTest {
	public static void main(String[] args) {
		StandardWaterBottle wb1 = new StandardWaterBottle();
		Thermos thermos = new Thermos();
		
		// Output information about each WaterBotttle
		System.out.println(wb1.getInfo());
		System.out.println(thermos.getInfo());
	}
}
