/**
* File: PAssign04.java
* Class: CSCI 1302
* Author: Tyrone Darby
* Created on: Feb 21, 2026
* Last Modified: Feb 21, 2026
* Description: a Java program that continually asks the user for double values
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PAssign04 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		// Create Array list of doubles
		ArrayList<Double> numArrayList = new ArrayList<>();
		
		// Declare variables
		double sentinel = -999;
		double number = 0.0;
		double sum = 0.0;
		double average = 0.0;
		int arraySize = 0;
		
		// Loop until the user enter -999 value
		while (number != sentinel) {
			try {
				System.out.print("Enter a double value (-999 to exit): ");
				number = input.nextDouble();
				
				// Check if the user enter a duplicate number
				if (numArrayList.contains(number)) {
					throw new ArrayStoreException("Duplicate value");
				}
				if(number != sentinel) {
					// Populate the array with numbers from the user
					numArrayList.add(number);
					// Calculate the sum of the array
					sum += number;
					arraySize = numArrayList.size();
				}
				// Check for input mismatch values
			} catch (InputMismatchException ex) {
				System.out.println("That is not a valid double value.");
				input.nextLine();
			} catch (ArrayStoreException ex) {
				System.out.println(ex.getMessage());
				// Check for unexpected error
			} catch (Exception ex) {
				System.out.println("something unexpected occurred");
			}
		}
		
		// Check if the array is empty
		if(numArrayList.isEmpty() == false) {
			// Calculate the average of the array
			average = sum / (double) arraySize;
			System.out.println("\n" + numArrayList);
			System.out.printf("Average: %.2f%n", average);
			System.out.printf("Max: %.2f%n", Collections.max(numArrayList));
			System.out.printf("Min: %.2f%n", Collections.min(numArrayList));
		} else {
			System.out.println("There were no values to process");
		}
		input.close();
	}
}
