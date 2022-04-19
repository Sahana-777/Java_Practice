import java.util.Scanner;
class Positive_Negative
  {
    public static void main(String args[])
    {
      int n;
      System.out.println("enter n value");
      Scanner pn=new Scanner(System.in);
      n=pn.nextInt();
      if(n>0)
      {
        System.out.println("the number is positive");
        
      }
      else
      {
        
      System.out.println("it is negative");
      }
        
    }
  }
