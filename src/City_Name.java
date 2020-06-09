import java.util.Scanner;       // Import scanner for user input Value.

public class City_Name  // Class
{
    public static void main(String []args)      // Java main Method
    {
        Scanner scanner=new Scanner(System.in); // Create an Object "scanner" in class
        System.out.print("Please Enter Alphabet From a to f:- ");   // Print Statement
        char ch= scanner.next().charAt(0); // Defining an "ch" Variable for character
        switch (ch)     //Switch expression
        {
            case 'a':   // code to be executed
            System.out.println(ch + " = " +"Ahmedabad");    // String Concatenation
        break;
            case 'b':   // code to be executed
            System.out.println(ch + " = " +"Bhavnagar");     // String Concatenation
        break;

            case'c':    // code to be executed
            System.out.println(ch + " = " +"Champaner");     // String Concatenation
        break;
            case'd':    // code to be executed
                System.out.println(ch + " = " +"Dwarka");    // String Concatenation
        break;
            case 'e':   // code to be executed
                System.out.println(ch + " = " +"Ellora");    // String Concatenation
        break;
            case 'f':   // code to be executed
                System.out.println(ch + " = " +"Fort Kochi");    // String Concatenation
        break;
            default:    // default  case statement
                System.out.println(ch + " = " +"Invalid entry");
        }
    }
}
