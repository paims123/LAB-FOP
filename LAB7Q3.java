package lab7q3;

import java.io.*;

public class LAB7Q3 {

    public static void main(String[] args) {
        generateReverseTextFile("input.txt", "output.txt");
    }

    public static void generateReverseTextFile(String fromFile, String toFile) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fromFile));
             PrintWriter writer = new PrintWriter(new FileWriter(toFile))) {
            
            String line;
            while ((line = reader.readLine()) != null) {
                writer.println(new StringBuilder(line).reverse().toString());
            }
            
        } catch (IOException ex) {
            System.err.println("Error: " + ex.getMessage());
        }
    }
}

