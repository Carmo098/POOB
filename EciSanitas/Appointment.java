import java.time.LocalDate;
import java.util.ArrayList;

public class Appointment {
	private String id;
	private LocalDate fecha;
	private int time;
	private String reason;
	private Doctor doctor;
	private Office office;
	private ArrayList<Treatment> patientTreatments;
	private ArrayList<PatientIllness> patientIllnesses;


	/**
	 * Constructor
	 * @param d Doctor
	 * @param o Oficina
	 * @param date Fecha
	 * @param timeSlot Fecha de la cita
	 */
	public Appointment(Doctor d, Office o, LocalDate date, int timeSlot) {
		this.doctor = d;
		this.office = o;
		this.fecha = date;
		this.time = timeSlot;
	}
}
