package lab10q4;

import java.io.*;
import java.util.*;

interface Searchable {
    boolean search(String dateStart, String dateEnd);
}

class Appointment implements Searchable {
    private final List<String> appointments = new ArrayList<>();
    private final String fileName = "appointments.txt";

    public Appointment() {
        loadAppointmentsFromFile();
    }

    @Override
    public boolean search(String dateStart, String dateEnd) {
        String newAppointment = dateStart + " to " + dateEnd;
        return !appointments.contains(newAppointment);
    }

    public void addAppointment(String dateStart, String dateEnd) {
        if (isValidDateTime(dateStart) && isValidDateTime(dateEnd)) {
            if (search(dateStart, dateEnd)) {
                String appointment = dateStart + " to " + dateEnd;
                appointments.add(appointment);
                try {
                    saveToFile(appointment);
                    System.out.println("Appointment added: " + appointment);
                } catch (IOException e) {
                    System.err.println("Error saving appointment to file: " + e.getMessage());
                }
            } else {
                System.out.println("Appointment conflict detected. Cannot add.");
            }
        } else {
            System.out.println("Invalid date/time format. Use 'YYYY-MM-DD HH:mm'.");
        }
    }

    private void saveToFile(String appointment) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            writer.write(appointment);
            writer.newLine();
        }
    }

    private void loadAppointmentsFromFile() {
        File file = new File(fileName);
        if (file.exists()) {
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    appointments.add(line.trim());
                }
            } catch (IOException e) {
                System.err.println("Error loading appointments: " + e.getMessage());
            }
        }
    }

    private boolean isValidDateTime(String dateTime) {
        return dateTime.matches("\\d{4}-\\d{2}-\\d{2} \\d{2}:\\d{2}");
    }
}

public class LAB10Q4 {
    public static void main(String[] args) {
        Appointment appointment = new Appointment();

        // Test Cases
        appointment.addAppointment("2025-01-01 10:00", "2025-01-01 12:00");
        appointment.addAppointment("2025-01-01 10:00", "2025-01-01 12:00"); // Conflict
        appointment.addAppointment("2025-01-01 13:00", "2025-01-01 14:00");
        appointment.addAppointment("2025-01-01 15:00", "invalid-time"); // Invalid format
    }
}
