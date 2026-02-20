public class Program2_ArithmeticException {
    public static void main(String[] args) {

        int a = 10, b = 0;

        try {
            int result = a / b;
        }
        catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught by try-catch-finally block");
        }
        finally {
            System.out.println("Finally block executed");
        }
    }
}