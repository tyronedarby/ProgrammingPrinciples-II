/**
 * File: csci1302/BrowserAgg.java
 * @author Christopher Williams
 * Created on: Feb 1, 2021
 * Description: Represent a single-tabbed browser  
 * 		Modified to show aggregation usage instead of composition
 */
package ch10;

public class BrowserAgg {
	// Data members
	private double version;
	private Tab tab;
	
	// constructor
	public BrowserAgg() {
		setVersion(1.0);
		setTab(new Tab()); // need to instantiate aggregated/composed objects
	}
	
	public BrowserAgg(Tab tab) {
		setTab(tab);
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
