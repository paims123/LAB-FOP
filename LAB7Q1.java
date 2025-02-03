package lab7q1;

import java.io.*;
import java.util.*;

class Generator {
    static String COURSE_FILE = "courseFile.txt"; // Specify a valid file path
}

public class LAB7Q1 {

    public static void main(String[] args) {
        Map<String, String> courseList = getCourseList(Generator.COURSE_FILE);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the course code (enter q to quit): ");
            String courseCode = scanner.nextLine();

            if (courseCode.equalsIgnoreCase("q")) break;

            if (courseList.containsKey(courseCode)) {
                System.out.printf("Course Code: %s\nCourse Name: %s\n\n", courseCode, courseList.get(courseCode));
            } else {
                System.out.println("The course doesn't exist.\n");
            }
        }
        scanner.close();
    }

    public static Map<String, String> getCourseList(String fromFile) {
        var courseList = new HashMap<String, String>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fromFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] courseInfo = line.split(","); // Assumes CSV format: code,name
                if (courseInfo.length == 2) {
                    courseList.put(courseInfo[0].trim(), courseInfo[1].trim());
                }
            }
        } catch (IOException ex) {
            System.err.println("Error reading file: " + ex.getMessage());
        }
        return courseList;
    }
}
