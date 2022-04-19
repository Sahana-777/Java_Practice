import java.util.Scanner;

 class OnetoN
{
	public static void main(String[] args)
	{
		
		int i =1;

		
		Scanner Sc = new Scanner(System.in);

		
		System.out.print("Enter the value n : ");

		
		int n = Sc.nextInt();

		System.out.print("Numbers are : ");

		while(i<=n)
		{
			System.out.println(i);
			i++;
		}
	}
}