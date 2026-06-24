import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lab06Prob02 {

	public static void main(String[] args) {
		File inputFile = new File("src/pricelist.txt");
		
		try(Scanner input = new Scanner(inputFile)) {
			double nums;
			while (input.hasNext()) {
				nums = input.nextDouble();
				//Print prices
				System.out.printf("$%.2f%n", nums);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
