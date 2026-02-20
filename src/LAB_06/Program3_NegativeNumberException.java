import java.util.*;

class NegativeNumberException extends Exception {
    public String toString() {
        return "NegativeNumberException: number should be positive";
    }
}

public class Program3_NegativeNumberException {

    static void ProcessInput(int num) throws NegativeNumberException {
        if (num < 0)
            throw new NegativeNumberException();
        else
            System.out.println("Double value: " + (2 * num));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        try {
            ProcessInput(n);
        }
        catch (NegativeNumberException e) {
            System.out.println("Caught the exception");
            System.out.println("Exception occurred: " + e);
        }
    }
}