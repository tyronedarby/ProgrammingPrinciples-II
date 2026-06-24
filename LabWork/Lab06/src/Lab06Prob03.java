/**
 * File: Lab06Prob03
 * Author: Tyrone Darby, Charles Cooper, Franklin Ham
 * Created On: Feb 27, 2026
 * Last Modified: Feb 27, 2026
 * Description: Increase values based on there amount
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Lab06Prob03 {

	public static void main(String[] args) {
		File inputFile = new File("src/pricelist.txt");
		File ouputFile = new File("src/pricelist-lab06.txt");
		

		try(Scanner input = new Scanner(inputFile)) {
			PrintWriter output = new PrintWriter(ouputFile);
			double nums;
			while (input.hasNext()) {
				nums = input.nextDouble();
				// statement ot check whether num is less than 50, and then increase it by 6.25% of its amount 
				if (nums < 50) {
					nums = nums + (nums * .0625);
					// statement ot check whether num is equal to or greater than 50, less than 100, and then increase it by 12`.5% of its amount 
				} else if (nums >= 50 && nums <= 100) {
					nums = nums + (nums *.125);
					// statement ot check whether num is less than 100, and then increase it by 25% of its amount 
				} else {
					nums = nums + (nums * .25);
				}
				//Print prices
				output.printf("%.2f%n", nums);
				
			}
			output.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
