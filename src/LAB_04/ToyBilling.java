import java.util.Scanner;

public class ToyBilling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many toys you want to accept? ");
        int n = sc.nextInt();
        sc.nextLine();

        int[] toyId = new int[n];
        String[] toyName = new String[n];
        int[] quantity = new int[n];
        double[] price = new double[n];

        double grandTotal = 0;


        for (int i = 0; i < n; i++) {
            System.out.println("\n Enter details of Toy " + (i + 1));

            System.out.print("Toy ID: ");
            toyId[i] = sc.nextInt();
            sc.nextLine();

            System.out.print("Toy Name: ");
            toyName[i] = sc.nextLine();

            System.out.print("Toy Quantity: ");
            quantity[i] = sc.nextInt();

            System.out.print("Toy Price: ");
            price[i] = sc.nextDouble();

            grandTotal += quantity[i] * price[i];
        }


        System.out.println("\n TOY DETAILS");
        for (int i = 0; i < n; i++) {
            System.out.println("\nToy " + (i + 1) + ":");
            System.out.println("ID: " + toyId[i]);
            System.out.println("Name: " + toyName[i]);
            System.out.println("Quantity: " + quantity[i]);
            System.out.println("Price: " + price[i]);
            System.out.println("Total Amount: " + (quantity[i] * price[i]));
        }

        System.out.println("\nGrand Total Billing Amount: " + grandTotal);
    }
}
