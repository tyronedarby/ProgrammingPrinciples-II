/**
* File: PAssign03.java
* Class: CSCI 1302
* Author: Tyrone Darby
* Created on: Feb 14, 2026
* Last Modified: Feb 14, 2026
* Description: Make Computer and VideoCard classes/objects and get methods for its variables
*/

public class PAssign03 {
	public static void main(String[] args) {
		// Create a Computer and VideoCard objects.
		Computer computer1 = new Computer(new IntegratedVideoCard());
		
		VideoCard vc2 = new DiscreteVideoCard("discrete", "PCIEx16", 575, "8-pin", 24);
		Computer computer2 = new Computer("Dell", "Optiplex", vc2);
		
		VideoCard vc3 = new IntegratedVideoCard("integrated", 120, 4);
		Computer computer3 = new Computer("Lenovo", "IdeaCentre", vc3);
		
		VideoCard vc4 = new DiscreteVideoCard("discrete", "PCIEx8", 150, "6-pin", 8);
		Computer computer4 = new Computer("HP", "Omen Obelisk", vc4);
		
		VideoCard vc5 = new IntegratedVideoCard("integrated", -110, 3);
		Computer computer5 = new Computer("Lenovo", "IdeaCentre", vc5);
		
		// Store computer objects in an array
		Computer[] computers = {computer1, computer2, computer3, computer4, computer5};
		
		printArray(computers);
	}
	
	// Print computer object method
	public static void printArray(Computer[] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i].toString());
		}
	}
}

class VideoCard {
	private String type;
	private int powerRequirement;
	private int memorySize;
	
	/** Default/no-arg constructor */
	public VideoCard() {
		setType("integrated");
		setPowerRequirement(100);
		setMemorySize(1);
	}
	
	/** Convenience constructor */
	public VideoCard(String type, int powerRequirement, int memorySize) {
		setType(type);
		setPowerRequirement(powerRequirement);
		setMemorySize(memorySize);
	}
	
	// Get information about Video Card
	public String toString() {
		return String.format("Type: %s\nPower: %d W\nMemory: %d GB\n", getType(), getPowerRequirement(), getMemorySize());
	}
	
	// Create getter and mutator for all data member for Video Card
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public int getPowerRequirement() {
		return powerRequirement;
	}
	
	public void setPowerRequirement(int powerRequirement) {
		if(powerRequirement >= 1 && powerRequirement <= 500) {
			this.powerRequirement = powerRequirement;
		} else if(powerRequirement > 500) {
			this.powerRequirement = 400;
		} else {
			this.powerRequirement = 75;
		}
	}
	
	public int getMemorySize() {
		return memorySize;
	}
	
	public void setMemorySize(int memorySize) {
		if(memorySize >= 1 && memorySize <= 16) {
			this.memorySize = memorySize;
		} else if(memorySize > 16) {
			this.memorySize = 16;
		} else {
			this.memorySize = 1;
		}
	}
	
}

class Computer {
	private String brand, model;
	private VideoCard videoCard;
	
	/** Default/no-arg constructor */
	public Computer() {
		setBrand("OEM");
		setModel("Basic");
		setVideoCard(new IntegratedVideoCard());
	}
	
	/** Convenience constructor */
	public Computer(VideoCard videoCard) {
		this();
		setVideoCard(videoCard);
	}
	
	/** Convenience constructor */
	public Computer(String brand, String model, VideoCard videoCard) {
		setBrand(brand);
		setModel(model);
		setVideoCard(videoCard);
	}
	
	// Get information about computer.
	public String toString() {
		return  String.format("%s %s\nVideo Card Info:\n%s", getBrand(),getModel(), getVideoCard().toString());
	}
	
	// Create getter and mutator for all data member for Computer.
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public VideoCard getVideoCard() {
		return videoCard;
	}
	
	public void setVideoCard(VideoCard videoCard) {
		this.videoCard = videoCard;
	}
}

class IntegratedVideoCard extends VideoCard {
	private int sharedMemory;
	private boolean usesComputerRAM;
	
	/** Default/no-arg constructor */
	public IntegratedVideoCard() {
		super();
		setSharedMemory(2);
		setUsesComputerRAM(false);
		
	}
	
	/** Convenience constructor */
	public IntegratedVideoCard(String type, int powerRequirement, int memorySize, int sharedMemory, boolean usesComputerRAM) {
		super(type, powerRequirement, memorySize);
		setSharedMemory(sharedMemory);
		setUsesComputerRAM(usesComputerRAM);
	}
	
	/** Convenience constructor */
	public IntegratedVideoCard(String type, int powerRequirement, int memorySize) {
		super(type, powerRequirement, memorySize);
		setSharedMemory(2);
		setUsesComputerRAM(false);
	}
	
	/** Convenience constructor */
	public IntegratedVideoCard(int sharedMemory, boolean usesComputerRAM) {
		setSharedMemory(sharedMemory);
		setUsesComputerRAM(usesComputerRAM);
	}
	
	@Override
	public String toString() {
		return String.format("%s\nShared Memory: %d GB\nComputer RAM: %b\n", super.toString(), getSharedMemory(), getUsesComputerRAM());
	}
	
	// Create getter and mutator for all data member 
	public int getSharedMemory() {
		return sharedMemory;
	}

	public void setSharedMemory(int sharedMemory) {
		this.sharedMemory = sharedMemory;
	}

	public boolean getUsesComputerRAM() {
		return usesComputerRAM;
	}

	public void setUsesComputerRAM(boolean usesComputerRAM) {
		this.usesComputerRAM = usesComputerRAM;
	}
	
	
}

class  DiscreteVideoCard extends VideoCard {
	private String connectionType, usesExternalPower;
	
	/** Default/no-arg constructor */
	public DiscreteVideoCard() {
		super();
		setType("discrete");
		setConnectionType("PCIEx8");
		setUsesExternalPower("6-pin");
	}
	
	/** Convenience constructor */
	public DiscreteVideoCard(String type, String connectionType, int powerRequirement, String usesExternalPower, int memorySize) {
		super(type, powerRequirement,memorySize);
		setConnectionType(connectionType);
		setUsesExternalPower(usesExternalPower);
	}
	
	/** Convenience constructor */
	public DiscreteVideoCard(String connectionType, String usesExternalPower) {
		setConnectionType(connectionType);
		setUsesExternalPower(usesExternalPower);
		setType("discrete");
	}
	
	@Override
	public String toString() {
		return  String.format("%s\nConnection: %s\nExternal Power: %s%n", super.toString(), getConnectionType(), getUsesExternalPower());
	}
	
	// Create getter and mutator for all data member
	public String getConnectionType() {
		return connectionType;
	}

	public void setConnectionType(String connectionType) {
		this.connectionType = connectionType;
	}

	public String getUsesExternalPower() {
		return usesExternalPower;
	}

	public void setUsesExternalPower(String usesExternalPower) {
		this.usesExternalPower = usesExternalPower;
	}	
}