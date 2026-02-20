import java.util.*;

public class StringOperations {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // i) Change case
        System.out.print("Enter a String : ");
        String str = sc.nextLine();

        String changedCase = "";
        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c))
                changedCase += Character.toLowerCase(c);
            else
                changedCase += Character.toUpperCase(c);
        }
        System.out.println("The string after changing the case is " + changedCase);

        // ii) Reverse string
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println("The string after reversing is " + reversed);


        // iii) Compare two strings
        System.out.print("Enter the second string for comparision : ");
        String str2 = sc.nextLine();
        int diff = str.compareTo(str2);
        System.out.println("The difference between ASCII value is " + diff);


        // iv) Insert one string into another
        System.out.print("Enter the string to be inserted into first string : ");
        String insert = sc.nextLine();
        String inserted = str + " " + insert;
        System.out.println("The string after insertion is : " + inserted);


        // v) Convert to upper & lower case
        System.out.print("Enter a String : ");
        String str3 = sc.nextLine();
        System.out.println("Uppercase: " + str3.toUpperCase());
        System.out.println("Lowercase: " + str3.toLowerCase());


        // vi) Check character position
        System.out.print("Enter a String : ");
        String str4 = sc.nextLine();
        System.out.print("Enter a character : ");
        char ch = sc.next().charAt(0);

        int pos = str4.indexOf(ch);
        if (pos != -1)
            System.out.println("Position of entered character: " + pos);
        else
            System.out.println("Entered character is not present");


        sc.nextLine(); // clear buffer

        // vii) Palindrome check
        System.out.print("Enter a String : ");
        String str5 = sc.nextLine();

        String rev = new StringBuilder(str5).reverse().toString();
        if (str5.equals(rev))
            System.out.println("Entered string is palindrome");
        else
            System.out.println("Entered string is not a palindrome");


        // viii) Words, vowels, consonants
        System.out.print("Enter a String : ");
        String str6 = sc.nextLine();

        int words = str6.trim().split("\\s+").length;
        int vowels = 0, consonants = 0;

        for (char c : str6.toLowerCase().toCharArray()) {
            if (Character.isLetter(c)) {
                if ("aeiou".indexOf(c) != -1)
                    vowels++;
                else
                    consonants++;
            }
        }

        System.out.println("No. of words: " + words);
        System.out.println("No. of vowels: " + vowels);
        System.out.println("No. of consonants: " + consonants);
    }
}