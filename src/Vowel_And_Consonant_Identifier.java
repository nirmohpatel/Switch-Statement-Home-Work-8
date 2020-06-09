import java.util.Scanner;  // Import scanner for user input Value.

public class Vowel_And_Consonant_Identifier // class
{
    public static void main(String []args) // Java main method
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter Single character from Alphabet:- "); // print Statement
        char ch= scanner.next().charAt(0);  // Defining a ch variable
        switch (ch) // switch expression
        {       // case Statement for Vowel character
            case'a': case 'e': case 'i': case 'o': case'u': case'A': case 'E': case 'I': case 'O': case'U': // If - else  Statement with Logical Operators

            System.out.println("Input Character is Vowel");  // Statement will print when enter character is Vowel
            break; // break the case

            default:    // default case statement
            System.out.println("Input Character is Consonant");  // Statement will print when enter character is Consonant
        }
    }
}
