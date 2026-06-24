
/**
* File: PAssign00.java
* Class: CSCI 1302
* Author: Lawson Cahill & Tyrone Darby
* Created on: Jan 16, 2026
* Last Modified: Jan 16, 2026
* Description: Display three messages to the console
*/
public class WaterBottleTest {
	
	public static void main(String[] args) {
		// create objects
		WaterBottle waterbottle1 = new WaterBottle();
		WaterBottle waterbottle2 = new WaterBottle();
		WaterBottle waterbottle3 = new WaterBottle();
		
		waterbottle1.height = 12.0;
		waterbottle2.height = 9.5;
		waterbottle3.height = 10.;
		
		waterbottle1.radius = 2.0;
		waterbottle2.radius = 1.5;
		waterbottle3.radius = 2.5;
 
		waterbottle3.color = "blue";
		//print waterbottles data
		System.out.printf("A %s water bottle with height %.1f, radius %.1f, and volume %.14f%n", waterbottle1.color, waterbottle1.height, waterbottle1.radius, waterbottle1.getVolume());
		System.out.printf("A %s water bottle with height %.1f, radius %.1f, and volume %.14f%n", waterbottle2.color, waterbottle2.height, waterbottle2.radius, waterbottle2.getVolume());
		System.out.printf("A %s water bottle with height %.1f, radius %.1f, and volume %.14f%n", waterbottle3.color, waterbottle3.height, waterbottle3.radius, waterbottle3.getVolume());
	}
}

