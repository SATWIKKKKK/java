abstract class Student {
    int rollNo;
    long regNo;

    void getInput(int rollNo, long regNo) {
        this.rollNo = rollNo;
        this.regNo = regNo;
    }

    abstract void course();
}

class Kiitian extends Student {

    @Override
    void course() {
        System.out.println("Course - B.Tech. (Computer Science & Engg)");
    }

    void display() {
        System.out.println("Rollno - " + rollNo);
        System.out.println("Registration no - " + regNo);
        course();
    }
}

public class Main {
    public static void main(String[] args) {

        Kiitian k = new Kiitian();

        k.getInput(2205180, 1234567890L);

        k.display();
    }
}
