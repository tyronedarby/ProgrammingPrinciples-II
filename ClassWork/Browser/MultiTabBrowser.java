/**
 * File: csci1302/MutiTabBrowser.java
 * @author Christopher Williams
 * Created on: Aug 31, 2017
 * Modified: Jan 22, 2018
 * Description: Partial implementation of multi-tab browser  
 */

public class MultiTabBrowser {
	// Data members
	private double version;
	private Tab[] tabs;

	// constructor
	public MultiTabBrowser() {
		setVersion(1.0);
		// need to instantiate aggregated/composed objects, how many?
		Tab[] tmpTabs = new Tab[1];
		tmpTabs[0] = new Tab();
		setTabs(tmpTabs);
	}
	
	// method members
	public void addTab(Tab tab) {
		// need to copy array and append
	}
	
	public void closeTab(int tab) {
		// need to find indexed tab and delete
		// then need to create new array with that
		// tab missing (copy remaining)
	}

	// Accessors/Mutators for all data members below
	public Tab getTab(int tabNum) {
		return tabs[tabNum];
	}

	public void setTab(int tabNum, Tab tab) {
		this.tabs[tabNum] = tab;
	}
	
	public Tab[] getTabs() {
		return tabs;
	}

	public void setTabs(Tab[] tabs) {
		this.tabs = tabs;
	}

	public double getVersion() {
		return version;
	}

	public void setVersion(double version) {
		this.version = version;
	}
}
