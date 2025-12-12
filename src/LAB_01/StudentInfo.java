//1. Aim of the program -Write a program to print your name, roll no, section and branch in
//separate lines.
//
//Input: Mention Name,Roll no,Section and branch
//Output: Display Name
//Display Roll No
//Display Section
//Display

import java.util.Scanner;

public class StudentInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll No: ");
        String roll = sc.nextLine();

        System.out.print("Enter Section: ");
        String section = sc.nextLine();

        System.out.print("Enter Branch: ");
        String branch = sc.nextLine();

        System.out.println("\n Student Details");
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + roll);
        System.out.println("Section: " + section);
        System.out.println("Branch: " + branch);
    }
}
