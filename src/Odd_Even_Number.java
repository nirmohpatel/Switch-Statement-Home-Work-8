import java.util.Scanner;

public class Odd_Even_Number {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in); // Create an Object "scanner"
        System.out.print("Please Enter Number:- "); // print statement for user to enter number
        int num1 = scanner.nextInt(); // create a local variable
        switch (num1%2) // switch expression, + equation
        {
            case 0:     // Case statement will print when enter value is even number
                System.out.println("Enter number is Even Number ");
                break;
            case 1:     // Case statement will print when enter value is odd number
                System.out.println("Enter number is odd Number ");
                break;

        }

    }
}
