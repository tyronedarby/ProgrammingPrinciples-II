package ch10;

/**
 * Create a browser that can open tabs that already exist
 * Modified version of the composition Browser/Tab shown in class
 */

public class BrowserAggTest {

	public static void main(String[] args) {
		// browser instance
		BrowserAgg b = new BrowserAgg();
		
		// a Tab created by someone else
		Tab t = new Tab();
		t.setURL("http://google.com");
		t.setTitle("Google");
		
		// let the browser know the tab belongs to them
		b.setTab(t);

		System.out.println(b.getTab().getURL());
		System.out.println(b.getTab().getTitle());
		
		b.getTab().setURL("http://www.georgiasouthern.edu");
		System.out.println(b.getTab().getURL());
	}

}
