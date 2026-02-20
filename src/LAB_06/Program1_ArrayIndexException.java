import java.util.*;

public class Program1_ArrayIndexException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[4]; // size = 4

        try {
            System.out.println("Enter 5 numbers:");
            for (int i = 0; i < 5; i++)  // will cause exception at index 4
                arr[i] = sc.nextInt();
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }
}