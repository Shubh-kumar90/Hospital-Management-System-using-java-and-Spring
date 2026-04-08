package service;

import model.Patient;
import repository.PatientRepository;

import java.util.*;

public class PatientService {
    private PatientRepository repository;

public PatientService(PatientRepository repository) {
    this.repository = repository;
}

    private List<Patient> patients = new ArrayList<>();

    public void addPatient(int id, String name, int age) {

    if (age <= 0) {
        System.out.println("❌ Invalid age!");
        return;
    }

    Patient patient = new Patient(id, name, age);
    repository.save(patient);

    System.out.println("✅ Patient added successfully!");
}

    public void viewPatients() {
        for (Patient p : patients) {
            System.out.println(p.getId() + " " + p.getName());
        }
    }
}