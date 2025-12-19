import java.util.Scanner;

class Student {
    int roll;
    String name;
    double cgpa;

    // Method to read student details
    void read(Scanner sc) {
        System.out.print("Enter Roll No: ");
        roll = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter CGPA: ");
        cgpa = sc.nextDouble();
    }

    // Method to display student details
    void display() {
        System.out.println(roll + "\t" + name + "\t" + cgpa);
    }
}

public class StudentDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        Student[] s = new Student[n];

        // Input
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of Student " + (i + 1));
            s[i] = new Student();
            s[i].read(sc);
        }

        // Display all students
        System.out.println("\nRoll\tName\tCGPA");
        for (int i = 0; i < n; i++) {
            s[i].display();
        }

        // Find student with lowest CGPA
        int minIndex = 0;
        for (int i = 1; i < n; i++) {
            if (s[i].cgpa < s[minIndex].cgpa) {
                minIndex = i;
            }
        }

        System.out.println("\nStudent with lowest CGPA: " + s[minIndex].name);

        sc.close();
    }
}
