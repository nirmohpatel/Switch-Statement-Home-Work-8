import java.util.Scanner;   // Import scanner for user input Value.

public class Greatest_Number // Class
{
        public static void main (String[]args)      // Java main Method
        {
            Scanner scanner = new Scanner(System.in); // Create an Object "scanner" in class
            System.out.print("Please Enter first number :- ");   // Print Statement
            double num1 = scanner.nextDouble();     //Defining first value Variable
            System.out.print("Please Enter Second number :- ");
            double num2 = scanner.nextDouble(); //Defining second value Variable
            System.out.print("Please Enter Third number :- ");   // Print Statement
            double num3 = scanner.nextDouble();     //Defining Third value Variable
            System.out.print("Please Enter largest number :- " + Math.max(num1,Math.max(num2,num3)));
        }                           // System out largest value equation

}