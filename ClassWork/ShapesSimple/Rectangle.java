/**
 * File: csci1302/Rectangle.java
 * @author Christopher Williams
 * Created on: Jan 12, 2016
 * Modified: Aug 14, 2018
 * Description:  Emulates a rectangle as an object (incomplete)
 */

public class Rectangle {
	/** length and width of Rectangle */
	double length = 1.0;
	double width = 1.0;
			
	/** Return the area of this rectangle */
	double getArea() {
		return length * width;
	}
	
	/** Return the perimeter of this rectangle */
	double getPerimeter() {
		return 2 * (length + width);
	}
}
