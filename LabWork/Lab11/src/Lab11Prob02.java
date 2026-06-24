import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

/**
 * File: Lab11Prob02.java
 * Class: CSCI 1302
 * Author: [Your Name] & [Partner Name]
 * Created on: April 24, 2026
 * Description: Reads binary data into an ArrayList of Person objects, 
 * sorts them by salary (descending), and writes the 
 * formatted strings to people-salary-sorted.dat.
 */
public class Lab11Prob02 {
    public static void main(String[] args) {
        // Requirements: No package, File objects at "src/filename" [cite: 40, 41]
        File inputFile = new File("src/people.dat");
        File outputFile = new File("src/people-salary-sorted.dat");
        
        ArrayList<Person> people = new ArrayList<>();

        // Phase 1: Read binary data and populate ArrayList 
        try (DataInputStream input = new DataInputStream(new FileInputStream(inputFile))) {
            while (true) {
                int age = input.readInt();
                String name = input.readUTF();
                String address = input.readUTF();
                int zip = input.readInt();
                double salary = input.readDouble();

                // Create Person instance and add to list 
                people.add(new Person(age, name, address, zip, salary));
            }
        } catch (EOFException e) {
            // Reached end of file normally [cite: 56]
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }

        // Phase 2: Sort the list [cite: 76]
        // This uses the compareTo method in your Person class (Salary descending) [cite: 69]
        Collections.sort(people);

        // Phase 3: Write the sorted toString() data to the new file 
        try (DataOutputStream output = new DataOutputStream(new FileOutputStream(outputFile))) {
            for (Person p : people) {
                // toString() provides the specific currency formatting required [cite: 70]
                output.writeUTF(p.toString());
            }
            System.out.println("Sorted data successfully written to " + outputFile.getName());
        } catch (IOException e) {
            System.err.println("Error writing file: " + e.getMessage());
        }
    }
}