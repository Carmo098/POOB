import java.time.LocalDate;
import java.util.TreeMap;

public class ECISanitas {
    private TreeMap<String, Patient> patients;
    private TreeMap<String, Hospital> hospitals;


    /**
     * Obtiene al objeto paciente según su Id
     * @param patientId Id del paciente
     * @return Patient, paciente
     */
    private Patient getPatient(String patientId) {
        return patients.get(patientId);
    }

    /**
     * Retorna el objeto hospital según su nombre
     * @param hospitalName Nombre del hospital
     * @return Hospital, hospital
     */
    private Hospital getHospital(String hospitalName) {
        return hospitals.get(hospitalName);

    }

    /**
     * Permite agendar una cita requerida por un paciente
     * @param patientId Id del paciente
     * @param hospitalName Nombre del paciente
     * @param requestedSpeciality Especialidad requerida
     * @param date Fecha de la cita
     * @param timeSlot Hora de la cita
     */
    public void scheduleAppointment(String patientId, String hospitalName, String requestedSpeciality, LocalDate date, int timeSlot) {
        Patient p = getPatient(patientId);
        Hospital h = getHospital(hospitalName);

        if (!p.equals(null) && !h.equals(null)) {
            h.createAppoinment(p, requestedSpeciality, date, timeSlot);
        }

    }
}

