class Patient {
    // Static variable shared among all patients
    static String hospitalName = "City Care Hospital";
    private static int totalPatients = 0;

    // Final variable for unique patient ID
    private final int patientID;
    private String name;
    private int age;
    private String ailment;

    // Constructor using 'this' keyword
    public Patient(int patientID, String name, int age, String ailment) {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        totalPatients++;
    }

    // Static method to get the total number of patients admitted
    public static void getTotalPatients() {
        System.out.println("Total Patients Admitted: " + totalPatients);
    }

    // Method to display patient details (checks instanceof)
    public void displayDetails() {
        if (this instanceof Patient) {
            System.out.println("======= Patient Details =======");
            System.out.println("Hospital: " + hospitalName);
            System.out.println("Patient ID: " + patientID);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
        }
    }

    public static void main(String[] args) {
        // Creating patient objects
        Patient p1 = new Patient(11, "Nikhil Rawat", 45, "Flu");
        Patient p2 = new Patient(12, "Nikhil Tiwari", 100, "Diabetes");

        // Displaying patient details
        p1.displayDetails();
        p2.displayDetails();

        // Displaying total patients admitted
        Patient.getTotalPatients();
    }
}
