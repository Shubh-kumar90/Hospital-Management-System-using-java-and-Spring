package controller;

import service.AppointmentService;
import java.util.Scanner;

public class AppointmentController {

    private AppointmentService service;
    private Scanner sc = new Scanner(System.in);

    public AppointmentController(AppointmentService service) {
        this.service = service;
    }

    public void bookAppointment() {
        System.out.print("Enter Appointment ID: ");
        int id = sc.nextInt();

        System.out.print("Enter Patient ID: ");
        int pid = sc.nextInt();

        System.out.print("Enter Doctor ID: ");
        int did = sc.nextInt();

        service.bookAppointment(id, pid, did);
    }

    public void viewAppointments() {
        service.viewAppointments();
    }
}