/**
 * File: csci1302/Buildings.java
 * @author Christopher Williams
 * Created on: Sep 15, 2016
 * Description:  Create an ArrayList of buildings on campus  
 */

import java.util.*;

public class Buildings {

	public static void main(String[] args) {
		ArrayList<String> buildings = new ArrayList<String>();
		buildings.add("Ashmore");
		buildings.add("Science Center");
		buildings.add("University Hall");
		buildings.add("Victor");
		buildings.add("Solms");
		System.out.println(buildings);

		buildings.remove("Victor");
		System.out.println(buildings);
		
		buildings.add(buildings.size()-1, "Victor");
		System.out.println(buildings);
		
		System.out.println(buildings.get(4));
		buildings.set(0, "Ashmore Hall");
		System.out.println(buildings);

	}

}
