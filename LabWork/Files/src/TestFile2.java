import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TestFile2 {

	public static void main(String[] args) {
		File outFile = new File("src/TestFile2.txt");
		File deleteFile = new File("src/Palindrome.txt");
		
		try {
			PrintWriter o1 = new PrintWriter(deleteFile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		//System.out.println(deleteFile.exists());
		//deleteFile.delete();
		
		
		try {
			PrintWriter output = new PrintWriter(outFile);
			Scanner input = new Scanner(System.in);
			
			for(int i = 0; i < 4; i++) {
				System.out.print("Enter your full Name: ");
				String name = input.nextLine();
				
				output.println(name);
				//output.append(name);
			}
			System.out.println("Your names has been added");
			
			output.close();
			input.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		

	}

}
