import java.time.LocalDate;

public class Doctor {
	private String id;
	private String name;
	private String specialty;
	private String phone;
	private Office office;
	private boolean isAvailable = true;

	/**
	 * Retorna la especialidad del doctor
	 * @return String, la especialidad del doctor
	 */
	public String getSpecialty() {
		return this.specialty;
	}

	/**
	 * Retorna si el doctor se encuentra disponible
	 * @param date fecha de la cita
	 * @param timeSlot hora de la cita
	 * @return boolean
	 */
	public boolean isAvailable(LocalDate date, int timeSlot) {
		return this.isAvailable;
	}


	/**
	 * Retorna la oficina del doctor
	 * @return Office, oficina del doctor
	 */
	public Office getOffice() {
		return this.office;
	}
}
