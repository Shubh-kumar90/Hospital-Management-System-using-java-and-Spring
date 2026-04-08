package repository;

import model.Patient;
import java.util.*;

public class PatientRepository {

    private List<Patient> patients = new ArrayList<>();

    public void save(Patient patient) {
        patients.add(patient);
    }

    public List<Patient> findAll() {
        return patients;
    }

    public Patient findById(int id) {
        for (Patient p : patients) {
            if (p.getId() == id) return p;
        }
        return null;
    }
}