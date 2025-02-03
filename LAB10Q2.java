package lab10q2;

import java.io.*;

interface MessageEncoder {
    String encode(String plainText);
    String decode(String cipherText);
}

class SubstitutionCipher implements MessageEncoder {
    private final int shift;

    public SubstitutionCipher(int shift) {
        this.shift = shift;
    }

    @Override
    public String encode(String plainText) {
        return shiftText(plainText, shift);
    }

    @Override
    public String decode(String cipherText) {
        return shiftText(cipherText, -shift);
    }

    private String shiftText(String text, int shift) {
        StringBuilder result = new StringBuilder();
        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isUpperCase(c) ? 'A' : 'a';
                c = (char) ((c - base + shift + 26) % 26 + base);
            }
            result.append(c);
        }
        return result.toString();
    }

    public void processFile(String inputFileName, String outputFileName, boolean isEncoding) throws IOException {
        // Using try-with-resources to handle resource management
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFileName));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName))) {

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(isEncoding ? encode(line) : decode(line));
                writer.newLine();
            }

            System.out.println((isEncoding ? "Encoded" : "Decoded") + " content successfully written to " + outputFileName);
        } catch (FileNotFoundException e) {
            System.err.println("Error: File not found - " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Error: I/O exception occurred - " + e.getMessage());
        }
    }
}

public class LAB10Q2 {
    public static void main(String[] args) {
        SubstitutionCipher cipher = new SubstitutionCipher(3);

        try {
            // Encode the plain text
            cipher.processFile("plainText.txt", "cipherText.txt", true);
            // Decode the cipher text
            cipher.processFile("cipherText.txt", "decodedText.txt", false);
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}  
