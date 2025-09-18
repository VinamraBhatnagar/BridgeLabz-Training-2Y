class Patient {
    static String hospitalName = "City Hospital";
    private static int totalPatients = 0;

    private String name;
    private int age;
    private String ailment;
    private final int patientID;

    public Patient(int patientID, String name, int age, String ailment) {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        totalPatients++;
    }

    public static int getTotalPatients() {
        return totalPatients;
    }

    public void displayInfo() {
        System.out.println("Hospital: " + hospitalName);
        System.out.println("Patient ID: " + patientID);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Ailment: " + ailment);
    }
}

public class HospitalManagement {
    public static void main(String[] args) {
        Patient p1 = new Patient(101, "Alice", 30, "Flu");
        Patient p2 = new Patient(102, "Bob", 45, "Fever");

        if (p1 instanceof Patient) {
            p1.displayInfo();
        }
        System.out.println("----------------");
        if (p2 instanceof Patient) {
            p2.displayInfo();
        }

        System.out.println("\nTotal Patients: " + Patient.getTotalPatients());
    }
}
