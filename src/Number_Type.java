import java.util.Scanner;       // Import scanner for user input Value.

public class Number_Type        // Class
{
    public static void main(String []args)      // Java main method
    {
        Scanner scanner = new Scanner(System.in);   // Create an Object " scanner"
        System.out.print("Please Enter Any Number:- "); // Print Statement
        int num1 = scanner.nextInt();// Defining a "num1" Variable for number

        switch (num1>0?1:0)     // Switch expression with Ternary Operators

        {
            case 1: // Case statement will print when enter value is grater then '0'

                System.out.print("Enter Number is Positive Value");
                break;
            case 0:     // Case statement will print when enter value is lass then or equal to '0'

                switch (num1>=0?1:0)        // Switch expression with Ternary Operators

                {
                case 1: // Case statement will print when enter value is equal to '0'

                    System.out.println("Enter Number is Zero Value");   // Print Statement
                break;

                case 0:     // Case statement will print when enter value is lass then to '0'
                    System.out.println("Enter Number is Negative Value");   // Print Statement
                 break;
                 }

            break;

        }
    }
}
