package lab9q2;

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

class Student extends PersonProfile {
    private String[][] courses;
    private String[] grades;

    public Student(String name, String gender, String dob, String courseFile) throws IOException {
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

        courses = new String[courseCount][5];
        grades = new String[courseCount];

        reader = new BufferedReader(new FileReader(filename));
        int index = 0;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(",");
            for (int i = 0; i < 5; i++) {
                courses[index][i] = parts[i];
            }
            grades[index] = getGrade(Double.parseDouble(parts[4]));
            index++;
        }
        reader.close();
    }

    public String getGrade(double mark) {
        if (mark >= 85) return "A";
        if (mark >= 75) return "A-";
        if (mark >= 70) return "B+";
        if (mark >= 65) return "B";
        if (mark >= 60) return "B-";
        if (mark >= 55) return "C+";
        if (mark >= 50) return "C";
        if (mark >= 45) return "D";
        if (mark >= 35) return "E";
        return "F";
    }

    public void display() {
        super.display();
        System.out.println("Courses:");
        for (int i = 0; i < courses.length; i++) {
            System.out.printf("Course: %s, Code: %s, Grade: %s\n", courses[i][0], courses[i][1], grades[i]);
        }
    }
}


public class LAB9Q2 {

    public static void main(String[] args) {
        try {
            Student student = new Student("John Doe", "Male", "01/01/2000", "course.txt");
            student.display();
        } catch (IOException e) {
            e.printStackTrace();
            }
    
    }
}    
