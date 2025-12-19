class evenodd {
    public static void main(String[] args) {

        int evenCount = 0, oddCount = 0;

        // Check if exactly 10 numbers are provided
        if (args.length != 10) {
            System.out.println("Please enter exactly 10 numbers.");
            return;
        }

        for (int i = 0; i < 10; i++) {
            int num = Integer.parseInt(args[i]);

            if (num % 2 == 0)
                evenCount++;
            else
                oddCount++;
        }

        System.out.println("Number of Even numbers = " + evenCount);
        System.out.println("Number of Odd numbers  = " + oddCount);
    }
}
