import java.util.Scanner;   // Import scanner for user input Value.

public class Calculator // Class
{
        public static void main(String [] args)     // Java main method
        {
            Scanner scanner = new Scanner(System.in);   // Create an object "scanner" in class
            System.out.print("Please enter Operator ( +, - , / , *,) :- ");   // Print Statement
            //all mathematical Operator come under Character
            char operator = scanner.next().charAt(0); // local variable, to input Operator
            System.out.print("Enter any First number :- ");   // Print Statement
            double num1 = scanner.nextDouble();   // local variable, To input First number
            System.out.print("Enter second number :- ");    // Print Statement
            double num2 = scanner.nextDouble();   // local variable, To input second number
			
			

                switch (operator) // Switch expression
                {
                    case '+':   // Case Statement
                                                                                   // String Concatenation
                System.out.println("addition of First and Second number " + num1 + '+' + num2 + " = " + (num1 + num2));
            break;
                    case '-':   // Case statement
                                                                                    // String Concatenation
                System.out.println("Subtraction of First and Second number " + num1 + '-' + num2 + '=' + (num1 - num2));
            break;
                    case  '/':  // Case statement
                                                                  // String Concatenation
                System.out.println("Division of First and Second number " + num1 + '/' + num2 + '=' + (num1 / num2));
                        break;
                case '*':   // Case statement
                                                                          // String Concatenation
                System.out.println("Multiplication of First and Second number " + num1 + '*' + num2 + '=' + (num1 * num2));
            break;
                 }
        }
}
