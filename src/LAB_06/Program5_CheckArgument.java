class CheckArgument extends Exception {
    public String toString() {
        return "CheckArgument";
    }
}

public class Program5_CheckArgument {
    public static void main(String[] args) {

        try {
            if (args.length < 4)
                throw new CheckArgument();

            int sum = 0;
            for (int i = 0; i < 4; i++) {
                int num = Integer.parseInt(args[i]);
                sum += num * num;
            }

            System.out.println(sum);
        }
        catch (CheckArgument e) {
            System.out.println("Exception occurred - " + e);
        }
    }
}