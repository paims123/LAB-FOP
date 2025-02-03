package lab9q3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class PersonProfile {
    protected String name;
    protected String gender;
    protected String dob;

    public PersonProfile(String name, String gender, String dob) {
        this.name = name;
        this.gender = gender;
        this.dob = dob;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Date of Birth: " + dob);
    }
}

class Lecturer extends PersonProfile {
    private String[][] courses;
    private double[] updatedCreditHours;

    public Lecturer(String name, String gender, String dob, String courseFile) throws IOException {
        super(name, gender, dob);
        loadCourses(courseFile);
    }

    public void loadCourses(String filename) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        String line;
        int courseCount = 0;
        while ((line = reader.readLine()) != null) {
            courseCount++;
        }
        reader.close();

        courses = new String[courseCount][6];
        updatedCreditHours = new double[courseCount];

        reader = new BufferedReader(new FileReader(filename));
        int index = 0;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(",");
            for (int i = 0; i < 6; i++) {
                courses[index][i] = parts[i];
            }
            updatedCreditHours[index] = computeCreditHour(Double.parseDouble(parts[4]), Integer.parseInt(parts[5]));
            index++;
        }
        reader.close();
    }

    public double computeCreditHour(double creditHour, int numStudents) {
        if (numStudents >= 150) return creditHour * 3;
        if (numStudents >= 100) return creditHour * 2;
        if (numStudents >= 50) return creditHour * 1.5;
        return creditHour;
    }

    public void display() {
        super.display();
        System.out.println("Courses:");
        for (int i = 0; i < courses.length; i++) {
            System.out.printf("Course: %s, Code: %s, Credit Hour: %.2f\n", courses[i][0], courses[i][1], updatedCreditHours[i]);
        }
    }
}

public class LAB9Q3 {

    public static void main(String[] args) {
         try {
            Lecturer lecturer = new Lecturer("Dr. Smith", "Female", "15/05/1980", "lecturer.txt");
            lecturer.display();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}