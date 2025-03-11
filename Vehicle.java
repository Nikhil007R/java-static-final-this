class Vehicle {
    // Static variable shared by all vehicles
    static double registrationFee = 5000.00; // Default registration fee

    // Final variable for unique registration number
    private final String registrationNumber;
    private String ownerName;
    private String vehicleType;

    // Constructor using 'this' keyword
    public Vehicle(String registrationNumber, String ownerName, String vehicleType) {
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Static method to update registration fee
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("Registration Fee updated to: $" + registrationFee);
    }

    // Method to display vehicle details (checks instanceof)
    public void displayRegistrationDetails() {
        if (this instanceof Vehicle) {
            System.out.println("======= Vehicle Registration Details =======");
            System.out.println("Owner Name: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Registration Fee: $" + registrationFee);
        }
    }

    public static void main(String[] args) {
        // Creating vehicle objects
        Vehicle v1 = new Vehicle("MH12AB1234", "Nikhil ", "Car");
        Vehicle v2 = new Vehicle("DL10XY5678", "Omkar", "Electric Cycle");

        // Displaying vehicle registration details
        v1.displayRegistrationDetails();
        v2.displayRegistrationDetails();

        // Updating registration fee
        Vehicle.updateRegistrationFee(5500.00);

        // Displaying updated details
        v1.displayRegistrationDetails();
        v2.displayRegistrationDetails();
    }
}
