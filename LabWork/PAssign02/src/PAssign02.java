/**
* File: PAssign02.java
* Class: CSCI 1302
* Author: Tyrone Darby
* Created on: Feb 1, 2026
* Last Modified: Feb 1, 2026
* Description: Make Computer and VideoCard classes/objects and get methods for its variables
*/

public class PAssign02 {
	public static void main(String[] args) {
		// Create a Computer and VideoCard objects.
		VideoCard vc1 = new VideoCard();
		Computer computer1 = new Computer(vc1);
		
		VideoCard vc2 = new VideoCard("discrete", "PCIEx16", 400, "8-pin", 16);
		Computer computer2 = new Computer("Dell", "Optiplex", vc2);
		
		VideoCard vc3 = new VideoCard("integrated", "N/A", 120, "N/A", 4);
		Computer computer3 = new Computer("Lenovo", "IdeaCentre", vc3);
		
		VideoCard vc4 = new VideoCard("discrete", "PCIEx8", 150, "6-pin", 8);
		Computer computer4 = new Computer("HP", "Omen Obelisk", vc4);
		
		VideoCard vc5 = new VideoCard("integrated", "N/A", 75, "N/A", 2);
		Computer computer5 = new Computer("Lenovo", "IdeaCentre", vc5);
		
		// Store computer objects in an array
		Computer[] computerLab = {computer1, computer2, computer3, computer4, computer5};
		
		for(int i = 0; i < computerLab.length; i++) {
			System.out.println(computerLab[i].getInfo());
		}
	}
}

class VideoCard {
	private String type, connectionType, externalPower;
	private int powerRequirement;
	private int memorySize;
	
	/** Default/no-arg constructor */
	public VideoCard() {
		setType("integrated");
		setConnectionType("N/A");
		setPowerRequirement(100);
		setExternalPower("N/A");
		setMemorySize(1);
	}
	
	/** Convenience constructor */
	public VideoCard(String type, String connectionType, int powerRequirement, String externalPower, int memorySize) {
		setType(type);
		setConnectionType(connectionType);
		setPowerRequirement(powerRequirement);
		setExternalPower(externalPower);
		setMemorySize(memorySize);
	}
	
	// Get information about Video Card
	public String getInfo() {
		return String.format("Type: %s\nConnection: %s\nPower: %dW\nExt Power: %s\nMemory: %dGB\n",
				getType(), getConnectionType(), getPowerRequirement(), getExternalPower(), getMemorySize());
	}
	
	// Create getter and mutator for all data member for Video Card
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getConnectionType() {
		return connectionType;
	}
	
	public void setConnectionType(String connectionType) {
		this.connectionType = connectionType;
	}
	
	public String getExternalPower() {
		return externalPower;
	}
	
	public void setExternalPower(String externalPower) {
		this.externalPower = externalPower;
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
		setVideoCard(new VideoCard());
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
	public String getInfo() {
		return String.format("%s %s\nVideo Card Info:\n%s", getBrand(), getModel(), getVideoCard().getInfo());
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