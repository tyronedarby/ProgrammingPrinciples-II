/**
 * File: Thermos.java
 * Class: CSCI 1302
 * Author: Brian Abbott, Tyrone Darby
 * Created on: 2/13/26
 * Last modified: 2/13/26
 * Description: Lab04 Problem 02
 */

public class Thermos extends WaterBottle {

    public Thermos() {
        super(4.0, 0.9);
    }

    public Thermos(double height, double radius) {
        super(height, radius);
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " and is appropriate for LunchBox instances";
    }
}