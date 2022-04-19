import java.util.Scanner;
  class Even_Odd
    {
      public static void main(String args[])
      {
        int n;
        System.out.println("enter the n value");
        Scanner eo = new Scanner(System.in);
        n =eo.nextInt();
        if(n%2==0)
        {
          System.out.println("even");
        }
        else
        {
          System.out.println("odd");
        }
      }
    }