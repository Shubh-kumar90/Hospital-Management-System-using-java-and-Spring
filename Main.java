import controller.*;
import service.*;
import repository.*;
import util.DBConnection;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Singleton DB connection
        DBConnection.getInstance();

        // Repositories
        PatientRepository patientRepo = new PatientRepository();
        AppointmentRepository appointmentRepo = new AppointmentRepository();

        // Services
        PatientService patientService = new PatientService(patientRepo);
        AppointmentService appointmentService =
                new AppointmentService(appointmentRepo, patientRepo);

        // Controllers
        PatientController patientController = new PatientController(patientService);
        AppointmentController appointmentController = new AppointmentController(appointmentService);

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== Hospital Management System =====");
            System.out.println("1. Add Patient");
            System.out.println("2. View Patients");
            System.out.println("3. Book Appointment");
            System.out.println("4. View Appointments");
            System.out.println("5. Exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    patientController.addPatient();
                    break;
                case 2:
                    patientController.viewPatients();
                    break;
                case 3:
                    appointmentController.bookAppointment();
                    break;
                case 4:
                    appointmentController.viewAppointments();
                    break;
                case 5:
                    System.exit(0);
            }
        }
    }
}