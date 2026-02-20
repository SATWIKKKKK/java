import java.util.Scanner;

public class string {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string:");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();


        System.out.print("Enter first substring: ");
        String sub1 = sc.nextLine();

        System.out.print("Enter second substring: ");
        String sub2 = sc.nextLine();


        boolean found1 = str1.contains(sub1);
        boolean found2 = str2.contains(sub2);

        if (found1 && found2) {
            System.out.println("Both substrings found.");
            String result = sub1 + sub2;
            System.out.println("Concatenated result: " + result);
        } else {
            System.out.println("Not Found.");
        }
    }
}
