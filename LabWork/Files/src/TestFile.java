import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TestFile {
	public static void main(String[] args) throws FileNotFoundException {
		File outFile = new File("src/TestFile.txt");
		PrintWriter output = new PrintWriter(outFile);
		
		//System.out.println(outFile.exists());
		int randNum;
		output.print("Tyrone Darby ");
		output.println(22);
		output.print("John Brown ");
		output.println(32);
		
		for(int i = 0; i < 100; i++) {
			randNum = (int) (Math.random() * 100);
			output.print("N/A N/A ");
			output.println(randNum);
		}
		output.close();
		
		try(Scanner input = new Scanner(outFile)) {
			while (input.hasNext()) {
				String fName = input.next();
				String lName = input.next();
				int age = input.nextInt();
				//int rNum = input.nextInt();
				
				System.out.printf("Name: %s %s\nAge: %d\n", fName, lName, age);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
