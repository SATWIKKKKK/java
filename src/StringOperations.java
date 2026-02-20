import java.util.Scanner;

public class StringOperations {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // i) Change case of string
        System.out.print("Enter a String : ");
        String str1 = sc.nextLine();

        String changedCase = "";
        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            if (Character.isLowerCase(ch))
                changedCase += Character.toUpperCase(ch);
            else
                changedCase += Character.toLowerCase(ch);
        }
        System.out.println("The string after changing the case is " + changedCase);

        // ii) Reverse the string
        String reversed = "";
        for (int i = str1.length() - 1; i >= 0; i--) {
            reversed += str1.charAt(i);
        }
        System.out.println("The string after reversing is " + reversed);


        // iii) Compare two strings
        System.out.print("Enter the second string for comparision : ");
        String str2 = sc.nextLine();

        int diff = str1.compareTo(str2);
        System.out.println("The difference between ASCII value is " + diff);


        // iv) Insert one string into another
        System.out.print("Enter the string to be inserted into first string : ");
        String insertStr = sc.nextLine();

        String inserted = str1 + " " + insertStr;
        System.out.println("The string after insertion is : " + inserted);


        // v) Convert string to upper and lower case
        System.out.print("Enter a String : ");
        String str3 = sc.nextLine();

        System.out.println("Uppercase: " + str3.toUpperCase());
        System.out.println("Lowercase: " + str3.toLowerCase());


        // vi) Check character present and position
        System.out.print("Enter a String : ");
        String str4 = sc.nextLine();

        System.out.print("Enter a character : ");
        char ch = sc.next().charAt(0);
        sc.nextLine(); // clear buffer

        int position = str4.indexOf(ch);

        if (position != -1)
            System.out.println("Position of entered character: " + position);
        else
            System.out.println("Entered character is not present");


        // vii) Palindrome check
        System.out.print("Enter a String : ");
        String str5 = sc.nextLine();

        String rev = "";
        for (int i = str5.length() - 1; i >= 0; i--) {
            rev += str5.charAt(i);
        }

        if (str5.equalsIgnoreCase(rev))
            System.out.println("Entered string is palindrome");
        else
            System.out.println("Entered string is not a palindrome");


        // viii) Count words, vowels, consonants
        System.out.print("Enter a String : ");
        String str6 = sc.nextLine();

        int words = str6.trim().split("\\s+").length;
        int vowels = 0, consonants = 0;

        str6 = str6.toLowerCase();

        for (int i = 0; i < str6.length(); i++) {
            char c = str6.charAt(i);

            if (c >= 'a' && c <= 'z') {
                if ("aeiou".indexOf(c) != -1)
                    vowels++;
                else
                    consonants++;
            }
        }

        System.out.println("No. of words: " + words);
        System.out.println("No. of vowels: " + vowels);
        System.out.println("No. of consonants: " + consonants);

        sc.close();
    }
}
