package lab7q5;

import java.io.*;

class Generator {
    static String PERSON_FILE = "personData.dat"; // Specify the correct file path
}

public class LAB7Q5 {

    public static void main(String[] args) {
        try (ObjectInputStream input = new ObjectInputStream(new FileInputStream(Generator.PERSON_FILE))) {
            int num = input.readInt();

            String[] nameArr = new String[num];
            int[] ageArr = new int[num];
            char[] genderArr = new char[num];
            int[] indexArr = new int[num];

            for (int i = 0; i < num; i++) {
                indexArr[i] = i;
                nameArr[i] = input.readUTF();
                ageArr[i] = input.readInt();
                genderArr[i] = input.readChar();
            }

            sortIndexByName(indexArr, nameArr);
            prettyPrint(indexArr, nameArr, ageArr, genderArr);

        } catch (IOException ex) {
            System.err.println("Error reading file: " + ex.getMessage());
        }
    }

    public static void sortIndexByName(int[] index, String[] name) {
        for (int i = 0; i < index.length; i++) {
            for (int j = 0; j < index.length - i - 1; j++) {
                if (name[index[j]].compareTo(name[index[j + 1]]) > 0) {
                    int tmp = index[j];
                    index[j] = index[j + 1];
                    index[j + 1] = tmp;
                }
            }
        }
    }

    public static void prettyPrint(int[] index, String[] name, int[] age, char[] gender) {
        final String FORMAT = " | %13s  | %4s | %7s |\n";
        String line = "-".repeat(33);

        System.out.println(line);
        System.out.printf(FORMAT, "Name", "Age", "Gender");
        System.out.println(line);
        for (int i : index) {
            System.out.printf(FORMAT, name[i], age[i], gender[i]);
        }
        System.out.println(line);
    }
}
