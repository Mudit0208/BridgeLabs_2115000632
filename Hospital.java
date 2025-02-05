import java.util.ArrayList;
import java.util.List;

class Doctor {
    private String name;
    private String specialty;
    private List<Patient> patients;

    // Constructor
    public Doctor(String name, String specialty) {
        this.name = name;
        this.specialty = specialty;
        this.patients = new ArrayList<>();
    }

    // Method to consult a patient
    public void consult(Patient patient) {
        System.out.println("Dr. " + name + " (" + specialty + ") is consulting " + patient.getName() + "...");
        patient.receiveConsultation(this);
    }

    // Method to add a patient to the doctor's list of patients
    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    // Getters for name and specialty
    public String getName() {
        return name;
    }

    public String getSpecialty() {
        return specialty;
    }

    // Getter for patients
    public List<Patient> getPatients() {
        return patients;
    }
}

class Patient {
    private String name;
    private int age;
    private List<Doctor> doctors;

    // Constructor
    public Patient(String name, int age) {
        this.name = name;
        this.age = age;
        this.doctors = new ArrayList<>();
    }

    // Method to receive consultation from a doctor
    public void receiveConsultation(Doctor doctor) {
        System.out.println("Patient " + name + " is being examined by Dr. " + doctor.getName() + ".");
    }

    // Method to add a doctor to the patient's list of doctors
    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    // Getters for name and age
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Getter for doctors
    public List<Doctor> getDoctors() {
        return doctors;
    }
}

public class Hospital {
    public static void main(String[] args) {
        // Creating doctors
        Doctor doctor1 = new Doctor("John Smith", "Cardiologist");
        Doctor doctor2 = new Doctor("Emily Davis", "Dermatologist");

        // Creating patients
        Patient patient1 = new Patient("Alice", 30);
        Patient patient2 = new Patient("Bob", 45);

        // Adding patients to doctors
        doctor1.addPatient(patient1);
        doctor1.addPatient(patient2);
        doctor2.addPatient(patient1);

        // Adding doctors to patients
        patient1.addDoctor(doctor1);
        patient1.addDoctor(doctor2);
        patient2.addDoctor(doctor1);

        // Simulating consultations
        doctor1.consult(patient1);
        doctor2.consult(patient1);
        doctor1.consult(patient2);
    }
}
