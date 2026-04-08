package model;

public class Appointment {
    private int patientId;
    private int doctorId;

    public Appointment(int patientId, int doctorId) {
        this.patientId = patientId;
        this.doctorId = doctorId;
    }

    public int getPatientId() { return patientId; }
    public int getDoctorId() { return doctorId; }
}