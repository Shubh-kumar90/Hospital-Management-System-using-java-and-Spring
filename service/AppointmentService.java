package service;

import model.Appointment;
import repository.AppointmentRepository;
import repository.PatientRepository;

import java.util.*;

public class AppointmentService {
    private AppointmentRepository appointmentRepo;
private PatientRepository patientRepo;

public AppointmentService(AppointmentRepository appointmentRepo,
                          PatientRepository patientRepo) {
    this.appointmentRepo = appointmentRepo;
    this.patientRepo = patientRepo;
}

    private List<Appointment> appointments = new ArrayList<>();

    public void bookAppointment(Appointment appointment) {
        appointments.add(appointment);
        System.out.println("Appointment booked!");
    }

    public void viewAppointments() {
        for (Appointment a : appointments) {
            System.out.println("Patient: " + a.getPatientId() +
                               " Doctor: " + a.getDoctorId());
        }
    }
}