/**
 * File: csci1302/Tab.java
 * @author Christopher Williams
 * Created on: Jan 22, 2018
 * Description: Represent a browser tab object with URL and title properties  
 */

public class Tab {
	// data members
	private String title = "";
	private String URL = "";
	
	// Constructors
	public Tab() {
		// default no-arg
		this("http://www.georgiasouthern.edu");
		this.setTitle("Georgia Southern");
	}
	
	public Tab(String URL) {
		this.setURL(URL);
	}

	// Accessors/Mutators
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getURL() {
		return URL;
	}

	public void setURL(String URL) {
		this.URL = URL;
	}
	
	

}
