//JFM1T3_Assignment5:
/*
1.Write a program to initialize a boolean variable and print it's opposite value on console.

  Sample Input:true

  Expected Output:false

*/

//import statements for java program to read inputs using Scanner class
import java.util.Scanner;

public class BooleanOperation {

    public static void main(String[] args) {

        /*Use the scanner class to provide input at execution time using scanner object*/
        Scanner sc=new Scanner(System.in);

        /*Take input from user*/
        System.out.println("Enter x as boolean value(true/false): ");
        boolean x=sc.nextBoolean();
        System.out.println("Enter y as boolean value(true/false): ");
        boolean y=sc.nextBoolean();
        
        System.out.print("x&&y is: ");
        System.out.println(x&&y);
        System.out.print("x||y is: ");
        System.out.println(x||y);
        System.out.print("!x is: ");
        System.out.println(!x);
        System.out.print("!y is: ");
        System.out.println(!y);
        //print apppropriate result for boolean operations

    }
}

