import java.util.Scanner;
class ATM
  {
    int balance;
    //withdraw
    void withdraw(int amt)
      {
      if(balance>amt)
      {
        System.out.println("withdraw succesfull");
      }
      else
      {
        System.out.println("insufficent balance");
      }
        }
      //deposit
    void deposite(int amt)
      {
      balance=balance+amt;
      System.out.println("deposite successfull");
      }
    void checkbalance()
    {
      System.out.println(balance);
    }
  }
    class Bitlabs
      {
        public static void main(String args[])
        {
          Scanner sc=new Scanner(System.in);
          ATM atm=new ATM();
          atm.balance=5000;
          char ch='y';
          do{
            System.out.println("1. withdraw\n 2.Deposite\n 3. Check balance");
            System.out.println("select your option");
            int option =sc.nextInt();
            switch (option)
              {
                case 1:
                System.out.println("enter amount");
                int amount=sc. nextInt();
                atm.withdraw(amount);
                break;
                case 2:
                  System.out.println("enter amount");
                int amount1=sc. nextInt();
                atm.deposite(amount1);
                  break;
                case 3:
                 atm.checkbalance();
                  break;
                default:
                  System.out.println("invalid option");
              }
                  System.out.println("do you want to continue");
                  ch=sc.next().charAt(0);
              }
            while (ch=='y');
          }
      }

            
    
    