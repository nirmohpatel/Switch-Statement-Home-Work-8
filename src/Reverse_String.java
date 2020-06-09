import java.util.Scanner;   // Import scanner for user input Value.

public class Reverse_String // Class
{
    public static void main(String []args)      // Java main Method
    {
        Scanner in = new Scanner (System.in);       // Create an Object " scanner"
        String s; // string variable
        System.out.print(" Please Enter a String :- "); // print statement
        s=in.nextLine(); // store value in s variable
        System.out.println(" your Reverse String is :- " + new StringBuilder(s).reverse().toString());
        // print statement + add string builder + reverse string
    }
}
