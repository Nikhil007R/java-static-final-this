class Employee {
    // Static variable shared by all employees
    static String companyName = "TechCorp";
    private static int totalEmployees = 0;

    // Final variable for employee ID
    private final int id;
    private String name;
    private String designation;

    // Constructor using 'this' keyword
    public Employee(int id, String name, String designation) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        totalEmployees++;
    }

    // Static method to display total employees
    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    // Method to display employee details (checks instanceof)
    public void displayDetails() {
        if (this instanceof Employee) {
            System.out.println("======= Employee Details =======");
            System.out.println("Company: " + companyName);
            System.out.println("ID: " + id);
            System.out.println("Name: " + name);
            System.out.println("Designation: " + designation);
        }
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Nikhil ", "Analyst");
        Employee e2 = new Employee(2, "Keshav", "Software developer");

        e1.displayDetails();
        System.out.println();
        e2.displayDetails();

        Employee.displayTotalEmployees();
    }
}
