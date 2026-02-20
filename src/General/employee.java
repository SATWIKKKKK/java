package General;

public class employee {

    protected int empid;
    private String ename;
    protected double basic;


    public employee(int id, String name, double basicSalary) {
        empid = id;
        ename = name;
        basic = basicSalary;
    }


    public double earnings() {
        double DA = 0.80 * basic;
        double HRA = 0.15 * basic;
        return basic + DA + HRA;
    }
}
