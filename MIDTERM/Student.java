import java.util.Scanner;

public class Student {
    String firstName;
    String middleName;
    String lastName;
    String suffix;

    public Student(String firstName, String middleName, String lastName, String suffix) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.suffix = suffix;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public String getFullName() {
        String fullName = firstName;

        if (middleName != null && !middleName.isEmpty()) {
            fullName += " " + middleName;
        }

        fullName += " " + lastName;

        if (suffix != null && !suffix.isEmpty()) {
            fullName += " " + suffix;
        }

        return fullName;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter middle name (or leave blank): ");
        String middleName = scanner.nextLine();

        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter suffix (or leave blank): ");
        String suffix = scanner.nextLine();

        Student student = new Student(firstName, middleName, lastName, suffix);

        System.out.println("\nFirst Name: " + student.getFirstName());
        System.out.println("Middle Name: " + student.getMiddleName());
        System.out.println("Last Name: " + student.getLastName());
        System.out.println("Suffix: " + student.getSuffix());
        System.out.println("\nFull Name: " + student.getFullName());

    }
}
