import java.util.ArrayList;
import java.util.Collections;
/**
 * File: WaterBottleTest.java
 * Class: CSCI 1302 - Lab07
 * Description: Interfaces lab
 */

public class WaterBottleTest {

	// TODO: Prob03 - Update test program as requested in lab directions
	public static void main(String[] args) {
		ArrayList<WaterBottle> bottleArr = new ArrayList<>();
		bottleArr.add(new StandardWaterBottle(10, 0.7));
		bottleArr.add(new StandardWaterBottle());
		bottleArr.add(new Thermos(5, 0.5));
		bottleArr.add(new Thermos());
		bottleArr.add(new Thermos(6, 0.4));
		
		double totalVolume = 0;
		double maxVolume = bottleArr.get(0).getVolume(), minVolume = bottleArr.get(0).getVolume();
		
		
		
		for (WaterBottle bottle : bottleArr) {
			System.out.println(bottle);
			totalVolume += bottle.getVolume();
			
			if (bottle.getVolume() > maxVolume) {
				maxVolume = bottle.getVolume();
			}
			
			if (bottle.getVolume() < minVolume) {
				minVolume = bottle.getVolume();
			}
		}
		
		// output aggregate statistics
	
		Collections.sort(bottleArr);
		System.out.println("\nSorted: ");
		
		for (WaterBottle bottle : bottleArr) {
			System.out.println(bottle);
		}
		
		System.out.printf("\nLargest: %s\n\nSmallest: %s\n", Collections.max(bottleArr), Collections.min(bottleArr));
	}
	
	
}