/**
 * File: csci1302/Browser.java
 * @author Christopher Williams
 * Created on: Aug 31, 2017
 * Description: Represent a single-tabbed browser  
 */

public class Browser {
	// Data members
	private double version;
	private Tab tab;
	
	// constructor
	public Browser() {
		setVersion(1.0);
		setTab(new Tab()); // need to instantiate aggregated/composed objects
	}

	// Accessors/Mutators
	public Tab getTab() {
		return tab;
	}

	public void setTab(Tab tab) {
		this.tab = tab;
	}

	public double getVersion() {
		return version;
	}

	public void setVersion(double version) {
		this.version = version;
	}
}