interface Motor {
    int capacity = 10;   // data member (constant)

    void run();
    void consume();
}

class WashingMachine implements Motor {

    @Override
    public void run() {
        System.out.println("Washing machine is running...");
    }

    @Override
    public void consume() {
        System.out.println("Washing machine is consuming power...");
    }

    void showCapacity() {
        System.out.println("Capacity of the motor is " + capacity);
    }
}

public class TestMotor {
    public static void main(String[] args) {

        WashingMachine wm = new WashingMachine();

        wm.run();
        wm.consume();
        wm.showCapacity();     // checking interface data member
    }
}
