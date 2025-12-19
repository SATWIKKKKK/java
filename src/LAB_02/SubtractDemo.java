class Subtraction {

    // Subtract two integers
    void subtract(int a, int b) {
        System.out.println("Subtraction of two integers = " + (a - b));
    }

    // Subtract three integers
    void subtract(int a, int b, int c) {
        System.out.println("Subtraction of three integers = " + (a - b - c));
    }

    // Subtract two double values
    void subtract(double a, double b) {
        System.out.println("Subtraction of two doubles = " + (a - b));
    }
}

public class SubtractDemo {
    public static void main(String[] args) {

        Subtraction s = new Subtraction();

        // Calling overloaded methods
        s.subtract(10, 5);
        s.subtract(20, 5, 3);
        s.subtract(15.5, 4.2);
    }
}
