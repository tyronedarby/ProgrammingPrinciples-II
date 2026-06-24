// Lawson Cahill & Tyone Darby
/**
* File: PAssign00.java
* Class: CSCI 1302
* Author: s
* Created on: Jun 6, 2016
* Last Modified: Aug 16, 2018
* Description: Display three messages to the console
*/
public class WaterBottle {
double height;
double radius;
String color;

WaterBottle(){
	color = "green";
}
double getVolume(){

	double volume = Math.PI*Math.pow(radius, 2)*height;
	return volume;
	}
}

