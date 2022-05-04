import java.util.*;
class PalindromeOfString
  {
    public static void main(String args[])
    {
      String rev="";
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter any String:");
      String str =sc.nextLine();
      
      int i;
      for( i=str.length()-1; i>=0; i--)
        {
          rev=rev+str.charAt(i);
          }        
      System.out.println(rev);
      if(str.equals(rev))
      {
        System.out.println("The given string is a Palindrome");
      }
      else
      {
        System.out.println("The given string is not a Palndrome");
      }
    }
  }
  