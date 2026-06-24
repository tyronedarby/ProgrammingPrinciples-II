/**
 * File: StarndardWaterBottle.java
 * Class: CSCI 1302
 * Author: Brian Abbott, Tyrone Darby
 * Created on: 2/13/26
 * Last modified: 2/13/26
 * Description: To be filled in by the user.
 */

public class StandardWaterBottle extends WaterBottle {

    public StandardWaterBottle() {
        super();
    }

    public StandardWaterBottle(double height, double radius) {
        super(height, radius);
    }

    public String getInfo() {
        return super.getInfo() + " and is appropriate for LunchBag instances";
    }

}