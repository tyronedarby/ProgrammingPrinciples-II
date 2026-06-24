
/**
 * Tyrone Darby, Myles McGee, Peter Torek
* File: WaterBottleTest.java
* Class: CSCI 1302
* Description: Test WaterBottles
*/
import java.util.ArrayList;
import java.util.Collections;
public class WaterBottleTest {
	public static void main(String[] args) {
		ArrayList<WaterBottle> bottleArray = new ArrayList<>();
		ArrayList<Double> volumeArray = new ArrayList<>();
		double volume = 0;
		
		//populate array
		bottleArray.add(new WaterBottle());
		bottleArray.add(new StandardWaterBottle());
		bottleArray.add(new Thermos());
		bottleArray.add(new StandardWaterBottle(10, 0.7));
		bottleArray.add(new Thermos(5, 0.5));
		
		//print size
		System.out.println("Number of bottles: " + bottleArray.size());
		
		//print info and populate volumeArray
		for (int i = 0; i < bottleArray.size(); i++) {
			System.out.println(bottleArray.get(i));
			volume += bottleArray.get(i).getVolume();
			
			//populate
			volumeArray.add(bottleArray.get(i).getVolume());
		}
		
		//print total volume
		System.out.printf("Total volume: %.4f%n", volume);
		
		//print max and min
		System.out.printf("Max volume: %.4f%n", Collections.max(volumeArray));
		System.out.printf("Min volume: %.4f%n", Collections.min(volumeArray));
		
	}
}
