class Patient {
    static String hospitalName = "XYZ Hospital";
    static int totalPatients = 0;

    final String patientID;
    String name;
    int age;
    String ailment;

    public Patient(String name, int age, String ailment, String patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;
    }

    public static int getTotalPatients() {
        return totalPatients;
    }

    public void displayPatientDetails() {
        if (this instanceof Patient) {
            System.out.println("Hospital: " + hospitalName);
            System.out.println("Patient ID: " + patientID);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
        }
    }

    public static void main(String[] args) {
        Patient patient1 = new Patient("John Doe", 30, "Flu", "P001");
        patient1.displayPatientDetails();

        Patient patient2 = new Patient("Jane Smith", 45, "Broken Leg", "P002");
        patient2.displayPatientDetails();

        System.out.println("Total Patients: " + Patient.getTotalPatients());
    }
}
