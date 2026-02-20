import Marketing.sales;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sales s = new sales();

        System.out.println("Enter the employee id and employee name:");
        int id = sc.nextInt();
        String name = sc.next();

        s.getData(id, name);

        System.out.println("Enter the basic salary:");
        double basic = sc.nextDouble();

        double earn = s.earnings(basic);

        System.out.println("The emp id of the employee is " + s.empid);
        System.out.println("The total earning is " + earn);
    }
}