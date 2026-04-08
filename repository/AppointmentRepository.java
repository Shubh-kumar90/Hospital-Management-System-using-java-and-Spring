package repository;

import model.Appointment;
import java.util.*;

public class AppointmentRepository {

    private List<Appointment> appointments = new ArrayList<>();

    public void save(Appointment appointment) {
        appointments.add(appointment);
    }

    public List<Appointment> findAll() {
        return appointments;
    }
}