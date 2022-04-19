import java.util.Scanner;
  class Scan_Add
    {
      public static void main (String args[])
      {
        int a,b;
        System.out.println("enter the values of a,b:");
        Scanner ad=new Scanner(System.in);
        a=ad.nextInt();
        b=ad.nextInt();
       int c=a+b;
        System.out.println(c);
        
      }
    }