class Student {
    // Static variable shared across all students
    static String universityName = "Global University";
    private static int totalStudents = 0;

    // Final variable to ensure unique roll number
    private final int rollNumber;
    private String name;
    private char grade;

    // Constructor using 'this' keyword
    public Student(int rollNumber, String name, char grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.grade = grade;
        totalStudents++;
    }

    // Static method to display total students
    public static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }

    // Method to display student details (checks instanceof)
    public void displayDetails() {
        if (this instanceof Student) {
            System.out.println("======= Student Details =======");
            System.out.println("University: " + universityName);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Name: " + name);
            System.out.println("Grade: " + grade);
        }
    }

    // Method to update grade with instanceof check
    public void updateGrade(char newGrade) {
        if (this instanceof Student) {
            this.grade = newGrade;
            System.out.println("Grade updated for " + name + " to " + newGrade);
        }
    }

    public static void main(String[] args) {
        // Creating student objects
        Student s1 = new Student(101, "Nikhil", 'A');
        Student s2 = new Student(102, "Om garg", 'B');

        // Displaying student details
        s1.displayDetails();
        s2.displayDetails();

        // Display total students
        Student.displayTotalStudents();

        // Updating grade
        s2.updateGrade('A');

        // Display updated details
        s2.displayDetails();
    }
}
