import java.util.Scanner;   // Import scanner for user input Value.

public class Number_Identifier // Class
{
    public static void main(String [] args) // Java main method
    {   // Create an object "scanner" inside class + inside main method
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please press any key:- ");  // Print statement
        char a = scanner.next().charAt(0);  // defining a variable for switch expression
        switch (a) // switch expression
        {   // case Statement for number
            case'0':case '1': case '2': case '3': case '4': case '5': case '6': case '7': case '8': case '9':
            System.out.println("Press key is number " + a + "."); // String Concatenation
        break; // break the line
            default:  // default case statement

            System.out.println("Not allowed");  // print statement


        }
    }
}
