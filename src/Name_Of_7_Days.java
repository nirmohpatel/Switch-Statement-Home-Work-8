import java.util.Scanner;   // Import scanner for user input Value.

public class Name_Of_7_Days     // Class
{
    public static void main(String []args)  // Java Main method
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter Number From 1 to 7:- "); // Print out statement
        char ch= scanner.next().charAt(0);  // Defining an "ch" Variable for character
        switch (ch) // Switch expression
        {
            case '1':  // code to be executed

            System.out.println("Day" + ch + " = " +"Sunday");   // Print out statement
        break;
            case '2':    // code to be executed

            System.out.println("Day" + ch + " = " +"Monday");  // Print out statement
                break;
            case '3':    // code to be executed

            System.out.println("Day" +ch + " = " +"Tuesday"); // Print out statement
        break;
            case '4':    // code to be executed

            System.out.println("Day" + ch + " = " +"Wednesday"); // Print out statement
        break;

            case '5':   // code to be executed

            System.out.println("Day" + ch + " = " +"Thursday");   // Print out statement
        break;

            case '6':  // code to be executed

            System.out.println("Day" + ch + " = " +"Friday"); // Print out statement
        break;

            case '7':   // code to be executed
                                                                 // Print out statement
            System.out.println("Day" + ch + " = " +"Saturday");
            break;
            default: // default  case statement
                System.out.println("Day" + ch + " = " +"Invalid choice");

        }
    }
}
