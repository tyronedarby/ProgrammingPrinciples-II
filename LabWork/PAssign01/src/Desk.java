/**
* File: Desk.java
* Class: CSCI 1302
* Author: Tyrone Darby
* Created on: Jan 24, 2026
* Last Modified: Jan 24, 2026
* Description: Make Desk objects and get methods for its variables
*/

public class Desk {
	private int numDrawers; 
	private static int numDesks;
	private double surfaceHeight;
	private boolean standing;
	private String materialType, manufactureState;
	
	/** Default/no-arg constructor */
	public Desk() {
		setNumDrawers(4);
		setSurfaceHeight(27.0);
		setStanding(false);
		setMaterialType("Pine");
		setManufactureState("North Carolina");
		Desk.numDesks++;
	}
	
	/** Convenience constructor */
	public Desk(int numOfDrawers){
		setNumDrawers(numOfDrawers);
		setSurfaceHeight(27.0);
		setStanding(false);
		setMaterialType("Pine");
		setManufactureState("North Carolina");
		Desk.numDesks++;
	}
	
	/** Convenience constructor */
	public Desk(int numOfDrawers, double surfaceHeight, boolean standing, String materialType, String manufactureState){
		setNumDrawers(numOfDrawers);
		setSurfaceHeight(surfaceHeight);
		setStanding(standing);
		setMaterialType(materialType);
		setManufactureState(manufactureState);
		Desk.numDesks++;
	}
	
	// Create a getInfo method to get data from desk class 
	public String getInfo() {
		return String.format("Desk Information\nNumber Drawers:\t%d\nSurface Height:\t%.2f inches\nStanding:\t%b\nMaterial:\t%s\nManufactured:\t%s%n", 
				getNumDrawers(), getSurfaceHeight(), isStanding(), getMaterialType(), getManufactureState());
	}
    
	// Create getter and mutator for all data member
	public int getNumDrawers() {
		return numDrawers;
	}

	public void setNumDrawers(int numDrawers) {
		if (numDrawers >= 0 && numDrawers <= 8) {
			this.numDrawers = numDrawers;
		} else {
			this.numDrawers = 4;
		}
	}

	public static int getNumDesks() {
		return numDesks;
	}

	public static void setNumDesks(int numDesks) {
		Desk.numDesks = numDesks;
	}

	public double getSurfaceHeight() {
		return surfaceHeight;
	}

	public void setSurfaceHeight(double surfaceHeight) {
		if(surfaceHeight >= 24.0 && surfaceHeight <= 45.0) {
			this.surfaceHeight = surfaceHeight;
		} else {
			this.surfaceHeight = 27.0;
		}
	}

	public boolean isStanding() {
		return standing;
	}

	public void setStanding(boolean standing) {
		this.standing = standing;
	}

	public String getMaterialType() {
		return materialType;
	}

	public void setMaterialType(String materialType) {
		if (materialType.length() >= 3) {
			this.materialType = materialType;
		} else {
			this.materialType = "Oak";
		}
	}

	public String getManufactureState() {
		return manufactureState;
	}

	public void setManufactureState(String manufactureState) {
		if(manufactureState.length() >= 4) {
			this.manufactureState = manufactureState;
		} else {
			this.manufactureState = "Iowa";
		}
	}		
}