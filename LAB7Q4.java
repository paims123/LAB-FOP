package lab7q4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LAB7Q4 {

    public static void main(String[] args) {
        // Replace Generator.TEXT_FILE with the actual file name
        String fileName = "input.txt"; 
        int[] counts = wordCount(fileName);
        System.out.printf("Char: %d, Word: %d, Line: %d%n", counts[0], counts[1], counts[2]);
    }

    public static int[] wordCount(String file) {
        int numOfLine = 0, numOfWord = 0, numOfChar = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                numOfLine++;
                numOfWord += line.trim().split("\\s+").length; // Handles multiple spaces
                numOfChar += line.length();
            }
        } catch (IOException ex) {
            System.err.println("Error: " + ex.getMessage()); // Proper error message
        }

        return new int[] { numOfChar, numOfWord, numOfLine };
    }
}

    

