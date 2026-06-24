public class Animal {
	// DATA MEMBERS -----------------------------------------------------------
	private String type;
	private int weight;

	// CONSTRUCTORS -----------------------------------------------------------
	public Animal() {
		this("Animal");
	}
	
	public Animal(String type) {
		this.setType(type);
	}

	// METHODS -----------------------------------------------------------
	public String toString() {
		return "Animal Type: ";
	}
	
	/**
	 * Make the Animal speak
	 * @return the sound the Animal makes
	 */
	public String speak() {
		return "";
	}
	
	public String getInfo() {
		return this.getType();
	}
	
	// ACCESSORS/MUTATORS -----------------------------------------------------
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
}
