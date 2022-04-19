import java.util.Scanner;
  class Voting
    {
      public static void main(String args[])
      {
        int age;
        System.out.println("enter the age of person");
        Scanner vt = new Scanner(System.in);
        age = vt.nextInt();
        if(age>=18)
        {
          System.out.println("the person is eligible to vote");
        }
        else
        {
          System.out.println("the person is not eligible to vote");
        }
      }
    }