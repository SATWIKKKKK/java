import java.util.*;

class HrsException extends Exception {
    public String toString() {
        return "InvalidHourException: hour is not greater than 24";
    }
}

class MinException extends Exception {
    public String toString() {
        return "InvalidMinuteException: hour is not greater than 60";
    }
}

class SecException extends Exception {
    public String toString() {
        return "InvalidSecondException: hour is not greater than 60";
    }
}

class Time {
    int h, m, s;

    void inputTime() throws HrsException, MinException, SecException {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter hours: ");
        h = sc.nextInt();
        if (h < 0 || h > 24) throw new HrsException();

        System.out.print("Enter minutes: ");
        m = sc.nextInt();
        if (m < 0 || m > 60) throw new MinException();

        System.out.print("Enter seconds: ");
        s = sc.nextInt();
        if (s < 0 || s > 60) throw new SecException();

        System.out.println("Correct Time-> " + h + ":" + m + ":" + s);
    }
}

public class Program4_TimeException {
    public static void main(String[] args) {
        Time t = new Time();

        try {
            t.inputTime();
        }
        catch (Exception e) {
            System.out.println("Caught the exception");
            System.out.println("Exception occurred: " + e);
        }
    }
}