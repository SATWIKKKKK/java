import java.util.Scanner;

public class name{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        System.out.print("Enter First Name:");
        String firstName = sc.nextLine();

        System.out.print("Enter Last Name:");
        String lastName = sc.nextLine();

        System.out.println(firstName + "" + lastName);
    }
}
