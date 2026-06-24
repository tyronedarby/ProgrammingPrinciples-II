/**
 * File: csci1302/Person.java
 * @author Christopher Williams
 * Created on: Jan 16, 2017
 * Modified on: Aug 22, 2022
 * Description:  Emulate a Person class with birth year, name, and address
 */

public class Person {
	// data members - always private
	private int birthYear;
	private String name;
	private String address;
	
	// default no-arg constructor
	public Person() {
		birthYear = 1970;
		name = "John Q. Doe";
		address = "123 Main Street";
	}
	
	// conv constructor to set name
	public Person(String newName) {
		name = newName;
	}

	// conv. constructor method to set name and address
	public Person(String newName, String newAddress) {
		name = newName;
		address = newAddress;
	}
	
	public Person(String string, String string2, int i) {
        //TODO Auto-generated constructor stub
    }

    /** Stub methods */
	public void eat() { }
	public void sleep() { }
	
	/** Calculate age based on current year, ignoring current month */
	public int getAge() {
		return 2022 - birthYear;
	}
	
	/** Get name and address */
	public String getInfo() {
		return String.format("%s, %s", name, address);
	}

    public void setBirthYear(int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setBirthYear'");
    }

    public void setAddress(String string) {
        address = string;
    }

}
