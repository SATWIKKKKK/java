package General;

public class employee {
    protected int empid;
    private String ename;

    // Method to accept employee details
    public void getData(int id, String name) {
        empid = id;
        ename = name;
    }

    // Method to calculate earnings
    public double earnings(double basic) {
        double da = 0.80 * basic;
        double hra = 0.15 * basic;
        return basic + da + hra;
    }
}