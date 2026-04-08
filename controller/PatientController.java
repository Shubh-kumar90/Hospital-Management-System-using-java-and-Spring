package controller;

import service.PatientService;
import java.util.Scanner;

public class PatientController {

    private PatientService service;
    private Scanner sc = new Scanner(System.in);

    public PatientController(PatientService service) {
        this.service = service;
    }

    public void addPatient() {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();

        System.out.print("Enter Name: ");
        String name = sc.next();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        service.addPatient(id, name, age);
    }

    public void viewPatients() {
        service.viewPatients();
    }
}